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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.CashProceedsDefinition;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the cash proceeds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashProceeds1#mmPostingAmount
 * CashProceeds1.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashProceeds1#mmReconciliationDetails
 * CashProceeds1.mmReconciliationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashProceeds1#mmAccountDetails
 * CashProceeds1.mmAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
 * CashProceedsDefinition}</li>
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
 * "CashProceeds1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the cash proceeds."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashProceeds1", propOrder = {"postingAmount", "reconciliationDetails", "accountDetails"})
public class CashProceeds1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount postingAmount;
	/**
	 * Cash amount which is posted.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1 CashProceeds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount which is posted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> CashProceeds1.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Cash amount which is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max350Text reconciliationDetails;
	/**
	 * Reconciliation information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1 CashProceeds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashProceeds1.mmObject();
			isDerived = false;
			xmlTag = "RcncltnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationDetails";
			definition = "Reconciliation information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashAccount19> accountDetails;
	/**
	 * Provides information about the debited securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount19
	 * CashAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1 CashProceeds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the debited securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> CashProceeds1.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the debited securities account.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount19.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashProceeds1.mmPostingAmount, CashProceeds1.mmReconciliationDetails, CashProceeds1.mmAccountDetails);
				trace_lazy = () -> CashProceedsDefinition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashProceeds1";
				definition = "Provides information about the cash proceeds.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PstngAmt", required = true)
	public ActiveCurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public void setPostingAmount(ActiveCurrencyAndAmount postingAmount) {
		this.postingAmount = postingAmount;
	}

	@XmlElement(name = "RcncltnDtls")
	public Max350Text getReconciliationDetails() {
		return reconciliationDetails;
	}

	public void setReconciliationDetails(Max350Text reconciliationDetails) {
		this.reconciliationDetails = reconciliationDetails;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public List<CashAccount19> getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(List<com.tools20022.repository.msg.CashAccount19> accountDetails) {
		this.accountDetails = accountDetails;
	}
}