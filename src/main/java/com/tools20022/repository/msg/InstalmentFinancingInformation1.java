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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about result of a single instalment (financed or not) within an
 * invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1#mmInstalmentSequenceIdentification
 * InstalmentFinancingInformation1.mmInstalmentSequenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1#mmInstalmentTotalAmount
 * InstalmentFinancingInformation1.mmInstalmentTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1#mmInstalmentFinancingResult
 * InstalmentFinancingInformation1.mmInstalmentFinancingResult}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "InstalmentFinancingInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about result of a single instalment (financed or not) within an invoice."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstalmentFinancingInformation1", propOrder = {"instalmentSequenceIdentification", "instalmentTotalAmount", "instalmentFinancingResult"})
public class InstalmentFinancingInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max70Text instalmentSequenceIdentification;
	/**
	 * Progressive number of the single instalment related to an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1
	 * InstalmentFinancingInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtSeqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentSequenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Progressive number of the single instalment related to an invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstalmentSequenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstalmentFinancingInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtSeqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentSequenceIdentification";
			definition = "Progressive number of the single instalment related to an invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount instalmentTotalAmount;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1
	 * InstalmentFinancingInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstalmentTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> InstalmentFinancingInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentTotalAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected FinancingResult1 instalmentFinancingResult;
	/**
	 * Information about the financing result of one instalment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancingResult1
	 * FinancingResult1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1
	 * InstalmentFinancingInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtFincgRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentFinancingResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the financing result of one instalment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalmentFinancingResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> InstalmentFinancingInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtFincgRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentFinancingResult";
			definition = "Information about the financing result of one instalment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancingResult1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstalmentFinancingInformation1.mmInstalmentSequenceIdentification, InstalmentFinancingInformation1.mmInstalmentTotalAmount,
						InstalmentFinancingInformation1.mmInstalmentFinancingResult);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstalmentFinancingInformation1";
				definition = "Information about result of a single instalment (financed or not) within an invoice.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstlmtSeqId", required = true)
	public Max70Text getInstalmentSequenceIdentification() {
		return instalmentSequenceIdentification;
	}

	public void setInstalmentSequenceIdentification(Max70Text instalmentSequenceIdentification) {
		this.instalmentSequenceIdentification = instalmentSequenceIdentification;
	}

	@XmlElement(name = "InstlmtTtlAmt", required = true)
	public ActiveCurrencyAndAmount getInstalmentTotalAmount() {
		return instalmentTotalAmount;
	}

	public void setInstalmentTotalAmount(ActiveCurrencyAndAmount instalmentTotalAmount) {
		this.instalmentTotalAmount = instalmentTotalAmount;
	}

	@XmlElement(name = "InstlmtFincgRslt", required = true)
	public FinancingResult1 getInstalmentFinancingResult() {
		return instalmentFinancingResult;
	}

	public void setInstalmentFinancingResult(com.tools20022.repository.msg.FinancingResult1 instalmentFinancingResult) {
		this.instalmentFinancingResult = instalmentFinancingResult;
	}
}