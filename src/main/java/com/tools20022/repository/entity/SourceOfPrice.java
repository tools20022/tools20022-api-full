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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PriceSourceFormatChoice;
import com.tools20022.repository.codeset.PriceSourceCode;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Place from which the price was obtained.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SourceOfPrice" src="doc-files/SourceOfPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceSource PriceSource}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice
 * PriceSourceFormatChoice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
 * TradingMarket.mmSourceOfPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#mmNonLocalMarketPlace
 * PriceSourceFormatChoice.mmNonLocalMarketPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation1#mmSourceOfPrice
 * PriceInformation1.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmSourceOfPrice
 * PriceInformation2.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation3#mmSourceOfPrice
 * PriceInformation3.mmSourceOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price6#mmSource
 * Price6.mmSource}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
 * SourceOfPrice.mmMarketIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SourceOfPrice#mmType
 * SourceOfPrice.mmType}</li>
 * </ul>
 * </li>
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
 * "SourceOfPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Place from which the price was obtained."</li>
 * </ul>
 */
public class SourceOfPrice extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradingMarket marketIdentification;
	/**
	 * Market on which this price is valid (MIC - ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
	 * TradingMarket.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#mmSourceOfPrice
	 * PriceInformation5.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#mmSourceOfPrice
	 * PriceInformation7.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#mmSourceOfPrice
	 * PriceInformation6.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#mmSourceOfPrice
	 * PriceInformation8.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#mmSourceOfPrice
	 * PriceInformation9.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmSourceOfPrice
	 * PriceInformation11.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#mmSourceOfPrice
	 * PriceInformation12.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmSourceOfPrice
	 * PriceInformation13.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#mmSourceOfPrice
	 * PriceInformation16.mmSourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#mmSourceOfPrice
	 * PriceInformation14.mmSourceOfPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market on which this price is valid (MIC - ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarketIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceInformation5.mmSourceOfPrice, PriceInformation7.mmSourceOfPrice, PriceInformation6.mmSourceOfPrice, PriceInformation8.mmSourceOfPrice, PriceInformation9.mmSourceOfPrice,
					PriceInformation11.mmSourceOfPrice, PriceInformation12.mmSourceOfPrice, PriceInformation13.mmSourceOfPrice, PriceInformation16.mmSourceOfPrice, PriceInformation14.mmSourceOfPrice);
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketIdentification";
			definition = "Market on which this price is valid (MIC - ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected PriceSourceCode type;
	/**
	 * Specifies the type of the source of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
	 * PriceSourceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the source of the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the source of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceSourceCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SourceOfPrice";
				definition = "Place from which the price was obtained.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice);
				derivationElement_lazy = () -> Arrays.asList(PriceSourceFormatChoice.mmNonLocalMarketPlace, PriceInformation1.mmSourceOfPrice, PriceInformation2.mmSourceOfPrice, PriceInformation3.mmSourceOfPrice, Price6.mmSource);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(SourceOfPrice.mmMarketIdentification, SourceOfPrice.mmType);
				derivationComponent_lazy = () -> Arrays.asList(PriceSource.mmObject(), PriceSourceFormatChoice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TradingMarket getMarketIdentification() {
		return marketIdentification;
	}

	public void setMarketIdentification(com.tools20022.repository.entity.TradingMarket marketIdentification) {
		this.marketIdentification = marketIdentification;
	}

	public PriceSourceCode getType() {
		return type;
	}

	public void setType(PriceSourceCode type) {
		this.type = type;
	}
}