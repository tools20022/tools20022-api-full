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
import com.tools20022.repository.choice.SecuredCollateral2Choice;
import com.tools20022.repository.codeset.SpecialCollateral2Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Collateral;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details of the security pledge as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#Valuation
 * Collateral18.Valuation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#Haircut
 * Collateral18.Haircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Collateral18#SpecialCollateralIndicator
 * Collateral18.SpecialCollateralIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
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
 * "Collateral18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the security pledge as collateral."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Collateral14
 * Collateral14}</li>
 * </ul>
 */
public class Collateral18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides the values of the security pledged as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
	 * SecuredCollateral2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#Valuation
	 * Collateral.Valuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral18 Collateral18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Valtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the values of the security pledged as collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral14#Valuation
	 * Collateral14.Valuation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Valuation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Collateral18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.Valuation;
			isDerived = false;
			xmlTag = "Valtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valuation";
			definition = "Provides the values of the security pledged as collateral.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Collateral14.Valuation;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuredCollateral2Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Risk control measure applied to underlying collateral whereby the value
	 * of that underlying collateral is calculated as the market value of the
	 * assets reduced by a certain percentage. <br>
	 * <br>
	 * For reporting purposes the collateral haircut will be calculated as 100
	 * minus the ratio between the cash lent/borrowed and the market value
	 * including accrued interest of the collateral pledged times 100. <br>
	 * <br>
	 * In the case of multi-collateral repos the haircut will be based on the
	 * ratio between the cash borrowed/lent and the market value, including
	 * accrued interest of each of the individual collateral pledged. <br>
	 * <br>
	 * Only actual values, as opposed to estimated or default values will be
	 * reported for this variable.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Haircut
	 * AssetHolding.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral18 Collateral18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk control measure applied to underlying collateral whereby the value of that underlying collateral is calculated as the market value of the assets reduced by a certain percentage. \r\n\r\nFor reporting purposes the collateral haircut will be calculated as 100 minus the ratio between the cash lent/borrowed and the market value including accrued interest of the collateral pledged times 100. \r\n\r\nIn the case of multi-collateral repos the haircut will be based on the ratio between the cash borrowed/lent and the market value, including accrued interest of each of the individual collateral pledged.  \r\n\r\nOnly actual values, as opposed to estimated or default values will be reported for this variable.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral14#Haircut
	 * Collateral14.Haircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Haircut = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Collateral18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.Haircut;
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Risk control measure applied to underlying collateral whereby the value of that underlying collateral is calculated as the market value of the assets reduced by a certain percentage. \r\n\r\nFor reporting purposes the collateral haircut will be calculated as 100 minus the ratio between the cash lent/borrowed and the market value including accrued interest of the collateral pledged times 100. \r\n\r\nIn the case of multi-collateral repos the haircut will be based on the ratio between the cash borrowed/lent and the market value, including accrued interest of each of the individual collateral pledged.  \r\n\r\nOnly actual values, as opposed to estimated or default values will be reported for this variable.\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Collateral14.Haircut;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Identifies all repurchase agreements conducted against general
	 * collateral, those conducted against special collateral and securities
	 * lending transactions made of matched repurchase agreements and reverse
	 * repurchase agreements transacted versus cash.<br>
	 * - General Collateral is a repurchase transaction in which the security
	 * lender may choose the security to pledge as collateral with the cash
	 * provider amongst a relatively wide range of securities meeting predefined
	 * criteria; <br>
	 * - Special Collateral is a repurchase transaction in which the cash
	 * provider requests a specific security (individual ISIN) to be provided by
	 * the cash borrower;<br>
	 * - Matched and Reverse Repurchase Agreement is a securities lending
	 * transaction as defined by local market practices. <br>
	 * <br>
	 * Usage:<br>
	 * This field is optional and it should be provided only in case it is
	 * feasible for the reporting agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateral2Code
	 * SpecialCollateral2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralType
	 * Collateral.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Collateral18 Collateral18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclCollInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCollateralIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies all repurchase agreements conducted against general collateral, those conducted against special collateral and securities lending transactions made of matched repurchase agreements and reverse repurchase agreements transacted versus cash.\r\n- General Collateral is a repurchase transaction in which the security lender may choose the security to pledge as collateral with the cash provider amongst a relatively wide range of securities meeting predefined criteria; \r\n- Special Collateral is a repurchase transaction in which the cash provider requests a specific security (individual ISIN) to be provided by the cash borrower;\r\n- Matched and Reverse Repurchase Agreement is a securities lending transaction as defined by local market practices. \r\n\r\nUsage:\r\nThis field is optional and it should be provided only in case it is feasible for the reporting agent. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Collateral14#SpecialCollateralIndicator
	 * Collateral14.SpecialCollateralIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SpecialCollateralIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Collateral18.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralType;
			isDerived = false;
			xmlTag = "SpclCollInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCollateralIndicator";
			definition = "Identifies all repurchase agreements conducted against general collateral, those conducted against special collateral and securities lending transactions made of matched repurchase agreements and reverse repurchase agreements transacted versus cash.\r\n- General Collateral is a repurchase transaction in which the security lender may choose the security to pledge as collateral with the cash provider amongst a relatively wide range of securities meeting predefined criteria; \r\n- Special Collateral is a repurchase transaction in which the cash provider requests a specific security (individual ISIN) to be provided by the cash borrower;\r\n- Matched and Reverse Repurchase Agreement is a securities lending transaction as defined by local market practices. \r\n\r\nUsage:\r\nThis field is optional and it should be provided only in case it is feasible for the reporting agent. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Collateral14.SpecialCollateralIndicator;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> SpecialCollateral2Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral18.Valuation, com.tools20022.repository.msg.Collateral18.Haircut, com.tools20022.repository.msg.Collateral18.SpecialCollateralIndicator);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Collateral18";
				definition = "Provides the details of the security pledge as collateral.";
				previousVersion_lazy = () -> Collateral14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}