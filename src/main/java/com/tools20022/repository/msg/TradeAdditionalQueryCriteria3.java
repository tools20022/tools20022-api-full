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
import com.tools20022.repository.choice.SecuritiesTradeVenueCriteria1Choice;
import com.tools20022.repository.codeset.PartyNatureType1Code;
import com.tools20022.repository.codeset.ProductType4Code;
import com.tools20022.repository.codeset.TransactionOperationType3Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateSectorCriteria3;
import com.tools20022.repository.msg.ProductClassificationCriteria1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Query criteria regarding action type, product classification, venue of
 * execution, asset class, corporate sector nature of counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmActionType
 * TradeAdditionalQueryCriteria3.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmExecutionVenue
 * TradeAdditionalQueryCriteria3.mmExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmNatureOfCounterparty
 * TradeAdditionalQueryCriteria3.mmNatureOfCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmCorporateSector
 * TradeAdditionalQueryCriteria3.mmCorporateSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmAssetClass
 * TradeAdditionalQueryCriteria3.mmAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3#mmProductClassification
 * TradeAdditionalQueryCriteria3.mmProductClassification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forTradeAdditionalQueryCriteria3
 * ConstraintOneElementPresentRule.forTradeAdditionalQueryCriteria3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeAdditionalQueryCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Query criteria regarding action type, product classification, venue of execution, asset class, corporate sector nature of counterparty."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeAdditionalQueryCriteria3", propOrder = {"actionType", "executionVenue", "natureOfCounterparty", "corporateSector", "assetClass", "productClassification"})
public class TradeAdditionalQueryCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp")
	protected List<TransactionOperationType3Code> actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code list of the action types allowed as query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAdditionalQueryCriteria3, List<TransactionOperationType3Code>> mmActionType = new MMMessageAttribute<TradeAdditionalQueryCriteria3, List<TransactionOperationType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Code list of the action types allowed as query criteria.";
			minOccurs = 0;
			simpleType_lazy = () -> TransactionOperationType3Code.mmObject();
		}

		@Override
		public List<TransactionOperationType3Code> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, List<TransactionOperationType3Code> value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "ExctnVn")
	protected SecuritiesTradeVenueCriteria1Choice executionVenue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTradeVenueCriteria1Choice
	 * SecuritiesTradeVenueCriteria1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmMarket
	 * Trade.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the execution venue of the reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<SecuritiesTradeVenueCriteria1Choice>> mmExecutionVenue = new MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<SecuritiesTradeVenueCriteria1Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Indicates the execution venue of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTradeVenueCriteria1Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTradeVenueCriteria1Choice> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getExecutionVenue();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, Optional<SecuritiesTradeVenueCriteria1Choice> value) {
			obj.setExecutionVenue(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrOfCtrPty")
	protected PartyNatureType1Code natureOfCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyNatureType1Code
	 * PartyNatureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrOfCtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NatureOfCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the nature of the reporting counterparty (if is a CCP, a financial, non-financial counterparty or other type of counterparty).\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAdditionalQueryCriteria3, Optional<PartyNatureType1Code>> mmNatureOfCounterparty = new MMMessageAttribute<TradeAdditionalQueryCriteria3, Optional<PartyNatureType1Code>>() {
		{
			businessComponentTrace_lazy = () -> RolePlayer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NtrOfCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NatureOfCounterparty";
			definition = "Indicates the nature of the reporting counterparty (if is a CCP, a financial, non-financial counterparty or other type of counterparty).\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartyNatureType1Code.mmObject();
		}

		@Override
		public Optional<PartyNatureType1Code> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getNatureOfCounterparty();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, Optional<PartyNatureType1Code> value) {
			obj.setNatureOfCounterparty(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpSctr")
	protected CorporateSectorCriteria3 corporateSector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3
	 * CorporateSectorCriteria3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSector
	 * Organisation.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpSctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateSector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate sector of the reporting counterparty.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<CorporateSectorCriteria3>> mmCorporateSector = new MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<CorporateSectorCriteria3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmSector;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CorpSctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateSector";
			definition = "Specifies the corporate sector of the reporting counterparty.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateSectorCriteria3.mmObject();
		}

		@Override
		public Optional<CorporateSectorCriteria3> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getCorporateSector();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, Optional<CorporateSectorCriteria3> value) {
			obj.setCorporateSector(value.orElse(null));
		}
	};
	@XmlElement(name = "AsstClss")
	protected List<ProductType4Code> assetClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType4Code
	 * ProductType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstClss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code list of available values for asset class criteria.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAdditionalQueryCriteria3, List<ProductType4Code>> mmAssetClass = new MMMessageAttribute<TradeAdditionalQueryCriteria3, List<ProductType4Code>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AsstClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClass";
			definition = "Code list of available values for asset class criteria.\r\n";
			minOccurs = 0;
			simpleType_lazy = () -> ProductType4Code.mmObject();
		}

		@Override
		public List<ProductType4Code> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getAssetClass();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, List<ProductType4Code> value) {
			obj.setAssetClass(value);
		}
	};
	@XmlElement(name = "PdctClssfctn")
	protected ProductClassificationCriteria1 productClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1
	 * ProductClassificationCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAdditionalQueryCriteria3
	 * TradeAdditionalQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the product classification of the reported transaction.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<ProductClassificationCriteria1>> mmProductClassification = new MMMessageAssociationEnd<TradeAdditionalQueryCriteria3, Optional<ProductClassificationCriteria1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PdctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductClassification";
			definition = "Indicates the product classification of the reported transaction.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductClassificationCriteria1.mmObject();
		}

		@Override
		public Optional<ProductClassificationCriteria1> getValue(TradeAdditionalQueryCriteria3 obj) {
			return obj.getProductClassification();
		}

		@Override
		public void setValue(TradeAdditionalQueryCriteria3 obj, Optional<ProductClassificationCriteria1> value) {
			obj.setProductClassification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmActionType, com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmExecutionVenue,
						com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmNatureOfCounterparty, com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmCorporateSector,
						com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmAssetClass, com.tools20022.repository.msg.TradeAdditionalQueryCriteria3.mmProductClassification);
				trace_lazy = () -> Trade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forTradeAdditionalQueryCriteria3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeAdditionalQueryCriteria3";
				definition = "Query criteria regarding action type, product classification, venue of execution, asset class, corporate sector nature of counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransactionOperationType3Code> getActionType() {
		return actionType == null ? actionType = new ArrayList<>() : actionType;
	}

	public TradeAdditionalQueryCriteria3 setActionType(List<TransactionOperationType3Code> actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<SecuritiesTradeVenueCriteria1Choice> getExecutionVenue() {
		return executionVenue == null ? Optional.empty() : Optional.of(executionVenue);
	}

	public TradeAdditionalQueryCriteria3 setExecutionVenue(SecuritiesTradeVenueCriteria1Choice executionVenue) {
		this.executionVenue = executionVenue;
		return this;
	}

	public Optional<PartyNatureType1Code> getNatureOfCounterparty() {
		return natureOfCounterparty == null ? Optional.empty() : Optional.of(natureOfCounterparty);
	}

	public TradeAdditionalQueryCriteria3 setNatureOfCounterparty(PartyNatureType1Code natureOfCounterparty) {
		this.natureOfCounterparty = natureOfCounterparty;
		return this;
	}

	public Optional<CorporateSectorCriteria3> getCorporateSector() {
		return corporateSector == null ? Optional.empty() : Optional.of(corporateSector);
	}

	public TradeAdditionalQueryCriteria3 setCorporateSector(CorporateSectorCriteria3 corporateSector) {
		this.corporateSector = corporateSector;
		return this;
	}

	public List<ProductType4Code> getAssetClass() {
		return assetClass == null ? assetClass = new ArrayList<>() : assetClass;
	}

	public TradeAdditionalQueryCriteria3 setAssetClass(List<ProductType4Code> assetClass) {
		this.assetClass = Objects.requireNonNull(assetClass);
		return this;
	}

	public Optional<ProductClassificationCriteria1> getProductClassification() {
		return productClassification == null ? Optional.empty() : Optional.of(productClassification);
	}

	public TradeAdditionalQueryCriteria3 setProductClassification(ProductClassificationCriteria1 productClassification) {
		this.productClassification = productClassification;
		return this;
	}
}