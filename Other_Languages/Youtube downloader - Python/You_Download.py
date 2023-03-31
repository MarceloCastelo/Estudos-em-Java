import tkinter as tk
from tkinter import filedialog
from tkinter import messagebox
from pytube import YouTube

# Crie a janela principal
window = tk.Tk()
window.title("YouTube Downloader")

# Crie um rótulo para exibir instruções
label = tk.Label(text="Insira o link do vídeo do YouTube:")
label.pack()

# Crie uma caixa de entrada de texto para o usuário inserir o link do vídeo
link_entry = tk.Entry()
link_entry.pack()

# Crie uma função para baixar o vídeo quando o botão é clicado
def download_video():
    # Obtenha o link do vídeo do campo de entrada de texto
    url = link_entry.get()

    # Verifique se o usuário forneceu um link válido
    if not url:
        messagebox.showerror("Erro", "Por favor, insira um link válido do YouTube")
        return
    
    # Crie um objeto YouTube para o URL fornecido
    yt = YouTube(url)

    # Obtenha o primeiro stream de áudio disponível
    audio_stream = yt.streams.filter(only_audio=True).first()

    # Mostre uma caixa de diálogo para que o usuário escolha onde salvar o arquivo
    file_path = filedialog.asksaveasfilename(defaultextension=".mp3", filetypes=[("MP3 File", "*.mp3")])

    # Baixe o stream de áudio para o caminho escolhido pelo usuário
    audio_stream.download(file_path)

# Crie um botão para iniciar o download do vídeo
download_button = tk.Button(text="Download", command=download_video)
download_button.pack()

# Inicie o loop principal da GUI
window.mainloop()