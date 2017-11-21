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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the securities posted as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmCollateralIdentification
 * SecuritiesCollateral4.mmCollateralIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmAssetNumber
 * SecuritiesCollateral4.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSecurityIdentification
 * SecuritiesCollateral4.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmMaturityDate
 * SecuritiesCollateral4.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmLimitedCoverageIndicator
 * SecuritiesCollateral4.mmLimitedCoverageIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmQuantity
 * SecuritiesCollateral4.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmPrice
 * SecuritiesCollateral4.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmMarketValue
 * SecuritiesCollateral4.mmMarketValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmHaircut
 * SecuritiesCollateral4.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmCollateralValue
 * SecuritiesCollateral4.mmCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmValueDate
 * SecuritiesCollateral4.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSafekeepingAccount
 * SecuritiesCollateral4.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSafekeepingPlace
 * SecuritiesCollateral4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSettlementParameters
 * SecuritiesCollateral4.mmSettlementParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
 * "SecuritiesCollateral4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the securities posted as collateral."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCollateral7
 * SecuritiesCollateral7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3
 * SecuritiesCollateral3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesCollateral4", propOrder = {"collateralIdentification", "assetNumber", "securityIdentification", "maturityDate", "limitedCoverageIndicator", "quantity", "price", "marketValue", "haircut", "collateralValue",
		"valueDate", "safekeepingAccount", "safekeepingPlace", "settlementParameters"})
public class SecuritiesCollateral4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text collateralIdentification;
	/**
	 * Provides the identification of the proposed collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the proposed collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmCollateralIdentification
	 * SecuritiesCollateral7.mmCollateralIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmCollateralIdentification
	 * SecuritiesCollateral3.mmCollateralIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the proposed collateral.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmCollateralIdentification);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmCollateralIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text assetNumber;
	/**
	 * Identifies the register number of the collateral deposit assigned by the
	 * central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the register number of the collateral deposit assigned by the central counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmAssetNumber
	 * SecuritiesCollateral7.mmAssetNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssetNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmAssetNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecurityIdentification14 securityIdentification;
	/**
	 * Identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSecurityIdentification
	 * SecuritiesCollateral7.mmSecurityIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSecurityIdentification
	 * SecuritiesCollateral3.mmSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmSecurityIdentification);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected DateAndDateTimeChoice maturityDate;
	/**
	 * Planned final repayment date at the time of issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmMaturityDate
	 * SecuritiesCollateral7.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmMaturityDate
	 * SecuritiesCollateral3.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmMaturityDate);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected YesNoIndicator limitedCoverageIndicator;
	/**
	 * Indicates that the collateral posted in the clearing house covers the
	 * margin until a specific timeframe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtdCvrgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedCoverageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the collateral posted in the clearing house covers the margin until a specific timeframe."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmLimitedCoverageIndicator
	 * SecuritiesCollateral7.mmLimitedCoverageIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmLimitedCoverageIndicator
	 * SecuritiesCollateral3.mmLimitedCoverageIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLimitedCoverageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "LtdCvrgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedCoverageIndicator";
			definition = "Indicates that the collateral posted in the clearing house covers the margin until a specific timeframe.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmLimitedCoverageIndicator);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmLimitedCoverageIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice quantity;
	/**
	 * Quantity of securities collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmQuantity
	 * SecuritiesCollateral7.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmQuantity
	 * SecuritiesCollateral3.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities collateral.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmQuantity);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected Price2 price;
	/**
	 * Indicates the price of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the price of the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmPrice
	 * SecuritiesCollateral7.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmPrice
	 * SecuritiesCollateral3.mmPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price of the security.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmPrice);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketValue;
	/**
	 * Value of the collateral based on current market prices.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral based on current market prices."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmMarketValue
	 * SecuritiesCollateral7.mmMarketValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmMarketValue
	 * SecuritiesCollateral3.mmMarketValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "MktVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValue";
			definition = "Value of the collateral based on current market prices.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmMarketValue);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmMarketValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate haircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
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
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
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
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmHaircut
	 * SecuritiesCollateral7.mmHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmHaircut
	 * SecuritiesCollateral3.mmHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmHaircut);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * Value of the collateral after taking into account the haircut.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
	 * AssetHolding.mmRiskAdjustedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after taking into account the haircut."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmCollateralValue
	 * SecuritiesCollateral7.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmCollateralValue
	 * SecuritiesCollateral3.mmCollateralValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmRiskAdjustedValue;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Value of the collateral after taking into account the haircut.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmCollateralValue);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmCollateralValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Valuation date of the securities taken as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the securities taken as collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmValueDate
	 * SecuritiesCollateral7.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmValueDate
	 * SecuritiesCollateral3.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Valuation date of the securities taken as collateral.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmValueDate);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingAccount
	 * SecuritiesCollateral7.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSafekeepingAccount
	 * SecuritiesCollateral3.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
	 * SafekeepingPlaceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingPlace
	 * SecuritiesCollateral7.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSafekeepingPlace
	 * SecuritiesCollateral3.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmSafekeepingPlace);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat7Choice.mmObject();
		}
	};
	protected SettlementDetails88 settlementParameters;
	/**
	 * Parameters which explicitly state the conditions that must be fulfilled
	 * before a particular transaction of a financial instrument can be settled.
	 * These parameters are defined by the instructing party in compliance with
	 * settlement rules in the market the transaction will settle in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails88
	 * SettlementDetails88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
	 * Security.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4
	 * SecuritiesCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSettlementParameters
	 * SecuritiesCollateral7.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSettlementParameters
	 * SecuritiesCollateral3.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesSettlement;
			componentContext_lazy = () -> SecuritiesCollateral4.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesCollateral3.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDetails88.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesCollateral4.mmCollateralIdentification, SecuritiesCollateral4.mmAssetNumber, SecuritiesCollateral4.mmSecurityIdentification, SecuritiesCollateral4.mmMaturityDate,
						SecuritiesCollateral4.mmLimitedCoverageIndicator, SecuritiesCollateral4.mmQuantity, SecuritiesCollateral4.mmPrice, SecuritiesCollateral4.mmMarketValue, SecuritiesCollateral4.mmHaircut,
						SecuritiesCollateral4.mmCollateralValue, SecuritiesCollateral4.mmValueDate, SecuritiesCollateral4.mmSafekeepingAccount, SecuritiesCollateral4.mmSafekeepingPlace, SecuritiesCollateral4.mmSettlementParameters);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCollateral4";
				definition = "Provides details about the securities posted as collateral.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesCollateral7.mmObject());
				previousVersion_lazy = () -> SecuritiesCollateral3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollId")
	public Max35Text getCollateralIdentification() {
		return collateralIdentification;
	}

	public void setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
	}

	@XmlElement(name = "AsstNb")
	public Max35Text getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
	}

	@XmlElement(name = "SctyId", required = true)
	public SecurityIdentification14 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification14 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "MtrtyDt")
	public DateAndDateTimeChoice getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(DateAndDateTimeChoice maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "LtdCvrgInd")
	public YesNoIndicator getLimitedCoverageIndicator() {
		return limitedCoverageIndicator;
	}

	public void setLimitedCoverageIndicator(YesNoIndicator limitedCoverageIndicator) {
		this.limitedCoverageIndicator = limitedCoverageIndicator;
	}

	@XmlElement(name = "Qty", required = true)
	public FinancialInstrumentQuantity1Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(FinancialInstrumentQuantity1Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "Pric")
	public Price2 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.Price2 price) {
		this.price = price;
	}

	@XmlElement(name = "MktVal")
	public ActiveCurrencyAndAmount getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
	}

	@XmlElement(name = "Hrcut")
	public PercentageRate getHaircut() {
		return haircut;
	}

	public void setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
	}

	@XmlElement(name = "CollVal")
	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = collateralValue;
	}

	@XmlElement(name = "ValDt")
	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "SfkpgAcct")
	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "SfkpgPlc", required = true)
	public SafekeepingPlaceFormat7Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails88 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(com.tools20022.repository.msg.SettlementDetails88 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}
}