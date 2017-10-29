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
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action instructed balance
 * details at option level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#PlaceAndName
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#OptionUncoveredProtectBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * OptionUncoveredProtectBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#OptionDailyInstructedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * OptionDailyInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#OptionOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * OptionOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#OptionUnacceptedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * OptionUnacceptedBalance}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructedBalanceOptionBalanceDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option level."
 * </li>
 * </ul>
 */
public class CorporateActionInstructedBalanceOptionBalanceDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * xPath to the element that is being extended.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Balance of uncovered protect transactions at an option level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnUcvrdPrtctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionUncoveredProtectBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of uncovered protect transactions at an option level."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OptionUncoveredProtectBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUcvrdPrtctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUncoveredProtectBalance";
			definition = "Balance of uncovered protect transactions at an option level.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Daily total of instructions for a given option. Balance will include only
	 * made instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnDalyInstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDailyInstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Daily total of instructions for a given option.  Balance will include only made instructions.  "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OptionDailyInstructedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnDalyInstdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDailyInstructedBalance";
			definition = "Daily total of instructions for a given option.  Balance will include only made instructions.  ";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * For rights subscription events, total number of oversubscribed units.
	 * When there is an oversubscription priviledge, this quantity will be
	 * included within the Instructed quantityin the core message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For rights subscription events, total number of oversubscribed units.  When there is an oversubscription priviledge, this quantity will be included within the Instructed quantityin the core message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OptionOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnOvrsbcptQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOversubscriptionQuantity";
			definition = "For rights subscription events, total number of oversubscribed units.  When there is an oversubscription priviledge, this quantity will be included within the Instructed quantityin the core message.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * For election merger events, the balance that is being moved into another
	 * option number for payment due to the proration of the original option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1
	 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnUaccptdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionUnacceptedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OptionUnacceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUaccptdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUnacceptedBalance";
			definition = "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.PlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.OptionUncoveredProtectBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.OptionDailyInstructedBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.OptionOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.OptionUnacceptedBalance);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
			}
		});
		return mmObject_lazy.get();
	}
}