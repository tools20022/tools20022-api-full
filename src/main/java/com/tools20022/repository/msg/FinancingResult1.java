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
import com.tools20022.repository.choice.FinancingRateOrAmountChoice;
import com.tools20022.repository.choice.StatusReason4Choice;
import com.tools20022.repository.codeset.RequestStatus1Code;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.InvoiceFinancingStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The final result of a single invoice financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingResult1#mmFinancingRequestStatus
 * FinancingResult1.mmFinancingRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingResult1#mmStatusReason
 * FinancingResult1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingResult1#mmAdditionalStatusReasonInformation
 * FinancingResult1.mmAdditionalStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingResult1#mmFinancedAmount
 * FinancingResult1.mmFinancedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The final result of a single invoice financing request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingResult1", propOrder = {"financingRequestStatus", "statusReason", "additionalStatusReasonInformation", "financedAmount"})
public class FinancingResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FincgReqSts", required = true)
	protected RequestStatus1Code financingRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RequestStatus1Code
	 * RequestStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmFinancingTransactionStatus
	 * InvoiceFinancingStatus.mmFinancingTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgReqSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the financing request (e.g. financed. not financed)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingResult1, RequestStatus1Code> mmFinancingRequestStatus = new MMMessageAttribute<FinancingResult1, RequestStatus1Code>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmFinancingTransactionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "FincgReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingRequestStatus";
			definition = "Specifies the status of the financing request (e.g. financed. not financed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestStatus1Code.mmObject();
		}

		@Override
		public RequestStatus1Code getValue(FinancingResult1 obj) {
			return obj.getFinancingRequestStatus();
		}

		@Override
		public void setValue(FinancingResult1 obj, RequestStatus1Code value) {
			obj.setFinancingRequestStatus(value);
		}
	};
	@XmlElement(name = "StsRsn")
	protected StatusReason4Choice statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.StatusReason4Choice
	 * StatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmFinancingStatusReason
	 * InvoiceFinancingStatus.mmFinancingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reasons that have determined the result of the single request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingResult1, Optional<StatusReason4Choice>> mmStatusReason = new MMMessageAssociationEnd<FinancingResult1, Optional<StatusReason4Choice>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmFinancingStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Indicates the reasons that have determined the result of the single request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReason4Choice.mmObject();
		}

		@Override
		public Optional<StatusReason4Choice> getValue(FinancingResult1 obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(FinancingResult1 obj, Optional<StatusReason4Choice> value) {
			obj.setStatusReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlStsRsnInf")
	protected List<Max105Text> additionalStatusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlStsRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingResult1, List<Max105Text>> mmAdditionalStatusReasonInformation = new MMMessageAttribute<FinancingResult1, List<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusReasonInformation";
			definition = "Further details on the status reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(FinancingResult1 obj) {
			return obj.getAdditionalStatusReasonInformation();
		}

		@Override
		public void setValue(FinancingResult1 obj, List<Max105Text> value) {
			obj.setAdditionalStatusReasonInformation(value);
		}
	};
	@XmlElement(name = "FincdAmt")
	protected FinancingRateOrAmountChoice financedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancingRateOrAmountChoice
	 * FinancingRateOrAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmRequestedAmount
	 * InvoiceFinancingAgreement.mmRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates amount financed related to the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingResult1, Optional<FinancingRateOrAmountChoice>> mmFinancedAmount = new MMMessageAttribute<FinancingResult1, Optional<FinancingRateOrAmountChoice>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmRequestedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "FincdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancedAmount";
			definition = "Indicates amount financed related to the request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancingRateOrAmountChoice.mmObject();
		}

		@Override
		public Optional<FinancingRateOrAmountChoice> getValue(FinancingResult1 obj) {
			return obj.getFinancedAmount();
		}

		@Override
		public void setValue(FinancingResult1 obj, Optional<FinancingRateOrAmountChoice> value) {
			obj.setFinancedAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingResult1.mmFinancingRequestStatus, com.tools20022.repository.msg.FinancingResult1.mmStatusReason,
						com.tools20022.repository.msg.FinancingResult1.mmAdditionalStatusReasonInformation, com.tools20022.repository.msg.FinancingResult1.mmFinancedAmount);
				trace_lazy = () -> InvoiceFinancingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingResult1";
				definition = "The final result of a single invoice financing request.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestStatus1Code getFinancingRequestStatus() {
		return financingRequestStatus;
	}

	public FinancingResult1 setFinancingRequestStatus(RequestStatus1Code financingRequestStatus) {
		this.financingRequestStatus = Objects.requireNonNull(financingRequestStatus);
		return this;
	}

	public Optional<StatusReason4Choice> getStatusReason() {
		return statusReason == null ? Optional.empty() : Optional.of(statusReason);
	}

	public FinancingResult1 setStatusReason(StatusReason4Choice statusReason) {
		this.statusReason = statusReason;
		return this;
	}

	public List<Max105Text> getAdditionalStatusReasonInformation() {
		return additionalStatusReasonInformation == null ? additionalStatusReasonInformation = new ArrayList<>() : additionalStatusReasonInformation;
	}

	public FinancingResult1 setAdditionalStatusReasonInformation(List<Max105Text> additionalStatusReasonInformation) {
		this.additionalStatusReasonInformation = Objects.requireNonNull(additionalStatusReasonInformation);
		return this;
	}

	public Optional<FinancingRateOrAmountChoice> getFinancedAmount() {
		return financedAmount == null ? Optional.empty() : Optional.of(financedAmount);
	}

	public FinancingResult1 setFinancedAmount(FinancingRateOrAmountChoice financedAmount) {
		this.financedAmount = financedAmount;
		return this;
	}
}