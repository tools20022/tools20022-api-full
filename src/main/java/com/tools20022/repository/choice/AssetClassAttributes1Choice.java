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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AssetClassAttributes1;
import com.tools20022.repository.msg.DerivativeForeignExchange2;
import com.tools20022.repository.msg.DerivativeInterest2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Asset class specific details of a derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmInterest
 * AssetClassAttributes1Choice.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmForeignExchange
 * AssetClassAttributes1Choice.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmBoth
 * AssetClassAttributes1Choice.mmBoth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "AssetClassAttributes1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Asset class specific details of a derivative."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassAttributes1Choice", propOrder = {"interest", "foreignExchange", "both"})
public class AssetClassAttributes1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Intrst", required = true)
	protected DerivativeInterest2 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DerivativeInterest2
	 * DerivativeInterest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
	 * AssetClassAttributes1Choice}</li>
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
	 * "Asset class is a non-financial instrument of type interest rate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassAttributes1Choice, DerivativeInterest2> mmInterest = new MMMessageAssociationEnd<AssetClassAttributes1Choice, DerivativeInterest2>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassAttributes1Choice.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Asset class is a non-financial instrument of type interest rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DerivativeInterest2.mmObject();
		}

		@Override
		public DerivativeInterest2 getValue(AssetClassAttributes1Choice obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(AssetClassAttributes1Choice obj, DerivativeInterest2 value) {
			obj.setInterest(value);
		}
	};
	@XmlElement(name = "FX", required = true)
	protected DerivativeForeignExchange2 foreignExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2
	 * DerivativeForeignExchange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
	 * AssetClassAttributes1Choice}</li>
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
	 * "Asset class is a non-financial instrument of type foreign exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassAttributes1Choice, DerivativeForeignExchange2> mmForeignExchange = new MMMessageAssociationEnd<AssetClassAttributes1Choice, DerivativeForeignExchange2>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassAttributes1Choice.mmObject();
			isDerived = false;
			xmlTag = "FX";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "Asset class is a non-financial instrument of type foreign exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DerivativeForeignExchange2.mmObject();
		}

		@Override
		public DerivativeForeignExchange2 getValue(AssetClassAttributes1Choice obj) {
			return obj.getForeignExchange();
		}

		@Override
		public void setValue(AssetClassAttributes1Choice obj, DerivativeForeignExchange2 value) {
			obj.setForeignExchange(value);
		}
	};
	@XmlElement(name = "Both", required = true)
	protected AssetClassAttributes1 both;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AssetClassAttributes1
	 * AssetClassAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
	 * AssetClassAttributes1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Both"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Both"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asset class is composed of both an interest derivate and a foreign exchange derivative."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassAttributes1Choice, AssetClassAttributes1> mmBoth = new MMMessageAssociationEnd<AssetClassAttributes1Choice, AssetClassAttributes1>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassAttributes1Choice.mmObject();
			isDerived = false;
			xmlTag = "Both";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Both";
			definition = "Asset class is composed of both an interest derivate and a foreign exchange derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassAttributes1.mmObject();
		}

		@Override
		public AssetClassAttributes1 getValue(AssetClassAttributes1Choice obj) {
			return obj.getBoth();
		}

		@Override
		public void setValue(AssetClassAttributes1Choice obj, AssetClassAttributes1 value) {
			obj.setBoth(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassAttributes1Choice.mmInterest, com.tools20022.repository.choice.AssetClassAttributes1Choice.mmForeignExchange,
						com.tools20022.repository.choice.AssetClassAttributes1Choice.mmBoth);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassAttributes1Choice";
				definition = "Asset class specific details of a derivative.";
			}
		});
		return mmObject_lazy.get();
	}

	public DerivativeInterest2 getInterest() {
		return interest;
	}

	public AssetClassAttributes1Choice setInterest(DerivativeInterest2 interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public DerivativeForeignExchange2 getForeignExchange() {
		return foreignExchange;
	}

	public AssetClassAttributes1Choice setForeignExchange(DerivativeForeignExchange2 foreignExchange) {
		this.foreignExchange = Objects.requireNonNull(foreignExchange);
		return this;
	}

	public AssetClassAttributes1 getBoth() {
		return both;
	}

	public AssetClassAttributes1Choice setBoth(AssetClassAttributes1 both) {
		this.both = Objects.requireNonNull(both);
		return this;
	}
}