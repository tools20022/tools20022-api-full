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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DerivativeCommodity2;
import com.tools20022.repository.msg.DerivativeForeignExchange3;
import com.tools20022.repository.msg.DerivativeInterest3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Structure for defining asset class specific details of a derivative to be
 * declared.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmCommodity
 * AssetClass2.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmInterest
 * AssetClass2.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmForeignExchange
 * AssetClass2.mmForeignExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetClassification
 * AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forAssetClass2
 * ConstraintOneElementPresentRule.forAssetClass2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClass2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Structure for defining asset class specific details of a derivative to be declared."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClass2", propOrder = {"commodity", "interest", "foreignExchange"})
public class AssetClass2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cmmdty")
	protected DerivativeCommodity2 commodity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DerivativeCommodity2
	 * DerivativeCommodity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmmdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fields in this section should only be populated for instruments that have non-financial instrument of type commodity as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClass2, Optional<DerivativeCommodity2>> mmCommodity = new MMMessageAssociationEnd<AssetClass2, Optional<DerivativeCommodity2>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AssetClass2.mmObject();
			isDerived = false;
			xmlTag = "Cmmdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "The fields in this section should only be populated for instruments that have non-financial instrument of type commodity as underlying.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativeCommodity2.mmObject();
		}

		@Override
		public Optional<DerivativeCommodity2> getValue(AssetClass2 obj) {
			return obj.getCommodity();
		}

		@Override
		public void setValue(AssetClass2 obj, Optional<DerivativeCommodity2> value) {
			obj.setCommodity(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected DerivativeInterest3 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DerivativeInterest3
	 * DerivativeInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fields in this section should only be populated for instruments that have non-financial instrument of type interest rates as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClass2, Optional<DerivativeInterest3>> mmInterest = new MMMessageAssociationEnd<AssetClass2, Optional<DerivativeInterest3>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AssetClass2.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "The fields in this section should only be populated for instruments that have non-financial instrument of type interest rates as underlying.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativeInterest3.mmObject();
		}

		@Override
		public Optional<DerivativeInterest3> getValue(AssetClass2 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(AssetClass2 obj, Optional<DerivativeInterest3> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "FX")
	protected DerivativeForeignExchange3 foreignExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
	 * DerivativeForeignExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The fields in this section should only be populated for instruments that have non-financial instrument of type foreign exchange as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClass2, Optional<DerivativeForeignExchange3>> mmForeignExchange = new MMMessageAssociationEnd<AssetClass2, Optional<DerivativeForeignExchange3>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AssetClass2.mmObject();
			isDerived = false;
			xmlTag = "FX";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "The fields in this section should only be populated for instruments that have non-financial instrument of type foreign exchange as underlying.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativeForeignExchange3.mmObject();
		}

		@Override
		public Optional<DerivativeForeignExchange3> getValue(AssetClass2 obj) {
			return obj.getForeignExchange();
		}

		@Override
		public void setValue(AssetClass2 obj, Optional<DerivativeForeignExchange3> value) {
			obj.setForeignExchange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AssetClass2.mmCommodity, com.tools20022.repository.msg.AssetClass2.mmInterest, com.tools20022.repository.msg.AssetClass2.mmForeignExchange);
				trace_lazy = () -> AssetClassification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forAssetClass2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClass2";
				definition = "Structure for defining asset class specific details of a derivative to be declared.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DerivativeCommodity2> getCommodity() {
		return commodity == null ? Optional.empty() : Optional.of(commodity);
	}

	public AssetClass2 setCommodity(DerivativeCommodity2 commodity) {
		this.commodity = commodity;
		return this;
	}

	public Optional<DerivativeInterest3> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public AssetClass2 setInterest(DerivativeInterest3 interest) {
		this.interest = interest;
		return this;
	}

	public Optional<DerivativeForeignExchange3> getForeignExchange() {
		return foreignExchange == null ? Optional.empty() : Optional.of(foreignExchange);
	}

	public AssetClass2 setForeignExchange(DerivativeForeignExchange3 foreignExchange) {
		this.foreignExchange = foreignExchange;
		return this;
	}
}