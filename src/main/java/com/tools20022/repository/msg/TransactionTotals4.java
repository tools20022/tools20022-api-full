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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Totals of the reconciliation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals4#mmTotalCredit
 * TransactionTotals4.mmTotalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals4#mmTotalDebit
 * TransactionTotals4.mmTotalDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals4#mmTotalNumber
 * TransactionTotals4.mmTotalNumber}</li>
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
 * "TransactionTotals4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Totals of the reconciliation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals5
 * TransactionTotals5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals6
 * TransactionTotals6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
 * TransactionTotals3}</li>
 * </ul>
 */
public class TransactionTotals4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionTotals5 totalCredit;
	/**
	 * Total of credit transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals4
	 * TransactionTotals4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of credit transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalCredit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlCdt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCredit";
			definition = "Total of credit transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals5.mmObject();
		}
	};
	protected TransactionTotals5 totalDebit;
	/**
	 * Total of debit transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals4
	 * TransactionTotals4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total of debit transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalDebit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlDbt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDebit";
			definition = "Total of debit transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals5.mmObject();
		}
	};
	protected TransactionTotals6 totalNumber;
	/**
	 * Additional count which may be utilised for reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals6
	 * TransactionTotals6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals4
	 * TransactionTotals4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional count which may be utilised for reconciliation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Additional count which may be utilised for reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals4.mmTotalCredit, com.tools20022.repository.msg.TransactionTotals4.mmTotalDebit,
						com.tools20022.repository.msg.TransactionTotals4.mmTotalNumber);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionTotals4";
				definition = "Totals of the reconciliation.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals5.mmObject(), com.tools20022.repository.msg.TransactionTotals6.mmObject());
				previousVersion_lazy = () -> TransactionTotals3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTotals5 getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(com.tools20022.repository.msg.TransactionTotals5 totalCredit) {
		this.totalCredit = totalCredit;
	}

	public TransactionTotals5 getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(com.tools20022.repository.msg.TransactionTotals5 totalDebit) {
		this.totalDebit = totalDebit;
	}

	public TransactionTotals6 getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(com.tools20022.repository.msg.TransactionTotals6 totalNumber) {
		this.totalNumber = totalNumber;
	}
}