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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV05;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Identifies the underlying (group of) transaction(s) to which the resolution
 * of investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction9.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction9.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9#mmTransactionInformationAndStatus
 * UnderlyingTransaction9.mmTransactionInformationAndStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05#mmCancellationDetails
 * ResolutionOfInvestigationV05.mmCancellationDetails}</li>
 * </ul>
 * </li>
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
 * "UnderlyingTransaction9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the resolution of investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction14
 * UnderlyingTransaction14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4
 * UnderlyingTransaction4}</li>
 * </ul>
 */
public class UnderlyingTransaction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginalGroupHeader5 originalGroupInformationAndStatus;
	/**
	 * Provides information on the original cancellation message, to which the
	 * resolution refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
	 * OriginalGroupHeader5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9
	 * UnderlyingTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original cancellation message, to which the resolution refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalGroupInformationAndStatus
	 * UnderlyingTransaction14.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmOriginalGroupInformationAndStatus
	 * UnderlyingTransaction4.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformationAndStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> UnderlyingTransaction9.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Provides information on the original cancellation message, to which the resolution refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction14.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction4.mmOriginalGroupInformationAndStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.OriginalPaymentInstruction10> originalPaymentInformationAndStatus;
	/**
	 * Provides information on the original (group of) transactions, to which
	 * the cancellation status refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10
	 * OriginalPaymentInstruction10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9
	 * UnderlyingTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original (group of) transactions, to which the cancellation status refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalPaymentInformationAndStatus
	 * UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmOriginalPaymentInformationAndStatus
	 * UnderlyingTransaction4.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalPaymentInformationAndStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> UnderlyingTransaction9.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Provides information on the original (group of) transactions, to which the cancellation status refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction4.mmOriginalPaymentInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTransaction53> transactionInformationAndStatus;
	/**
	 * Provides details on the original transactions to which the cancellation
	 * request message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction53
	 * PaymentTransaction53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction9
	 * UnderlyingTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the original transactions to which the cancellation request message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmTransactionInformationAndStatus
	 * UnderlyingTransaction14.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction4#mmTransactionInformationAndStatus
	 * UnderlyingTransaction4.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionInformationAndStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> UnderlyingTransaction9.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Provides details on the original transactions to which the cancellation request message refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction14.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction4.mmTransactionInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction53.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnderlyingTransaction9.mmOriginalGroupInformationAndStatus, UnderlyingTransaction9.mmOriginalPaymentInformationAndStatus, UnderlyingTransaction9.mmTransactionInformationAndStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV05.mmCancellationDetails);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction9";
				definition = "Identifies the underlying (group of) transaction(s) to which the resolution of investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction14.mmObject());
				previousVersion_lazy = () -> UnderlyingTransaction4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public OriginalGroupHeader5 getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(com.tools20022.repository.msg.OriginalGroupHeader5 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = originalGroupInformationAndStatus;
	}

	public List<OriginalPaymentInstruction10> getOriginalPaymentInformationAndStatus() {
		return originalPaymentInformationAndStatus;
	}

	public void setOriginalPaymentInformationAndStatus(List<com.tools20022.repository.msg.OriginalPaymentInstruction10> originalPaymentInformationAndStatus) {
		this.originalPaymentInformationAndStatus = originalPaymentInformationAndStatus;
	}

	public List<PaymentTransaction53> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus;
	}

	public void setTransactionInformationAndStatus(List<com.tools20022.repository.msg.PaymentTransaction53> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = transactionInformationAndStatus;
	}
}