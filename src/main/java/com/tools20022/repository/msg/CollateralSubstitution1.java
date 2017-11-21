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
import com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code;
import com.tools20022.repository.codeset.CollateralSubstitutionType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the collateral that will be substituted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmCollateralSubstitutionSequence
 * CollateralSubstitution1.mmCollateralSubstitutionSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmSubstitutionRequirement
 * CollateralSubstitution1.mmSubstitutionRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmCollateralSubstitutionType
 * CollateralSubstitution1.mmCollateralSubstitutionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmStandardSettlementInstructions
 * CollateralSubstitution1.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmOtherCollateral
 * CollateralSubstitution1.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmCashCollateral
 * CollateralSubstitution1.mmCashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmSecuritiesCollateral
 * CollateralSubstitution1.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmReferenceDetails
 * CollateralSubstitution1.mmReferenceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralSubstitution
 * CollateralSubstitution}</li>
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
 * "CollateralSubstitution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the collateral that will be substituted."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralSubstitution2
 * CollateralSubstitution2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralSubstitution1", propOrder = {"collateralSubstitutionSequence", "substitutionRequirement", "collateralSubstitutionType", "standardSettlementInstructions", "otherCollateral", "cashCollateral",
		"securitiesCollateral", "referenceDetails"})
public class CollateralSubstitution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralSubstitutionSequence1Code collateralSubstitutionSequence;
	/**
	 * Indicates whether the collateral substitution request is new or updated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code
	 * CollateralSubstitutionSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral substitution request is new or updated."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmCollateralSubstitutionSequence
	 * CollateralSubstitution2.mmCollateralSubstitutionSequence}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralSubstitutionSequence = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionSequence";
			definition = "Indicates whether the collateral substitution request is new or updated.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmCollateralSubstitutionSequence);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionSequence1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount substitutionRequirement;
	/**
	 * Cash value of the requested collateral substitution transfer in the base
	 * currency.
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
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmBaseCurrencyAmount
	 * Collateral.mmBaseCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of the requested collateral substitution transfer in the base currency."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmSubstitutionRequirement
	 * CollateralSubstitution2.mmSubstitutionRequirement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubstitutionRequirement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmBaseCurrencyAmount;
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "SbstitnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequirement";
			definition = "Cash value of the requested collateral substitution transfer in the base currency.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmSubstitutionRequirement);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected CollateralSubstitutionType1Code collateralSubstitutionType;
	/**
	 * Specifies if the collateral that is substituted was posted against the
	 * variation margin or the independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code
	 * CollateralSubstitutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmType
	 * CollateralSubstitution.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmCollateralSubstitutionType
	 * CollateralSubstitution2.mmCollateralSubstitutionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralSubstitutionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralSubstitution.mmType;
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionType";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmCollateralSubstitutionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionType1Code.mmObject();
		}
	};
	protected Max140Text standardSettlementInstructions;
	/**
	 * Identifies the standard settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
	 * CollateralAgreement.mmStandingSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmStandardSettlementInstructions
	 * CollateralSubstitution2.mmStandardSettlementInstructions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardSettlementInstructions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmStandingSettlementInstructions;
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "StdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmStandardSettlementInstructions);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.OtherCollateral1> otherCollateral;
	/**
	 * Collateral type is other than securities or cash for example letter of
	 * credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral1
	 * OtherCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral type is other than securities or cash for example letter of credit."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmOtherCollateral
	 * CollateralSubstitution2.mmOtherCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Collateral type is other than securities or cash for example letter of credit.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmOtherCollateral);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherCollateral1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashCollateral1> cashCollateral;
	/**
	 * Collateral type is cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is cash."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmCashCollateral
	 * CollateralSubstitution2.mmCashCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Collateral type is cash.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmCashCollateral);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashCollateral1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesCollateral1> securitiesCollateral;
	/**
	 * Collateral type is securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1
	 * SecuritiesCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmSecuritiesCollateral
	 * CollateralSubstitution2.mmSecuritiesCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Collateral type is securities.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmSecuritiesCollateral);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCollateral1.mmObject();
		}
	};
	protected Reference17 referenceDetails;
	/**
	 * Provides details on the identification of previously sent and/or received
	 * message(s), in case of updated substitution request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reference17
	 * Reference17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1
	 * CollateralSubstitution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the identification of previously sent and/or received message(s), in case of updated substitution request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmLinkedReferences
	 * CollateralSubstitution2.mmLinkedReferences}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferenceDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CollateralSubstitution1.mmObject();
			isDerived = false;
			xmlTag = "RefDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceDetails";
			definition = "Provides details on the identification of previously sent and/or received message(s), in case of updated substitution request.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmLinkedReferences);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Reference17.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralSubstitution1.mmCollateralSubstitutionSequence, CollateralSubstitution1.mmSubstitutionRequirement, CollateralSubstitution1.mmCollateralSubstitutionType,
						CollateralSubstitution1.mmStandardSettlementInstructions, CollateralSubstitution1.mmOtherCollateral, CollateralSubstitution1.mmCashCollateral, CollateralSubstitution1.mmSecuritiesCollateral,
						CollateralSubstitution1.mmReferenceDetails);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralSubstitution1";
				definition = "Provides details about the collateral that will be substituted.";
				nextVersions_lazy = () -> Arrays.asList(CollateralSubstitution2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollSbstitnSeq", required = true)
	public CollateralSubstitutionSequence1Code getCollateralSubstitutionSequence() {
		return collateralSubstitutionSequence;
	}

	public void setCollateralSubstitutionSequence(CollateralSubstitutionSequence1Code collateralSubstitutionSequence) {
		this.collateralSubstitutionSequence = collateralSubstitutionSequence;
	}

	@XmlElement(name = "SbstitnRqrmnt", required = true)
	public ActiveCurrencyAndAmount getSubstitutionRequirement() {
		return substitutionRequirement;
	}

	public void setSubstitutionRequirement(ActiveCurrencyAndAmount substitutionRequirement) {
		this.substitutionRequirement = substitutionRequirement;
	}

	@XmlElement(name = "CollSbstitnTp", required = true)
	public CollateralSubstitutionType1Code getCollateralSubstitutionType() {
		return collateralSubstitutionType;
	}

	public void setCollateralSubstitutionType(CollateralSubstitutionType1Code collateralSubstitutionType) {
		this.collateralSubstitutionType = collateralSubstitutionType;
	}

	@XmlElement(name = "StdSttlmInstrs")
	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public void setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
	}

	@XmlElement(name = "OthrColl")
	public List<OtherCollateral1> getOtherCollateral() {
		return otherCollateral;
	}

	public void setOtherCollateral(List<com.tools20022.repository.msg.OtherCollateral1> otherCollateral) {
		this.otherCollateral = otherCollateral;
	}

	@XmlElement(name = "CshColl")
	public List<CashCollateral1> getCashCollateral() {
		return cashCollateral;
	}

	public void setCashCollateral(List<com.tools20022.repository.msg.CashCollateral1> cashCollateral) {
		this.cashCollateral = cashCollateral;
	}

	@XmlElement(name = "SctiesColl")
	public List<SecuritiesCollateral1> getSecuritiesCollateral() {
		return securitiesCollateral;
	}

	public void setSecuritiesCollateral(List<com.tools20022.repository.msg.SecuritiesCollateral1> securitiesCollateral) {
		this.securitiesCollateral = securitiesCollateral;
	}

	@XmlElement(name = "RefDtls")
	public Reference17 getReferenceDetails() {
		return referenceDetails;
	}

	public void setReferenceDetails(com.tools20022.repository.msg.Reference17 referenceDetails) {
		this.referenceDetails = referenceDetails;
	}
}