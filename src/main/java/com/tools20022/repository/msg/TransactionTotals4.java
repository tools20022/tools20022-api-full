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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionTotals5;
import com.tools20022.repository.msg.TransactionTotals6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionTotals4", propOrder = {"totalCredit", "totalDebit", "totalNumber"})
public class TransactionTotals4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlCdt", required = true)
	protected TransactionTotals5 totalCredit;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<TransactionTotals4, TransactionTotals5> mmTotalCredit = new MMMessageAssociationEnd<TransactionTotals4, TransactionTotals5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCredit";
			definition = "Total of credit transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals5.mmObject();
		}

		@Override
		public TransactionTotals5 getValue(TransactionTotals4 obj) {
			return obj.getTotalCredit();
		}

		@Override
		public void setValue(TransactionTotals4 obj, TransactionTotals5 value) {
			obj.setTotalCredit(value);
		}
	};
	@XmlElement(name = "TtlDbt", required = true)
	protected TransactionTotals5 totalDebit;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<TransactionTotals4, TransactionTotals5> mmTotalDebit = new MMMessageAssociationEnd<TransactionTotals4, TransactionTotals5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDebit";
			definition = "Total of debit transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals5.mmObject();
		}

		@Override
		public TransactionTotals5 getValue(TransactionTotals4 obj) {
			return obj.getTotalDebit();
		}

		@Override
		public void setValue(TransactionTotals4 obj, TransactionTotals5 value) {
			obj.setTotalDebit(value);
		}
	};
	@XmlElement(name = "TtlNb")
	protected TransactionTotals6 totalNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<TransactionTotals4, Optional<TransactionTotals6>> mmTotalNumber = new MMMessageAssociationEnd<TransactionTotals4, Optional<TransactionTotals6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionTotals4.mmObject();
			isDerived = false;
			xmlTag = "TtlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumber";
			definition = "Additional count which may be utilised for reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionTotals6.mmObject();
		}

		@Override
		public Optional<TransactionTotals6> getValue(TransactionTotals4 obj) {
			return obj.getTotalNumber();
		}

		@Override
		public void setValue(TransactionTotals4 obj, Optional<TransactionTotals6> value) {
			obj.setTotalNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionTotals4.mmTotalCredit, com.tools20022.repository.msg.TransactionTotals4.mmTotalDebit,
						com.tools20022.repository.msg.TransactionTotals4.mmTotalNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionTotals4";
				definition = "Totals of the reconciliation.";
				nextVersions_lazy = () -> Arrays.asList(TransactionTotals5.mmObject(), TransactionTotals6.mmObject());
				previousVersion_lazy = () -> TransactionTotals3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTotals5 getTotalCredit() {
		return totalCredit;
	}

	public TransactionTotals4 setTotalCredit(TransactionTotals5 totalCredit) {
		this.totalCredit = Objects.requireNonNull(totalCredit);
		return this;
	}

	public TransactionTotals5 getTotalDebit() {
		return totalDebit;
	}

	public TransactionTotals4 setTotalDebit(TransactionTotals5 totalDebit) {
		this.totalDebit = Objects.requireNonNull(totalDebit);
		return this;
	}

	public Optional<TransactionTotals6> getTotalNumber() {
		return totalNumber == null ? Optional.empty() : Optional.of(totalNumber);
	}

	public TransactionTotals4 setTotalNumber(TransactionTotals6 totalNumber) {
		this.totalNumber = totalNumber;
		return this;
	}
}