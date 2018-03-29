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
import com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.entity.Expiry;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingDocument;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Undertaking extend or pay query details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmUndertakingIdentification
 * ExtendOrPayQuery1.mmUndertakingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmDemandDetails
 * ExtendOrPayQuery1.mmDemandDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmRequestedExpiryDate
 * ExtendOrPayQuery1.mmRequestedExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmBankInstructions
 * ExtendOrPayQuery1.mmBankInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmBankContact
 * ExtendOrPayQuery1.mmBankContact}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmEnclosedFile
 * ExtendOrPayQuery1.mmEnclosedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmAdditionalInformation
 * ExtendOrPayQuery1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01#mmExtendOrPayRequestDetails
 * ExtendOrPayRequestV01.mmExtendOrPayRequestDetails}</li>
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
 * "ExtendOrPayQuery1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Undertaking extend or pay query details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExtendOrPayQuery1", propOrder = {"undertakingIdentification", "demandDetails", "requestedExpiryDate", "bankInstructions", "bankContact", "enclosedFile", "additionalInformation"})
public class ExtendOrPayQuery1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgId", required = true)
	protected Undertaking9 undertakingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Undertaking9
	 * Undertaking9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the identification of the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExtendOrPayQuery1, Undertaking9> mmUndertakingIdentification = new MMMessageAssociationEnd<ExtendOrPayQuery1, Undertaking9>() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIdentification";
			definition = "Details related to the identification of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Undertaking9.mmObject();
		}

		@Override
		public Undertaking9 getValue(ExtendOrPayQuery1 obj) {
			return obj.getUndertakingIdentification();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, Undertaking9 value) {
			obj.setUndertakingIdentification(value);
		}
	};
	@XmlElement(name = "DmndDtls", required = true)
	protected Demand2 demandDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Demand2 Demand2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmDemand
	 * Undertaking.mmDemand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExtendOrPayQuery1, Demand2> mmDemandDetails = new MMMessageAssociationEnd<ExtendOrPayQuery1, Demand2>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmDemand;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "DmndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DemandDetails";
			definition = "Details related to the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Demand2.mmObject();
		}

		@Override
		public Demand2 getValue(ExtendOrPayQuery1 obj) {
			return obj.getDemandDetails();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, Demand2 value) {
			obj.setDemandDetails(value);
		}
	};
	@XmlElement(name = "ReqdXpryDt", required = true)
	protected ISODate requestedExpiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Expiry#mmExpiryDateTime
	 * Expiry.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdXpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested new expiry date as an alternative to payment of the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExtendOrPayQuery1, ISODate> mmRequestedExpiryDate = new MMMessageAttribute<ExtendOrPayQuery1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Expiry.mmExpiryDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "ReqdXpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExpiryDate";
			definition = "Requested new expiry date as an alternative to payment of the demand.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ExtendOrPayQuery1 obj) {
			return obj.getRequestedExpiryDate();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, ISODate value) {
			obj.setRequestedExpiryDate(value);
		}
	};
	@XmlElement(name = "BkInstrs")
	protected BankInstructions1 bankInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BankInstructions1
	 * BankInstructions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the instructions from the bank."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExtendOrPayQuery1, Optional<BankInstructions1>> mmBankInstructions = new MMMessageAssociationEnd<ExtendOrPayQuery1, Optional<BankInstructions1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "BkInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankInstructions";
			definition = "Details of the instructions from the bank.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankInstructions1.mmObject();
		}

		@Override
		public Optional<BankInstructions1> getValue(ExtendOrPayQuery1 obj) {
			return obj.getBankInstructions();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, Optional<BankInstructions1> value) {
			obj.setBankInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "BkCtct")
	protected List<Contacts3> bankContact;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Contacts3
	 * Contacts3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact at the issuing bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExtendOrPayQuery1, List<Contacts3>> mmBankContact = new MMMessageAttribute<ExtendOrPayQuery1, List<Contacts3>>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "BkCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankContact";
			definition = "Contact at the issuing bank.";
			minOccurs = 0;
			complexType_lazy = () -> Contacts3.mmObject();
		}

		@Override
		public List<Contacts3> getValue(ExtendOrPayQuery1 obj) {
			return obj.getBankContact();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, List<Contacts3> value) {
			obj.setBankContact(value);
		}
	};
	@XmlElement(name = "NclsdFile")
	protected List<Document9> enclosedFile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document9 Document9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument
	 * UndertakingDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NclsdFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnclosedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document or template enclosed in the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExtendOrPayQuery1, List<Document9>> mmEnclosedFile = new MMMessageAssociationEnd<ExtendOrPayQuery1, List<Document9>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingDocument.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "NclsdFile";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnclosedFile";
			definition = "Document or template enclosed in the request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document9.mmObject();
		}

		@Override
		public List<Document9> getValue(ExtendOrPayQuery1 obj) {
			return obj.getEnclosedFile();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, List<Document9> value) {
			obj.setEnclosedFile(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1
	 * ExtendOrPayQuery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExtendOrPayQuery1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<ExtendOrPayQuery1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendOrPayQuery1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the request.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(ExtendOrPayQuery1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ExtendOrPayQuery1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExtendOrPayQuery1.mmUndertakingIdentification, com.tools20022.repository.msg.ExtendOrPayQuery1.mmDemandDetails,
						com.tools20022.repository.msg.ExtendOrPayQuery1.mmRequestedExpiryDate, com.tools20022.repository.msg.ExtendOrPayQuery1.mmBankInstructions, com.tools20022.repository.msg.ExtendOrPayQuery1.mmBankContact,
						com.tools20022.repository.msg.ExtendOrPayQuery1.mmEnclosedFile, com.tools20022.repository.msg.ExtendOrPayQuery1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ExtendOrPayRequestV01.mmExtendOrPayRequestDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendOrPayQuery1";
				definition = "Undertaking extend or pay query details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking9 getUndertakingIdentification() {
		return undertakingIdentification;
	}

	public ExtendOrPayQuery1 setUndertakingIdentification(Undertaking9 undertakingIdentification) {
		this.undertakingIdentification = Objects.requireNonNull(undertakingIdentification);
		return this;
	}

	public Demand2 getDemandDetails() {
		return demandDetails;
	}

	public ExtendOrPayQuery1 setDemandDetails(Demand2 demandDetails) {
		this.demandDetails = Objects.requireNonNull(demandDetails);
		return this;
	}

	public ISODate getRequestedExpiryDate() {
		return requestedExpiryDate;
	}

	public ExtendOrPayQuery1 setRequestedExpiryDate(ISODate requestedExpiryDate) {
		this.requestedExpiryDate = Objects.requireNonNull(requestedExpiryDate);
		return this;
	}

	public Optional<BankInstructions1> getBankInstructions() {
		return bankInstructions == null ? Optional.empty() : Optional.of(bankInstructions);
	}

	public ExtendOrPayQuery1 setBankInstructions(BankInstructions1 bankInstructions) {
		this.bankInstructions = bankInstructions;
		return this;
	}

	public List<Contacts3> getBankContact() {
		return bankContact == null ? bankContact = new ArrayList<>() : bankContact;
	}

	public ExtendOrPayQuery1 setBankContact(List<Contacts3> bankContact) {
		this.bankContact = Objects.requireNonNull(bankContact);
		return this;
	}

	public List<Document9> getEnclosedFile() {
		return enclosedFile == null ? enclosedFile = new ArrayList<>() : enclosedFile;
	}

	public ExtendOrPayQuery1 setEnclosedFile(List<Document9> enclosedFile) {
		this.enclosedFile = Objects.requireNonNull(enclosedFile);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public ExtendOrPayQuery1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}