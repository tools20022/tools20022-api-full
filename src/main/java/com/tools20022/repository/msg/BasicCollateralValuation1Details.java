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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.HaircutValuation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Basic valuation details of a collateral position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details#mmValuationHaircut
 * BasicCollateralValuation1Details.mmValuationHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details#mmHaircutSource
 * BasicCollateralValuation1Details.mmHaircutSource}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.HaircutValuation
 * HaircutValuation}</li>
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
 * "BasicCollateralValuation1Details"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Basic valuation details of a collateral position."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BasicCollateralValuation1Details", propOrder = {"valuationHaircut", "haircutSource"})
public class BasicCollateralValuation1Details {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate valuationHaircut;
	/**
	 * Haircut percentage applied to the market value of underlying assets used
	 * as collateral as a risk control measure. The institution valuating the
	 * collateral calculates the value of underlying assets based on its market
	 * value less a certain percentage (the haircut).
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
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details
	 * BasicCollateralValuation1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut percentage applied to the market value of underlying assets used as collateral as a risk control measure. The institution valuating the collateral calculates the value of underlying assets based on its market value less a certain percentage (the haircut)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> BasicCollateralValuation1Details.mmObject();
			isDerived = false;
			xmlTag = "ValtnHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationHaircut";
			definition = "Haircut percentage applied to the market value of underlying assets used as collateral as a risk control measure. The institution valuating the collateral calculates the value of underlying assets based on its market value less a certain percentage (the haircut).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PartyIdentification15 haircutSource;
	/**
	 * Place where the valuation haircut was calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification15
	 * PartyIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details
	 * BasicCollateralValuation1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HrcutSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HaircutSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the valuation haircut was calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircutSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BasicCollateralValuation1Details.mmObject();
			isDerived = false;
			xmlTag = "HrcutSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HaircutSource";
			definition = "Place where the valuation haircut was calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BasicCollateralValuation1Details.mmValuationHaircut, BasicCollateralValuation1Details.mmHaircutSource);
				trace_lazy = () -> HaircutValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BasicCollateralValuation1Details";
				definition = "Basic valuation details of a collateral position.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ValtnHrcut", required = true)
	public PercentageRate getValuationHaircut() {
		return valuationHaircut;
	}

	public void setValuationHaircut(PercentageRate valuationHaircut) {
		this.valuationHaircut = valuationHaircut;
	}

	@XmlElement(name = "HrcutSrc")
	public PartyIdentification15 getHaircutSource() {
		return haircutSource;
	}

	public void setHaircutSource(com.tools20022.repository.msg.PartyIdentification15 haircutSource) {
		this.haircutSource = haircutSource;
	}
}