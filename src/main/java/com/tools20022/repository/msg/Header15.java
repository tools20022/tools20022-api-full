/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.TerminalManagementRejectionV03;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to the reject of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header15#mmDownloadTransfer
 * Header15.mmDownloadTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header15#mmFormatVersion
 * Header15.mmFormatVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header15#mmExchangeIdentification
 * Header15.mmExchangeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header15#mmCreationDateTime
 * Header15.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header15#mmInitiatingParty
 * Header15.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header15#mmRecipientParty
 * Header15.mmRecipientParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV03#mmHeader
 * TerminalManagementRejectionV03.mmHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Header15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics related to the reject of a transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header16 Header16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header28 Header28}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header6 Header6}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header15", propOrder = {"downloadTransfer", "formatVersion", "exchangeIdentification", "creationDateTime", "initiatingParty", "recipientParty"})
public class Header15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DwnldTrf", required = true)
	protected TrueFalseIndicator downloadTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DwnldTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DownloadTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the file transfer is a download or an upload."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header28#mmDownloadTransfer
	 * Header28.mmDownloadTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmDownloadTransfer
	 * Header6.mmDownloadTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDownloadTransfer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "DwnldTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DownloadTransfer";
			definition = "Indicates if the file transfer is a download or an upload.";
			nextVersions_lazy = () -> Arrays.asList(Header28.mmDownloadTransfer);
			previousVersion_lazy = () -> Header6.mmDownloadTransfer;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "FrmtVrsn", required = true)
	protected Max6Text formatVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmtVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of file format."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header28#mmFormatVersion
	 * Header28.mmFormatVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmFormatVersion
	 * Header6.mmFormatVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormatVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "FrmtVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatVersion";
			definition = "Version of file format.";
			nextVersions_lazy = () -> Arrays.asList(Header28.mmFormatVersion);
			previousVersion_lazy = () -> Header6.mmFormatVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	@XmlElement(name = "XchgId")
	protected Max3NumericText exchangeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of an exchange occurrence."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header16#mmExchangeIdentification
	 * Header16.mmExchangeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header28#mmExchangeIdentification
	 * Header28.mmExchangeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmExchangeIdentification
	 * Header6.mmExchangeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			nextVersions_lazy = () -> Arrays.asList(Header16.mmExchangeIdentification, Header28.mmExchangeIdentification);
			previousVersion_lazy = () -> Header6.mmExchangeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the file or message was created."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header16#mmCreationDateTime
	 * Header16.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header28#mmCreationDateTime
	 * Header28.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmCreationDateTime
	 * Header6.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the file or message was created.";
			nextVersions_lazy = () -> Arrays.asList(Header16.mmCreationDateTime, Header28.mmCreationDateTime);
			previousVersion_lazy = () -> Header6.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "InitgPty")
	protected GenericIdentification71 initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that has initiated the exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header16#mmInitiatingParty
	 * Header16.mmInitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header28#mmInitiatingParty
	 * Header28.mmInitiatingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmInitiatingParty
	 * Header6.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header16.mmInitiatingParty, Header28.mmInitiatingParty);
			previousVersion_lazy = () -> Header6.mmInitiatingParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification71.mmObject();
		}
	};
	@XmlElement(name = "RcptPty")
	protected GenericIdentification71 recipientParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that is the recipient of the exchange."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header16#mmRecipientParty
	 * Header16.mmRecipientParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header28#mmRecipientParty
	 * Header28.mmRecipientParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header6#mmRecipientParty
	 * Header6.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipientParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header15.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header16.mmRecipientParty, Header28.mmRecipientParty);
			previousVersion_lazy = () -> Header6.mmRecipientParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification71.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header15.mmDownloadTransfer, com.tools20022.repository.msg.Header15.mmFormatVersion, com.tools20022.repository.msg.Header15.mmExchangeIdentification,
						com.tools20022.repository.msg.Header15.mmCreationDateTime, com.tools20022.repository.msg.Header15.mmInitiatingParty, com.tools20022.repository.msg.Header15.mmRecipientParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(TerminalManagementRejectionV03.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header15";
				definition = "Set of characteristics related to the reject of a transaction.";
				nextVersions_lazy = () -> Arrays.asList(Header16.mmObject(), Header28.mmObject());
				previousVersion_lazy = () -> Header6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getDownloadTransfer() {
		return downloadTransfer;
	}

	public Header15 setDownloadTransfer(TrueFalseIndicator downloadTransfer) {
		this.downloadTransfer = Objects.requireNonNull(downloadTransfer);
		return this;
	}

	public Max6Text getFormatVersion() {
		return formatVersion;
	}

	public Header15 setFormatVersion(Max6Text formatVersion) {
		this.formatVersion = Objects.requireNonNull(formatVersion);
		return this;
	}

	public Optional<Max3NumericText> getExchangeIdentification() {
		return exchangeIdentification == null ? Optional.empty() : Optional.of(exchangeIdentification);
	}

	public Header15 setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = exchangeIdentification;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header15 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<GenericIdentification71> getInitiatingParty() {
		return initiatingParty == null ? Optional.empty() : Optional.of(initiatingParty);
	}

	public Header15 setInitiatingParty(com.tools20022.repository.msg.GenericIdentification71 initiatingParty) {
		this.initiatingParty = initiatingParty;
		return this;
	}

	public Optional<GenericIdentification71> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header15 setRecipientParty(com.tools20022.repository.msg.GenericIdentification71 recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}
}