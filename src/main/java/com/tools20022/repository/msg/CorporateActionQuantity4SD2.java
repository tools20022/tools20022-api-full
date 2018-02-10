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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.PlannedQuantity1Choice;
import com.tools20022.repository.codeset.SecuritiesQuantity1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmPlaceAndName
 * CorporateActionQuantity4SD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmPlannedQuantity
 * CorporateActionQuantity4SD2.mmPlannedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmPlannedExcessPurchaseQuantity
 * CorporateActionQuantity4SD2.mmPlannedExcessPurchaseQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmMinimumQuantityCode
 * CorporateActionQuantity4SD2.mmMinimumQuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmMaximumQuantityCode
 * CorporateActionQuantity4SD2.mmMaximumQuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmOldShareUnitQuantity
 * CorporateActionQuantity4SD2.mmOldShareUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4SD2#mmNewShareUnitQuantity
 * CorporateActionQuantity4SD2.mmNewShareUnitQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfMaximumQuantityCodeRule#forCorporateActionQuantity4SD2
 * ConstraintUseOfMaximumQuantityCodeRule.forCorporateActionQuantity4SD2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfMinimumQuantityCodeRule#forCorporateActionQuantity4SD2
 * ConstraintUseOfMinimumQuantityCodeRule.forCorporateActionQuantity4SD2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfPlannedQuantityRule#forCorporateActionQuantity4SD2
 * ConstraintUseOfPlannedQuantityRule.forCorporateActionQuantity4SD2}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionQuantity4SD2", propOrder = {"placeAndName", "plannedQuantity", "plannedExcessPurchaseQuantity", "minimumQuantityCode", "maximumQuantityCode", "oldShareUnitQuantity", "newShareUnitQuantity"})
public class CorporateActionQuantity4SD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PlandQty")
	protected PlannedQuantity1Choice plannedQuantity;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmPlannedQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlandQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedQuantity";
			definition = "Planned number of shares to be purchased.\r\n 買付予定株式数";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlannedQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "PlandXcssPurchsQty")
	protected PlannedQuantity1Choice plannedExcessPurchaseQuantity;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmPlannedExcessPurchaseQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "PlandXcssPurchsQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedExcessPurchaseQuantity";
			definition = "Planned excess quantity of share purchase.\r\n買付超過予定数\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlannedQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "MinQtyCd")
	protected SecuritiesQuantity1Code minimumQuantityCode;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmMinimumQuantityCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "MinQtyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantityCode";
			definition = "TSE/JASDEC code for the minimum number of shares to be purchased when the corporate action event type code  is TEND or BIDS.\r\n買付株数に係る下限設定が「下限設定あり」「未定」";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesQuantity1Code.mmObject();
		}
	};
	@XmlElement(name = "MaxQtyCd")
	protected SecuritiesQuantity1Code maximumQuantityCode;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmMaximumQuantityCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "MaxQtyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumQuantityCode";
			definition = "TSE/JASDEC code for the maximum number of shares to be purchased when the corporate action event type code is TEND or BIDS.\r\n 買付株数に係る上限設定が「上限設定あり」「未定」";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesQuantity1Code.mmObject();
		}
	};
	@XmlElement(name = "OdShrUnitQty")
	protected FinancialInstrumentQuantity15Choice oldShareUnitQuantity;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmOldShareUnitQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "OdShrUnitQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldShareUnitQuantity";
			definition = "Old share unit quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "NewShrUnitQty")
	protected FinancialInstrumentQuantity15Choice newShareUnitQuantity;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmNewShareUnitQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmObject();
			isDerived = false;
			xmlTag = "NewShrUnitQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewShareUnitQuantity";
			definition = "New share unit quantity.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmPlannedQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmPlannedExcessPurchaseQuantity, com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmMinimumQuantityCode,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmMaximumQuantityCode, com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmOldShareUnitQuantity,
						com.tools20022.repository.msg.CorporateActionQuantity4SD2.mmNewShareUnitQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUseOfMaximumQuantityCodeRule.forCorporateActionQuantity4SD2,
						com.tools20022.repository.constraints.ConstraintUseOfMinimumQuantityCodeRule.forCorporateActionQuantity4SD2, com.tools20022.repository.constraints.ConstraintUseOfPlannedQuantityRule.forCorporateActionQuantity4SD2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionQuantity4SD2";
				definition = "Extension to specify corporate action quantities.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionQuantity4SD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<PlannedQuantity1Choice> getPlannedQuantity() {
		return plannedQuantity == null ? Optional.empty() : Optional.of(plannedQuantity);
	}

	public CorporateActionQuantity4SD2 setPlannedQuantity(PlannedQuantity1Choice plannedQuantity) {
		this.plannedQuantity = plannedQuantity;
		return this;
	}

	public Optional<PlannedQuantity1Choice> getPlannedExcessPurchaseQuantity() {
		return plannedExcessPurchaseQuantity == null ? Optional.empty() : Optional.of(plannedExcessPurchaseQuantity);
	}

	public CorporateActionQuantity4SD2 setPlannedExcessPurchaseQuantity(PlannedQuantity1Choice plannedExcessPurchaseQuantity) {
		this.plannedExcessPurchaseQuantity = plannedExcessPurchaseQuantity;
		return this;
	}

	public Optional<SecuritiesQuantity1Code> getMinimumQuantityCode() {
		return minimumQuantityCode == null ? Optional.empty() : Optional.of(minimumQuantityCode);
	}

	public CorporateActionQuantity4SD2 setMinimumQuantityCode(SecuritiesQuantity1Code minimumQuantityCode) {
		this.minimumQuantityCode = minimumQuantityCode;
		return this;
	}

	public Optional<SecuritiesQuantity1Code> getMaximumQuantityCode() {
		return maximumQuantityCode == null ? Optional.empty() : Optional.of(maximumQuantityCode);
	}

	public CorporateActionQuantity4SD2 setMaximumQuantityCode(SecuritiesQuantity1Code maximumQuantityCode) {
		this.maximumQuantityCode = maximumQuantityCode;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getOldShareUnitQuantity() {
		return oldShareUnitQuantity == null ? Optional.empty() : Optional.of(oldShareUnitQuantity);
	}

	public CorporateActionQuantity4SD2 setOldShareUnitQuantity(FinancialInstrumentQuantity15Choice oldShareUnitQuantity) {
		this.oldShareUnitQuantity = oldShareUnitQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getNewShareUnitQuantity() {
		return newShareUnitQuantity == null ? Optional.empty() : Optional.of(newShareUnitQuantity);
	}

	public CorporateActionQuantity4SD2 setNewShareUnitQuantity(FinancialInstrumentQuantity15Choice newShareUnitQuantity) {
		this.newShareUnitQuantity = newShareUnitQuantity;
		return this;
	}
}