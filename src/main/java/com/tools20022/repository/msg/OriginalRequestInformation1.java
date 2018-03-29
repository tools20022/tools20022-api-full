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
import com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CancellationStatusInformation1;
import com.tools20022.repository.msg.FinancialInstitutionIdentification6;
import com.tools20022.repository.msg.PartyIdentificationAndAccount6;
import com.tools20022.repository.msg.ValidationStatusInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics that unambiguously identify the original global
 * invoice financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmIdentification
 * OriginalRequestInformation1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmCreationDateTime
 * OriginalRequestInformation1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmFinancingRequestor
 * OriginalRequestInformation1.mmFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmIntermediaryAgent
 * OriginalRequestInformation1.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmFirstAgent
 * OriginalRequestInformation1.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmValidationStatusInformation
 * OriginalRequestInformation1.mmValidationStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1#mmCancellationStatusInformation
 * OriginalRequestInformation1.mmCancellationStatusInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmOriginalRequestInformationAndStatus
 * InvoiceFinancingRequestStatusV01.mmOriginalRequestInformationAndStatus}</li>
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
 * "OriginalRequestInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that unambiguously identify the original global invoice financing request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalRequestInformation1", propOrder = {"identification", "creationDateTime", "financingRequestor", "intermediaryAgent", "firstAgent", "validationStatusInformation", "cancellationStatusInformation"})
public class OriginalRequestInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the original request message as assigned by the original sending party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalRequestInformation1, Max35Text> mmIdentification = new MMMessageAttribute<OriginalRequestInformation1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of the original request message as assigned by the original sending party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalRequestInformation1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, Max35Text value) {
			obj.setIdentification(value);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
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
	 * definition} =
	 * "Date and time at which the original request message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalRequestInformation1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<OriginalRequestInformation1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the original request message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(OriginalRequestInformation1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "FincgRqstr")
	protected PartyIdentificationAndAccount6 financingRequestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6
	 * PartyIdentificationAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgRqstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that requests the invoice financing, on behalf of a creditor, as indicated in the original request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalRequestInformation1, Optional<PartyIdentificationAndAccount6>> mmFinancingRequestor = new MMMessageAssociationEnd<OriginalRequestInformation1, Optional<PartyIdentificationAndAccount6>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "FincgRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingRequestor";
			definition = "Party that requests the invoice financing, on behalf of a creditor, as indicated in the original request message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount6.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount6> getValue(OriginalRequestInformation1 obj) {
			return obj.getFinancingRequestor();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, Optional<PartyIdentificationAndAccount6> value) {
			obj.setFinancingRequestor(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt")
	protected FinancialInstitutionIdentification6 intermediaryAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution, as indicated in the original request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalRequestInformation1, Optional<FinancialInstitutionIdentification6>> mmIntermediaryAgent = new MMMessageAssociationEnd<OriginalRequestInformation1, Optional<FinancialInstitutionIdentification6>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			definition = "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution, as indicated in the original request message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification6.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification6> getValue(OriginalRequestInformation1 obj) {
			return obj.getIntermediaryAgent();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, Optional<FinancialInstitutionIdentification6> value) {
			obj.setIntermediaryAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstAgt")
	protected FinancialInstitutionIdentification6 firstAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of financing requestor to which an invoice financing request is addressed, as indicated in the original request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalRequestInformation1, Optional<FinancialInstitutionIdentification6>> mmFirstAgent = new MMMessageAssociationEnd<OriginalRequestInformation1, Optional<FinancialInstitutionIdentification6>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution of financing requestor to which an invoice financing request is addressed, as indicated in the original request message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification6.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification6> getValue(OriginalRequestInformation1 obj) {
			return obj.getFirstAgent();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, Optional<FinancialInstitutionIdentification6> value) {
			obj.setFirstAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnStsInf", required = true)
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the validation status of the request message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalRequestInformation1, ValidationStatusInformation1> mmValidationStatusInformation = new MMMessageAssociationEnd<OriginalRequestInformation1, ValidationStatusInformation1>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Information about the validation status of the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public ValidationStatusInformation1 getValue(OriginalRequestInformation1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, ValidationStatusInformation1 value) {
			obj.setValidationStatusInformation(value);
		}
	};
	@XmlElement(name = "CxlStsInf")
	protected CancellationStatusInformation1 cancellationStatusInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1
	 * CancellationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the business status of the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalRequestInformation1, Optional<CancellationStatusInformation1>> mmCancellationStatusInformation = new MMMessageAssociationEnd<OriginalRequestInformation1, Optional<CancellationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "CxlStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusInformation";
			definition = "Information on the business status of the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CancellationStatusInformation1.mmObject();
		}

		@Override
		public Optional<CancellationStatusInformation1> getValue(OriginalRequestInformation1 obj) {
			return obj.getCancellationStatusInformation();
		}

		@Override
		public void setValue(OriginalRequestInformation1 obj, Optional<CancellationStatusInformation1> value) {
			obj.setCancellationStatusInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalRequestInformation1.mmIdentification, com.tools20022.repository.msg.OriginalRequestInformation1.mmCreationDateTime,
						com.tools20022.repository.msg.OriginalRequestInformation1.mmFinancingRequestor, com.tools20022.repository.msg.OriginalRequestInformation1.mmIntermediaryAgent,
						com.tools20022.repository.msg.OriginalRequestInformation1.mmFirstAgent, com.tools20022.repository.msg.OriginalRequestInformation1.mmValidationStatusInformation,
						com.tools20022.repository.msg.OriginalRequestInformation1.mmCancellationStatusInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingRequestStatusV01.mmOriginalRequestInformationAndStatus);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalRequestInformation1";
				definition = "Set of characteristics that unambiguously identify the original global invoice financing request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public OriginalRequestInformation1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public OriginalRequestInformation1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<PartyIdentificationAndAccount6> getFinancingRequestor() {
		return financingRequestor == null ? Optional.empty() : Optional.of(financingRequestor);
	}

	public OriginalRequestInformation1 setFinancingRequestor(PartyIdentificationAndAccount6 financingRequestor) {
		this.financingRequestor = financingRequestor;
		return this;
	}

	public Optional<FinancialInstitutionIdentification6> getIntermediaryAgent() {
		return intermediaryAgent == null ? Optional.empty() : Optional.of(intermediaryAgent);
	}

	public OriginalRequestInformation1 setIntermediaryAgent(FinancialInstitutionIdentification6 intermediaryAgent) {
		this.intermediaryAgent = intermediaryAgent;
		return this;
	}

	public Optional<FinancialInstitutionIdentification6> getFirstAgent() {
		return firstAgent == null ? Optional.empty() : Optional.of(firstAgent);
	}

	public OriginalRequestInformation1 setFirstAgent(FinancialInstitutionIdentification6 firstAgent) {
		this.firstAgent = firstAgent;
		return this;
	}

	public ValidationStatusInformation1 getValidationStatusInformation() {
		return validationStatusInformation;
	}

	public OriginalRequestInformation1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = Objects.requireNonNull(validationStatusInformation);
		return this;
	}

	public Optional<CancellationStatusInformation1> getCancellationStatusInformation() {
		return cancellationStatusInformation == null ? Optional.empty() : Optional.of(cancellationStatusInformation);
	}

	public OriginalRequestInformation1 setCancellationStatusInformation(CancellationStatusInformation1 cancellationStatusInformation) {
		this.cancellationStatusInformation = cancellationStatusInformation;
		return this;
	}
}