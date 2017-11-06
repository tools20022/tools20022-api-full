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
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUncoveredProtectBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionUncoveredProtectBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionDailyInstructedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionDailyInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1#mmOptionUnacceptedBalance
 * CorporateActionInstructedBalanceOptionBalanceDetailsSD1.
 * mmOptionUnacceptedBalance}</li>
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
	protected Max350Text placeAndName;
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected SignedQuantityFormat9 optionUncoveredProtectBalance;
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
	public static final MMMessageAssociationEnd mmOptionUncoveredProtectBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUcvrdPrtctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUncoveredProtectBalance";
			definition = "Balance of uncovered protect transactions at an option level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 optionDailyInstructedBalance;
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
	public static final MMMessageAssociationEnd mmOptionDailyInstructedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnDalyInstdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDailyInstructedBalance";
			definition = "Daily total of instructions for a given option.  Balance will include only made instructions.  ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 optionOversubscriptionQuantity;
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
	public static final MMMessageAssociationEnd mmOptionOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnOvrsbcptQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOversubscriptionQuantity";
			definition = "For rights subscription events, total number of oversubscribed units.  When there is an oversubscription priviledge, this quantity will be included within the Instructed quantityin the core message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};
	protected SignedQuantityFormat9 optionUnacceptedBalance;
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
	public static final MMMessageAssociationEnd mmOptionUnacceptedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnUaccptdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionUnacceptedBalance";
			definition = "For election merger events, the balance that is being moved into another option number for payment due to the proration of the original option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUncoveredProtectBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionDailyInstructedBalance,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionBalanceDetailsSD1.mmOptionUnacceptedBalance);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option level.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public SignedQuantityFormat9 getOptionUncoveredProtectBalance() {
		return optionUncoveredProtectBalance;
	}

	public void setOptionUncoveredProtectBalance(com.tools20022.repository.msg.SignedQuantityFormat9 optionUncoveredProtectBalance) {
		this.optionUncoveredProtectBalance = optionUncoveredProtectBalance;
	}

	public SignedQuantityFormat9 getOptionDailyInstructedBalance() {
		return optionDailyInstructedBalance;
	}

	public void setOptionDailyInstructedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 optionDailyInstructedBalance) {
		this.optionDailyInstructedBalance = optionDailyInstructedBalance;
	}

	public SignedQuantityFormat9 getOptionOversubscriptionQuantity() {
		return optionOversubscriptionQuantity;
	}

	public void setOptionOversubscriptionQuantity(com.tools20022.repository.msg.SignedQuantityFormat9 optionOversubscriptionQuantity) {
		this.optionOversubscriptionQuantity = optionOversubscriptionQuantity;
	}

	public SignedQuantityFormat9 getOptionUnacceptedBalance() {
		return optionUnacceptedBalance;
	}

	public void setOptionUnacceptedBalance(com.tools20022.repository.msg.SignedQuantityFormat9 optionUnacceptedBalance) {
		this.optionUnacceptedBalance = optionUnacceptedBalance;
	}
}