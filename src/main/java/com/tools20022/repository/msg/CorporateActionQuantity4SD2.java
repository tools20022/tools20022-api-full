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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.PlannedQuantity1Choice;
import com.tools20022.repository.codeset.SecuritiesQuantity1Code;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Extension to specify corporate action quantities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#PlaceAndName
 * CorporateActionQuantity4SD2.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#PlannedQuantity
 * CorporateActionQuantity4SD2.PlannedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#PlannedExcessPurchaseQuantity
 * CorporateActionQuantity4SD2.PlannedExcessPurchaseQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#MinimumQuantityCode
 * CorporateActionQuantity4SD2.MinimumQuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#MaximumQuantityCode
 * CorporateActionQuantity4SD2.MaximumQuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#OldShareUnitQuantity
 * CorporateActionQuantity4SD2.OldShareUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#NewShareUnitQuantity
 * CorporateActionQuantity4SD2.NewShareUnitQuantity}</li>
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
 * "CorporateActionQuantity4SD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension to specify corporate action quantities."</li>
 * </ul>
 */
public class CorporateActionQuantity4SD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance. <br>
	 * <br>
	 * In the case of XML, this is expressed by a valid XPath.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
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
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Planned number of shares to be purchased.<br>
	 * 買付予定株式数
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlannedQuantity1Choice
	 * PlannedQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlandQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlannedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned number of shares to be purchased.\r\n 買付予定株式数"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlannedQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlandQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedQuantity";
			definition = "Planned number of shares to be purchased.\r\n 買付予定株式数";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PlannedQuantity1Choice.mmObject();
		}
	};
	/**
	 * Planned excess quantity of share purchase.<br>
	 * 買付超過予定数<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PlannedQuantity1Choice
	 * PlannedQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlandXcssPurchsQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlannedExcessPurchaseQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned excess quantity of share purchase.\r\n買付超過予定数\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PlannedExcessPurchaseQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlandXcssPurchsQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedExcessPurchaseQuantity";
			definition = "Planned excess quantity of share purchase.\r\n買付超過予定数\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PlannedQuantity1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * TSE/JASDEC code for the minimum number of shares to be purchased when the
	 * corporate action event type code is TEND or BIDS.<br>
	 * 買付株数に係る下限設定が「下限設定あり」「未定」
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesQuantity1Code
	 * SecuritiesQuantity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQtyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TSE/JASDEC code for the minimum number of shares to be purchased when the corporate action event type code  is TEND or BIDS.\r\n買付株数に係る下限設定が「下限設定あり」「未定」"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MinimumQuantityCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "MinQtyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantityCode";
			definition = "TSE/JASDEC code for the minimum number of shares to be purchased when the corporate action event type code  is TEND or BIDS.\r\n買付株数に係る下限設定が「下限設定あり」「未定」";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesQuantity1Code.mmObject();
		}
	};
	/**
	 * TSE/JASDEC code for the maximum number of shares to be purchased when the
	 * corporate action event type code is TEND or BIDS.<br>
	 * 買付株数に係る上限設定が「上限設定あり」「未定」
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesQuantity1Code
	 * SecuritiesQuantity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxQtyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TSE/JASDEC code for the maximum number of shares to be purchased when the corporate action event type code is TEND or BIDS.\r\n 買付株数に係る上限設定が「上限設定あり」「未定」"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaximumQuantityCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "MaxQtyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantityCode";
			definition = "TSE/JASDEC code for the maximum number of shares to be purchased when the corporate action event type code is TEND or BIDS.\r\n 買付株数に係る上限設定が「上限設定あり」「未定」";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesQuantity1Code.mmObject();
		}
	};
	/**
	 * Old share unit quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdShrUnitQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldShareUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Old share unit quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OldShareUnitQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "OdShrUnitQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldShareUnitQuantity";
			definition = "Old share unit quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	/**
	 * New share unit quantity.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2
	 * CorporateActionQuantity4SD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewShrUnitQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewShareUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New share unit quantity.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewShareUnitQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "NewShrUnitQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewShareUnitQuantity";
			definition = "New share unit quantity.\r\n";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity4SD2.PlaceAndName, com.tools20022.repository.msg.CorporateActionQuantity4SD2.PlannedQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.PlannedExcessPurchaseQuantity, com.tools20022.repository.msg.CorporateActionQuantity4SD2.MinimumQuantityCode,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.MaximumQuantityCode, com.tools20022.repository.msg.CorporateActionQuantity4SD2.OldShareUnitQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.NewShareUnitQuantity);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionQuantity4SD2";
				definition = "Extension to specify corporate action quantities.";
			}
		});
		return mmObject_lazy.get();
	}
}