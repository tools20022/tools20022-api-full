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
import com.tools20022.metamodel.MMXor;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FirstOpeningBalance
 * PaginationBalance1.FirstOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#IntermediaryOpeningBalance
 * PaginationBalance1.IntermediaryOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FinalClosingBalance
 * PaginationBalance1.FinalClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#IntermediaryClosingBalance
 * PaginationBalance1.IntermediaryClosingBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaginationBalance1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Balance of a financial instrument for a specific statement page."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaginationBalance2
 * PaginationBalance2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PaginationBalance1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Opening balance of the financial instrument in the statement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of the financial instrument in the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FirstOpeningBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "FrstOpngBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstOpeningBalance";
			definition = "Opening balance of the financial instrument in the statement.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Opening balance of this page only. It must be the interemdiary closing
	 * balance of the previous page (part of the same statement).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryOpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of this page only. It must be the interemdiary closing balance of the previous page (part of the same statement)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IntermediaryOpeningBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyOpngBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryOpeningBalance";
			definition = "Opening balance of this page only. It must be the interemdiary closing balance of the previous page (part of the same statement).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Closing balance of the financial instrument in the statement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of the financial instrument in the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute FinalClosingBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "FnlClsgBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalClosingBalance";
			definition = "Closing balance of the financial instrument in the statement.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Closing Balance of this page only. Must be the interemdiary opening
	 * balance of the next page (part of the same statement).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing Balance of this page only. Must be the interemdiary opening balance of the next page (part of the same statement)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute IntermediaryClosingBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaginationBalance1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyClsgBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryClosingBalance";
			definition = "Closing Balance of this page only. Must be the interemdiary opening balance of the next page (part of the same statement).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Either FirstOpeningBalance or IntermediaryOpeningBalance may be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FirstOpeningBalance
	 * PaginationBalance1.FirstOpeningBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#IntermediaryOpeningBalance
	 * PaginationBalance1.IntermediaryOpeningBalance}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstOpeningBalanceOrIntermediaryOpeningBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either FirstOpeningBalance or IntermediaryOpeningBalance may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor FirstOpeningBalanceOrIntermediaryOpeningBalanceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstOpeningBalanceOrIntermediaryOpeningBalanceRule";
			definition = "Either FirstOpeningBalance or IntermediaryOpeningBalance may be present, but not both.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.FirstOpeningBalance, com.tools20022.repository.msg.PaginationBalance1.IntermediaryOpeningBalance);
			messageComponent_lazy = () -> PaginationBalance1.mmObject();
		}
	};
	/**
	 * Either FinalClosingBalance or IntermediaryClosingBalance may be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#FinalClosingBalance
	 * PaginationBalance1.FinalClosingBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1#IntermediaryClosingBalance
	 * PaginationBalance1.IntermediaryClosingBalance}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
	 * PaginationBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalClosingBalanceOrIntermediaryClosingBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either FinalClosingBalance or IntermediaryClosingBalance may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor FinalClosingBalanceOrIntermediaryClosingBalanceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalClosingBalanceOrIntermediaryClosingBalanceRule";
			definition = "Either FinalClosingBalance or IntermediaryClosingBalance may be present, but not both.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.FinalClosingBalance, com.tools20022.repository.msg.PaginationBalance1.IntermediaryClosingBalance);
			messageComponent_lazy = () -> PaginationBalance1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance1.FirstOpeningBalance, com.tools20022.repository.msg.PaginationBalance1.IntermediaryOpeningBalance,
						com.tools20022.repository.msg.PaginationBalance1.FinalClosingBalance, com.tools20022.repository.msg.PaginationBalance1.IntermediaryClosingBalance);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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
}