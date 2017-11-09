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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "The final result of a single invoice financing request."</li>
 * </ul>
 */
public class FinancingResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestStatus1Code financingRequestStatus;
	/**
	 * Specifies the status of the financing request (e.g. financed. not
	 * financed).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the financing request (e.g. financed. not financed)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancingRequestStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmFinancingTransactionStatus;
			componentContext_lazy = () -> FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "FincgReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingRequestStatus";
			definition = "Specifies the status of the financing request (e.g. financed. not financed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestStatus1Code.mmObject();
		}
	};
	protected StatusReason4Choice statusReason;
	/**
	 * Indicates the reasons that have determined the result of the single
	 * request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reasons that have determined the result of the single request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmFinancingStatusReason;
			componentContext_lazy = () -> FinancingResult1.mmObject();
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
	};
	protected List<Max105Text> additionalStatusReasonInformation;
	/**
	 * Further details on the status reason.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatusReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusReasonInformation";
			definition = "Further details on the status reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected FinancingRateOrAmountChoice financedAmount;
	/**
	 * Indicates amount financed related to the request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates amount financed related to the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmRequestedAmount;
			componentContext_lazy = () -> FinancingResult1.mmObject();
			isDerived = false;
			xmlTag = "FincdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancedAmount";
			definition = "Indicates amount financed related to the request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancingRateOrAmountChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancingResult1.mmFinancingRequestStatus, FinancingResult1.mmStatusReason, FinancingResult1.mmAdditionalStatusReasonInformation, FinancingResult1.mmFinancedAmount);
				trace_lazy = () -> InvoiceFinancingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setFinancingRequestStatus(RequestStatus1Code financingRequestStatus) {
		this.financingRequestStatus = financingRequestStatus;
	}

	public StatusReason4Choice getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(StatusReason4Choice statusReason) {
		this.statusReason = statusReason;
	}

	public List<Max105Text> getAdditionalStatusReasonInformation() {
		return additionalStatusReasonInformation;
	}

	public void setAdditionalStatusReasonInformation(List<Max105Text> additionalStatusReasonInformation) {
		this.additionalStatusReasonInformation = additionalStatusReasonInformation;
	}

	public FinancingRateOrAmountChoice getFinancedAmount() {
		return financedAmount;
	}

	public void setFinancedAmount(FinancingRateOrAmountChoice financedAmount) {
		this.financedAmount = financedAmount;
	}
}