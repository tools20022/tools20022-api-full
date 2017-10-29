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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PriceSourceFormatChoice;
import com.tools20022.repository.codeset.PriceSourceCode;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.msg.PriceSource;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#MarketIdentification
 * SourceOfPrice.MarketIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SourceOfPrice#Type
 * SourceOfPrice.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#SourceOfPrice
 * TradingMarket.SourceOfPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceSourceFormatChoice#NonLocalMarketPlace
 * PriceSourceFormatChoice.NonLocalMarketPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation1#SourceOfPrice
 * PriceInformation1.SourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation2#SourceOfPrice
 * PriceInformation2.SourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation3#SourceOfPrice
 * PriceInformation3.SourceOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price6#Source Price6.Source}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Market on which this price is valid (MIC - ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#SourceOfPrice
	 * TradingMarket.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation5#SourceOfPrice
	 * PriceInformation5.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation7#SourceOfPrice
	 * PriceInformation7.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation6#SourceOfPrice
	 * PriceInformation6.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation8#SourceOfPrice
	 * PriceInformation8.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation9#SourceOfPrice
	 * PriceInformation9.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#SourceOfPrice
	 * PriceInformation11.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#SourceOfPrice
	 * PriceInformation12.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#SourceOfPrice
	 * PriceInformation13.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16#SourceOfPrice
	 * PriceInformation16.SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation14#SourceOfPrice
	 * PriceInformation14.SourceOfPrice}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market on which this price is valid (MIC - ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarketIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation5.SourceOfPrice, com.tools20022.repository.msg.PriceInformation7.SourceOfPrice, com.tools20022.repository.msg.PriceInformation6.SourceOfPrice,
					com.tools20022.repository.msg.PriceInformation8.SourceOfPrice, com.tools20022.repository.msg.PriceInformation9.SourceOfPrice, com.tools20022.repository.msg.PriceInformation11.SourceOfPrice,
					com.tools20022.repository.msg.PriceInformation12.SourceOfPrice, com.tools20022.repository.msg.PriceInformation13.SourceOfPrice, com.tools20022.repository.msg.PriceInformation16.SourceOfPrice,
					com.tools20022.repository.msg.PriceInformation14.SourceOfPrice);
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketIdentification";
			definition = "Market on which this price is valid (MIC - ISO 3166).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.SourceOfPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SourceOfPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the source of the price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceSourceCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SourceOfPrice";
				definition = "Place from which the price was obtained.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.SourceOfPrice);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceSourceFormatChoice.NonLocalMarketPlace, com.tools20022.repository.msg.PriceInformation1.SourceOfPrice,
						com.tools20022.repository.msg.PriceInformation2.SourceOfPrice, com.tools20022.repository.msg.PriceInformation3.SourceOfPrice, com.tools20022.repository.msg.Price6.Source);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SourceOfPrice.MarketIdentification, com.tools20022.repository.entity.SourceOfPrice.Type);
				derivationComponent_lazy = () -> Arrays.asList(PriceSource.mmObject(), PriceSourceFormatChoice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}