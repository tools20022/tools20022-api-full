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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Intra-balance type used to specify pairs of from/to balances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2#mmBalanceFrom
 * IntraBalanceType2.mmBalanceFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceType2#mmBalanceTo
 * IntraBalanceType2.mmBalanceTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalanceType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intra-balance type used to specify pairs of from/to balances."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraBalanceType2
 * ConstraintBalanceFromToRule.forIntraBalanceType2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1
 * IntraBalanceType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceType2", propOrder = {"balanceFrom", "balanceTo"})
public class IntraBalanceType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BalFr")
	protected CashSubBalanceTypeAndQuantityBreakdown2 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2
	 * CashSubBalanceTypeAndQuantityBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2
	 * IntraBalanceType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#mmBalanceFrom
	 * IntraBalanceType1.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceType2, Optional<CashSubBalanceTypeAndQuantityBreakdown2>> mmBalanceFrom = new MMMessageAssociationEnd<IntraBalanceType2, Optional<CashSubBalanceTypeAndQuantityBreakdown2>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceType2.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the amount of money is moved.";
			previousVersion_lazy = () -> IntraBalanceType1.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown2.mmObject();
		}

		@Override
		public Optional<CashSubBalanceTypeAndQuantityBreakdown2> getValue(IntraBalanceType2 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraBalanceType2 obj, Optional<CashSubBalanceTypeAndQuantityBreakdown2> value) {
			obj.setBalanceFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTo")
	protected CashSubBalanceTypeAndQuantityBreakdown2 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2
	 * CashSubBalanceTypeAndQuantityBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType2
	 * IntraBalanceType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1#mmBalanceTo
	 * IntraBalanceType1.mmBalanceTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceType2, Optional<CashSubBalanceTypeAndQuantityBreakdown2>> mmBalanceTo = new MMMessageAssociationEnd<IntraBalanceType2, Optional<CashSubBalanceTypeAndQuantityBreakdown2>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceType2.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the amount of money is moved.";
			previousVersion_lazy = () -> IntraBalanceType1.mmBalanceTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown2.mmObject();
		}

		@Override
		public Optional<CashSubBalanceTypeAndQuantityBreakdown2> getValue(IntraBalanceType2 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraBalanceType2 obj, Optional<CashSubBalanceTypeAndQuantityBreakdown2> value) {
			obj.setBalanceTo(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceType2.mmBalanceFrom, com.tools20022.repository.msg.IntraBalanceType2.mmBalanceTo);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraBalanceType2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceType2";
				definition = "Intra-balance type used to specify pairs of from/to balances.";
				previousVersion_lazy = () -> IntraBalanceType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CashSubBalanceTypeAndQuantityBreakdown2> getBalanceFrom() {
		return balanceFrom == null ? Optional.empty() : Optional.of(balanceFrom);
	}

	public IntraBalanceType2 setBalanceFrom(CashSubBalanceTypeAndQuantityBreakdown2 balanceFrom) {
		this.balanceFrom = balanceFrom;
		return this;
	}

	public Optional<CashSubBalanceTypeAndQuantityBreakdown2> getBalanceTo() {
		return balanceTo == null ? Optional.empty() : Optional.of(balanceTo);
	}

	public IntraBalanceType2 setBalanceTo(CashSubBalanceTypeAndQuantityBreakdown2 balanceTo) {
		this.balanceTo = balanceTo;
		return this;
	}
}