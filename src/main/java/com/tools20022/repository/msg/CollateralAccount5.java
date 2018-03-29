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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginAccount1;
import com.tools20022.repository.msg.PartyIdentification122;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Operational construct used by a central counterparty to record ownership of
 * assets posted as collateral by clearing members to meet their obligations at
 * the central counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAccount5#mmIdentification
 * CollateralAccount5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAccount5#mmRelatedMarginAccount
 * CollateralAccount5.mmRelatedMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAccount5#mmTitleTransferCollateralArrangement
 * CollateralAccount5.mmTitleTransferCollateralArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAccount5#mmCollateralSegregationByValue
 * CollateralAccount5.mmCollateralSegregationByValue}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAccount5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralAccount4
 * CollateralAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralAccount5", propOrder = {"identification", "relatedMarginAccount", "titleTransferCollateralArrangement", "collateralSegregationByValue"})
public class CollateralAccount5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification122 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification122
	 * PartyIdentification122}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount5
	 * CollateralAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifer for the collateral account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount4#mmIdentification
	 * CollateralAccount4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralAccount5, PartyIdentification122> mmIdentification = new MMMessageAssociationEnd<CollateralAccount5, PartyIdentification122>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAccount5.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifer for the collateral account.";
			previousVersion_lazy = () -> CollateralAccount4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification122.mmObject();
		}

		@Override
		public PartyIdentification122 getValue(CollateralAccount5 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CollateralAccount5 obj, PartyIdentification122 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "RltdMrgnAcct", required = true)
	protected List<MarginAccount1> relatedMarginAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginAccount1
	 * MarginAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
	 * Collateral.mmCollateralAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount5
	 * CollateralAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMrgnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralAccount5, List<MarginAccount1>> mmRelatedMarginAccount = new MMMessageAssociationEnd<CollateralAccount5, List<MarginAccount1>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAccount5.mmObject();
			isDerived = false;
			xmlTag = "RltdMrgnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMarginAccount";
			definition = "Operational construct used to record the set of positions whose margin requirements is calculated on a gross basis.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginAccount1.mmObject();
		}

		@Override
		public List<MarginAccount1> getValue(CollateralAccount5 obj) {
			return obj.getRelatedMarginAccount();
		}

		@Override
		public void setValue(CollateralAccount5 obj, List<MarginAccount1> value) {
			obj.setRelatedMarginAccount(value);
		}
	};
	@XmlElement(name = "TitlTrfCollArrgmnt")
	protected YesNoIndicator titleTransferCollateralArrangement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount5
	 * CollateralAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TitlTrfCollArrgmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TitleTransferCollateralArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account can be used for clients of UK FCA authorised firms subject to Title Transfer Collateral Arrangements (TTCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAccount5, Optional<YesNoIndicator>> mmTitleTransferCollateralArrangement = new MMMessageAttribute<CollateralAccount5, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAccount5.mmObject();
			isDerived = false;
			xmlTag = "TitlTrfCollArrgmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TitleTransferCollateralArrangement";
			definition = "Indicates whether the account can be used for clients of UK FCA authorised firms subject to Title Transfer Collateral Arrangements (TTCA).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CollateralAccount5 obj) {
			return obj.getTitleTransferCollateralArrangement();
		}

		@Override
		public void setValue(CollateralAccount5 obj, Optional<YesNoIndicator> value) {
			obj.setTitleTransferCollateralArrangement(value.orElse(null));
		}
	};
	@XmlElement(name = "CollSgrtnByVal")
	protected YesNoIndicator collateralSegregationByValue;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount5
	 * CollateralAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSgrtnByVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSegregationByValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the client collateral is segregated by value in accordance with local regulations. Usage: In the context of clearing members with US clients, in accordance with Section 4d(a)(2) of the Commodity Exchange Act."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAccount5, Optional<YesNoIndicator>> mmCollateralSegregationByValue = new MMMessageAttribute<CollateralAccount5, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAccount5.mmObject();
			isDerived = false;
			xmlTag = "CollSgrtnByVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSegregationByValue";
			definition = "Indicates whether the client collateral is segregated by value in accordance with local regulations. Usage: In the context of clearing members with US clients, in accordance with Section 4d(a)(2) of the Commodity Exchange Act.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CollateralAccount5 obj) {
			return obj.getCollateralSegregationByValue();
		}

		@Override
		public void setValue(CollateralAccount5 obj, Optional<YesNoIndicator> value) {
			obj.setCollateralSegregationByValue(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralAccount5.mmIdentification, com.tools20022.repository.msg.CollateralAccount5.mmRelatedMarginAccount,
						com.tools20022.repository.msg.CollateralAccount5.mmTitleTransferCollateralArrangement, com.tools20022.repository.msg.CollateralAccount5.mmCollateralSegregationByValue);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralAccount5";
				definition = "Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty.";
				previousVersion_lazy = () -> CollateralAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification122 getIdentification() {
		return identification;
	}

	public CollateralAccount5 setIdentification(PartyIdentification122 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<MarginAccount1> getRelatedMarginAccount() {
		return relatedMarginAccount == null ? relatedMarginAccount = new ArrayList<>() : relatedMarginAccount;
	}

	public CollateralAccount5 setRelatedMarginAccount(List<MarginAccount1> relatedMarginAccount) {
		this.relatedMarginAccount = Objects.requireNonNull(relatedMarginAccount);
		return this;
	}

	public Optional<YesNoIndicator> getTitleTransferCollateralArrangement() {
		return titleTransferCollateralArrangement == null ? Optional.empty() : Optional.of(titleTransferCollateralArrangement);
	}

	public CollateralAccount5 setTitleTransferCollateralArrangement(YesNoIndicator titleTransferCollateralArrangement) {
		this.titleTransferCollateralArrangement = titleTransferCollateralArrangement;
		return this;
	}

	public Optional<YesNoIndicator> getCollateralSegregationByValue() {
		return collateralSegregationByValue == null ? Optional.empty() : Optional.of(collateralSegregationByValue);
	}

	public CollateralAccount5 setCollateralSegregationByValue(YesNoIndicator collateralSegregationByValue) {
		this.collateralSegregationByValue = collateralSegregationByValue;
		return this;
	}
}