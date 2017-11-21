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
import com.tools20022.repository.choice.InflationIndex1Choice;
import com.tools20022.repository.choice.InterestRateDerivative2Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the interest rate derivative specific elements for interest rate
 * derivatives as defined in the local regulation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingType
 * InterestRateDerivative5.mmUnderlyingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingBond
 * InterestRateDerivative5.mmUnderlyingBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmSwaptionNotionalCurrency
 * InterestRateDerivative5.mmSwaptionNotionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingSwapMaturityDate
 * InterestRateDerivative5.mmUnderlyingSwapMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInflationIndex
 * InterestRateDerivative5.mmInflationIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInterestRateReference
 * InterestRateDerivative5.mmInterestRateReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "InterestRateDerivative5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the interest rate derivative specific elements for interest rate derivatives as defined in the local regulation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InterestRateDerivative5", propOrder = {"underlyingType", "underlyingBond", "swaptionNotionalCurrency", "underlyingSwapMaturityDate", "inflationIndex", "interestRateReference"})
public class InterestRateDerivative5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InterestRateDerivative2Choice underlyingType;
	/**
	 * Specific details on the underlying type of the interest rate derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateDerivative2Choice
	 * InterestRateDerivative2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific details on the underlying type of the interest rate derivative."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingType";
			definition = "Specific details on the underlying type of the interest rate derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestRateDerivative2Choice.mmObject();
		}
	};
	protected BondDerivative2 underlyingBond;
	/**
	 * Populated when the underlying type is a bond or a bond future. Details
	 * the issuer and maturity date of the bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BondDerivative2
	 * BondDerivative2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygBd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Populated when the underlying type is a bond or a bond future.  Details the issuer and maturity date of the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingBond = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygBd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingBond";
			definition = "Populated when the underlying type is a bond or a bond future.  Details the issuer and maturity date of the bond.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BondDerivative2.mmObject();
		}
	};
	protected ActiveCurrencyCode swaptionNotionalCurrency;
	/**
	 * Notional currency of a swaption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwptnNtnlCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwaptionNotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notional currency of a swaption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSwaptionNotionalCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "SwptnNtnlCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwaptionNotionalCurrency";
			definition = "Notional currency of a swaption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ISODate underlyingSwapMaturityDate;
	/**
	 * Maturity date of the underlying swap, populated for swaptions, futures on
	 * swaps and forwards on a swap only.
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygSwpMtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSwapMaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maturity date of the underlying swap, populated for swaptions, futures on swaps and forwards on a swap only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnderlyingSwapMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "UndrlygSwpMtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSwapMaturityDate";
			definition = "Maturity date of the underlying swap, populated for swaptions, futures on swaps and forwards on a swap only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected InflationIndex1Choice inflationIndex;
	/**
	 * Populated to define the inflation index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice
	 * InflationIndex1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfltnIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Populated to define the inflation index."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInflationIndex = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmInterest;
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "InfltnIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationIndex";
			definition = "Populated to define the inflation index.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InflationIndex1Choice.mmObject();
		}
	};
	protected FloatingInterestRate8 interestRateReference;
	/**
	 * Provides the interest rate against a reference rate and term in number of
	 * days, weeks, months or years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingInterestRate8
	 * FloatingInterestRate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5
	 * InterestRateDerivative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the interest rate against a reference rate and term in number of days, weeks, months or years."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRateReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> InterestRateDerivative5.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateReference";
			definition = "Provides the interest rate against a reference rate and term in number of days, weeks, months or years.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FloatingInterestRate8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InterestRateDerivative5.mmUnderlyingType, InterestRateDerivative5.mmUnderlyingBond, InterestRateDerivative5.mmSwaptionNotionalCurrency,
						InterestRateDerivative5.mmUnderlyingSwapMaturityDate, InterestRateDerivative5.mmInflationIndex, InterestRateDerivative5.mmInterestRateReference);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRateDerivative5";
				definition = "Specifies the interest rate derivative specific elements for interest rate derivatives as defined in the local regulation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UndrlygTp", required = true)
	public InterestRateDerivative2Choice getUnderlyingType() {
		return underlyingType;
	}

	public void setUnderlyingType(InterestRateDerivative2Choice underlyingType) {
		this.underlyingType = underlyingType;
	}

	@XmlElement(name = "UndrlygBd")
	public BondDerivative2 getUnderlyingBond() {
		return underlyingBond;
	}

	public void setUnderlyingBond(com.tools20022.repository.msg.BondDerivative2 underlyingBond) {
		this.underlyingBond = underlyingBond;
	}

	@XmlElement(name = "SwptnNtnlCcy")
	public ActiveCurrencyCode getSwaptionNotionalCurrency() {
		return swaptionNotionalCurrency;
	}

	public void setSwaptionNotionalCurrency(ActiveCurrencyCode swaptionNotionalCurrency) {
		this.swaptionNotionalCurrency = swaptionNotionalCurrency;
	}

	@XmlElement(name = "UndrlygSwpMtrtyDt")
	public ISODate getUnderlyingSwapMaturityDate() {
		return underlyingSwapMaturityDate;
	}

	public void setUnderlyingSwapMaturityDate(ISODate underlyingSwapMaturityDate) {
		this.underlyingSwapMaturityDate = underlyingSwapMaturityDate;
	}

	@XmlElement(name = "InfltnIndx")
	public InflationIndex1Choice getInflationIndex() {
		return inflationIndex;
	}

	public void setInflationIndex(InflationIndex1Choice inflationIndex) {
		this.inflationIndex = inflationIndex;
	}

	@XmlElement(name = "IntrstRateRef", required = true)
	public FloatingInterestRate8 getInterestRateReference() {
		return interestRateReference;
	}

	public void setInterestRateReference(com.tools20022.repository.msg.FloatingInterestRate8 interestRateReference) {
		this.interestRateReference = interestRateReference;
	}
}