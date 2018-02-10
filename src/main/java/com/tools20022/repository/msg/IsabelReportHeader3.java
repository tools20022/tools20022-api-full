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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.IsabelEbanking1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max13AlphaNumericText;
import com.tools20022.repository.datatype.Max64Text;
import com.tools20022.repository.datatype.Max70Text;
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
 * Specifies the header information for a report file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmActualSenderIdentification
 * IsabelReportHeader3.mmActualSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmPayloadCreationDate
 * IsabelReportHeader3.mmPayloadCreationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmFile
 * IsabelReportHeader3.mmFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmSendTimeStamp
 * IsabelReportHeader3.mmSendTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmBankReference
 * IsabelReportHeader3.mmBankReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmDIVFileDescription
 * IsabelReportHeader3.mmDIVFileDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelReportHeader3#mmEBanking
 * IsabelReportHeader3.mmEBanking}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelReportHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the header information for a report file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelReportHeader3", propOrder = {"actualSenderIdentification", "payloadCreationDate", "file", "sendTimeStamp", "bankReference", "dIVFileDescription", "eBanking"})
public class IsabelReportHeader3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActlSndrId", required = true)
	protected Max13AlphaNumericText actualSenderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max13AlphaNumericText
	 * Max13AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlSndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualSenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the actual sender of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualSenderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "ActlSndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualSenderIdentification";
			definition = "Unique identification of the actual sender of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "PyldCreDt", required = true)
	protected DateAndDateTimeChoice payloadCreationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldCreDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadCreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the file in the payload was actually created."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPayloadCreationDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "PyldCreDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadCreationDate";
			definition = "Date and time at which the file in the payload was actually created.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "File", required = true)
	protected IsabelFile4 file;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelFile4
	 * IsabelFile4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "File"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "File"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the file contained in the payload."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "File";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "File";
			definition = "Characteristics of the file contained in the payload.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IsabelFile4.mmObject();
		}
	};
	@XmlElement(name = "SndTmStmp", required = true)
	protected ISODateTime sendTimeStamp;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time stamp on when the file is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSendTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "SndTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendTimeStamp";
			definition = "Time stamp on when the file is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "BkRef", required = true)
	protected Max64Text bankReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max64Text
	 * Max64Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference as assigned by the bank to the report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "BkRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReference";
			definition = "Unique reference as assigned by the bank to the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max64Text.mmObject();
		}
	};
	@XmlElement(name = "DIVFileDesc")
	protected Max70Text dIVFileDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DIVFileDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DIVFileDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the file when provided in DIV format (Belgian proprietary file format)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDIVFileDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "DIVFileDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DIVFileDescription";
			definition = "Description of the file when provided in DIV format (Belgian proprietary file format).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "EBkg")
	protected IsabelEbanking1Choice eBanking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IsabelEbanking1Choice
	 * IsabelEbanking1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelReportHeader3
	 * IsabelReportHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EBkg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification used for the e-banking module."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEBanking = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelReportHeader3.mmObject();
			isDerived = false;
			xmlTag = "EBkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EBanking";
			definition = "Unique identification used for the e-banking module.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IsabelEbanking1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelReportHeader3.mmActualSenderIdentification, com.tools20022.repository.msg.IsabelReportHeader3.mmPayloadCreationDate,
						com.tools20022.repository.msg.IsabelReportHeader3.mmFile, com.tools20022.repository.msg.IsabelReportHeader3.mmSendTimeStamp, com.tools20022.repository.msg.IsabelReportHeader3.mmBankReference,
						com.tools20022.repository.msg.IsabelReportHeader3.mmDIVFileDescription, com.tools20022.repository.msg.IsabelReportHeader3.mmEBanking);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelReportHeader3";
				definition = "Specifies the header information for a report file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max13AlphaNumericText getActualSenderIdentification() {
		return actualSenderIdentification;
	}

	public IsabelReportHeader3 setActualSenderIdentification(Max13AlphaNumericText actualSenderIdentification) {
		this.actualSenderIdentification = Objects.requireNonNull(actualSenderIdentification);
		return this;
	}

	public DateAndDateTimeChoice getPayloadCreationDate() {
		return payloadCreationDate;
	}

	public IsabelReportHeader3 setPayloadCreationDate(DateAndDateTimeChoice payloadCreationDate) {
		this.payloadCreationDate = Objects.requireNonNull(payloadCreationDate);
		return this;
	}

	public IsabelFile4 getFile() {
		return file;
	}

	public IsabelReportHeader3 setFile(com.tools20022.repository.msg.IsabelFile4 file) {
		this.file = Objects.requireNonNull(file);
		return this;
	}

	public ISODateTime getSendTimeStamp() {
		return sendTimeStamp;
	}

	public IsabelReportHeader3 setSendTimeStamp(ISODateTime sendTimeStamp) {
		this.sendTimeStamp = Objects.requireNonNull(sendTimeStamp);
		return this;
	}

	public Max64Text getBankReference() {
		return bankReference;
	}

	public IsabelReportHeader3 setBankReference(Max64Text bankReference) {
		this.bankReference = Objects.requireNonNull(bankReference);
		return this;
	}

	public Optional<Max70Text> getDIVFileDescription() {
		return dIVFileDescription == null ? Optional.empty() : Optional.of(dIVFileDescription);
	}

	public IsabelReportHeader3 setDIVFileDescription(Max70Text dIVFileDescription) {
		this.dIVFileDescription = dIVFileDescription;
		return this;
	}

	public Optional<IsabelEbanking1Choice> getEBanking() {
		return eBanking == null ? Optional.empty() : Optional.of(eBanking);
	}

	public IsabelReportHeader3 setEBanking(IsabelEbanking1Choice eBanking) {
		this.eBanking = eBanking;
		return this;
	}
}