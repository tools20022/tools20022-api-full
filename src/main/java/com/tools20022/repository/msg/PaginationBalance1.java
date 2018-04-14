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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance of a financial instrument for a specific statement page.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FirstOpeningBalanceOrIntermediaryOpeningBalanceRule
 * PaginationBalance1.FirstOpeningBalanceOrIntermediaryOpeningBalanceRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FinalClosingBalanceOrIntermediaryClosingBalanceRule
 * PaginationBalance1.FinalClosingBalanceOrIntermediaryClosingBalanceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmFirstOpeningBalance
 * PaginationBalance1.mmFirstOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmIntermediaryOpeningBalance
 * PaginationBalance1.mmIntermediaryOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmFinalClosingBalance
 * PaginationBalance1.mmFinalClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmIntermediaryClosingBalance
 * PaginationBalance1.mmIntermediaryClosingBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaginationBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Balance of a financial instrument for a specific statement page."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaginationBalance2
 * PaginationBalance2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaginationBalance1", propOrder = {"firstOpeningBalance", "intermediaryOpeningBalance", "finalClosingBalance", "intermediaryClosingBalance"})
public class PaginationBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrstOpngBal")
	protected FinancialInstrumentQuantity1 firstOpeningBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstOpngBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of the financial instrument in the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>> mmFirstOpeningBalance = new MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "FrstOpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstOpeningBalance";
			definition = "Opening balance of the financial instrument in the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(PaginationBalance1 obj) {
			return obj.getFirstOpeningBalance();
		}

		@Override
		public void setValue(PaginationBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setFirstOpeningBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyOpngBal")
	protected FinancialInstrumentQuantity1 intermediaryOpeningBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyOpngBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of this page only. It must be the interemdiary closing balance of the previous page (part of the same statement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>> mmIntermediaryOpeningBalance = new MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyOpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryOpeningBalance";
			definition = "Opening balance of this page only. It must be the interemdiary closing balance of the previous page (part of the same statement).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(PaginationBalance1 obj) {
			return obj.getIntermediaryOpeningBalance();
		}

		@Override
		public void setValue(PaginationBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setIntermediaryOpeningBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlClsgBal")
	protected FinancialInstrumentQuantity1 finalClosingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlClsgBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of the financial instrument in the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>> mmFinalClosingBalance = new MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "FnlClsgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalClosingBalance";
			definition = "Closing balance of the financial instrument in the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(PaginationBalance1 obj) {
			return obj.getFinalClosingBalance();
		}

		@Override
		public void setValue(PaginationBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setFinalClosingBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyClsgBal")
	protected FinancialInstrumentQuantity1 intermediaryClosingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyClsgBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Balance of this page only. Must be the interemdiary opening balance of the next page (part of the same statement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>> mmIntermediaryClosingBalance = new MMMessageAttribute<PaginationBalance1, Optional<FinancialInstrumentQuantity1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyClsgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryClosingBalance";
			definition = "Closing Balance of this page only. Must be the interemdiary opening balance of the next page (part of the same statement).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(PaginationBalance1 obj) {
			return obj.getIntermediaryClosingBalance();
		}

		@Override
		public void setValue(PaginationBalance1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setIntermediaryClosingBalance(value.orElse(null));
		}
	};
	/**
	 * Either FirstOpeningBalance or IntermediaryOpeningBalance may be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmFirstOpeningBalance
	 * PaginationBalance1.mmFirstOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmIntermediaryOpeningBalance
	 * PaginationBalance1.mmIntermediaryOpeningBalance}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstOpeningBalanceOrIntermediaryOpeningBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either FirstOpeningBalance or IntermediaryOpeningBalance may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor FirstOpeningBalanceOrIntermediaryOpeningBalanceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstOpeningBalanceOrIntermediaryOpeningBalanceRule";
			definition = "Either FirstOpeningBalance or IntermediaryOpeningBalance may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.mmFirstOpeningBalance, com.tools20022.repository.msg.PaginationBalance1.mmIntermediaryOpeningBalance);
		}
	};
	/**
	 * Either FinalClosingBalance or IntermediaryClosingBalance may be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmFinalClosingBalance
	 * PaginationBalance1.mmFinalClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#mmIntermediaryClosingBalance
	 * PaginationBalance1.mmIntermediaryClosingBalance}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosingBalanceOrIntermediaryClosingBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either FinalClosingBalance or IntermediaryClosingBalance may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor FinalClosingBalanceOrIntermediaryClosingBalanceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalClosingBalanceOrIntermediaryClosingBalanceRule";
			definition = "Either FinalClosingBalance or IntermediaryClosingBalance may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaginationBalance1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.mmFinalClosingBalance, com.tools20022.repository.msg.PaginationBalance1.mmIntermediaryClosingBalance);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.mmFirstOpeningBalance, com.tools20022.repository.msg.PaginationBalance1.mmIntermediaryOpeningBalance,
						com.tools20022.repository.msg.PaginationBalance1.mmFinalClosingBalance, com.tools20022.repository.msg.PaginationBalance1.mmIntermediaryClosingBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaginationBalance1";
				definition = "Balance of a financial instrument for a specific statement page.";
				nextVersions_lazy = () -> Arrays.asList(PaginationBalance2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.FirstOpeningBalanceOrIntermediaryOpeningBalanceRule,
						com.tools20022.repository.msg.PaginationBalance1.FinalClosingBalanceOrIntermediaryClosingBalanceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity1> getFirstOpeningBalance() {
		return firstOpeningBalance == null ? Optional.empty() : Optional.of(firstOpeningBalance);
	}

	public PaginationBalance1 setFirstOpeningBalance(FinancialInstrumentQuantity1 firstOpeningBalance) {
		this.firstOpeningBalance = firstOpeningBalance;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getIntermediaryOpeningBalance() {
		return intermediaryOpeningBalance == null ? Optional.empty() : Optional.of(intermediaryOpeningBalance);
	}

	public PaginationBalance1 setIntermediaryOpeningBalance(FinancialInstrumentQuantity1 intermediaryOpeningBalance) {
		this.intermediaryOpeningBalance = intermediaryOpeningBalance;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getFinalClosingBalance() {
		return finalClosingBalance == null ? Optional.empty() : Optional.of(finalClosingBalance);
	}

	public PaginationBalance1 setFinalClosingBalance(FinancialInstrumentQuantity1 finalClosingBalance) {
		this.finalClosingBalance = finalClosingBalance;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getIntermediaryClosingBalance() {
		return intermediaryClosingBalance == null ? Optional.empty() : Optional.of(intermediaryClosingBalance);
	}

	public PaginationBalance1 setIntermediaryClosingBalance(FinancialInstrumentQuantity1 intermediaryClosingBalance) {
		this.intermediaryClosingBalance = intermediaryClosingBalance;
		return this;
	}
}