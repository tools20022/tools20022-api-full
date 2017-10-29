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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of securities purchased or sold in one transaction. In terms of
 * options, a lot represents the number of contracts contained in one derivative
 * security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LotBreakdown" src="doc-files/LotBreakdown.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotUnit
 * LotBreakdown.LotUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#SecuritiesQuantity
 * LotBreakdown.SecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotNumber
 * LotBreakdown.LotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotDateTime
 * LotBreakdown.LotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotPrice
 * LotBreakdown.LotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#LotIdentifier
 * LotBreakdown.LotIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#TradeLotMarket
 * LotBreakdown.TradeLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#QuoteLotMarket
 * LotBreakdown.QuoteLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#RoundLotMarket
 * LotBreakdown.RoundLotMarket}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForLot
 * GenericIdentification.IdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LotBreakdown
 * SecuritiesPricing.LotBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#TradeLotSize
 * TradingMarket.TradeLotSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#QuoteLot
 * TradingMarket.QuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#RoundLot
 * TradingMarket.RoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#LotBreakdown
 * SecuritiesQuantity.LotBreakdown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity5#QuantityBreakdown
 * Quantity5.QuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity6#QuantityBreakdown
 * Quantity6.QuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity7#QuantityBreakdown
 * Quantity7.QuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity8#QuantityBreakdown
 * Quantity8.QuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity11#QuantityBreakdown
 * Quantity11.QuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity12#QuantityBreakdown
 * Quantity12.QuantityBreakdown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown3
 * QuantityBreakdown3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown13
 * QuantityBreakdown13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown18
 * QuantityBreakdown18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown5
 * QuantityBreakdown5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown6
 * QuantityBreakdown6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown15
 * QuantityBreakdown15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown9
 * QuantityBreakdown9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown12
 * QuantityBreakdown12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown20
 * QuantityBreakdown20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown17
 * QuantityBreakdown17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown4
 * QuantityBreakdown4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown8
 * QuantityBreakdown8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown14
 * QuantityBreakdown14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown19
 * QuantityBreakdown19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown24
 * QuantityBreakdown24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown25
 * QuantityBreakdown25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown7
 * QuantityBreakdown7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown23
 * QuantityBreakdown23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown26
 * QuantityBreakdown26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown10
 * QuantityBreakdown10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown16
 * QuantityBreakdown16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown21
 * QuantityBreakdown21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown11
 * QuantityBreakdown11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1 LotDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown22
 * QuantityBreakdown22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakDown2
 * QuantityBreakDown2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakDown1
 * QuantityBreakDown1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown27
 * QuantityBreakdown27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown30
 * QuantityBreakdown30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown29
 * QuantityBreakdown29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown28
 * QuantityBreakdown28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown32
 * QuantityBreakdown32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown31
 * QuantityBreakdown31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown40
 * QuantityBreakdown40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown39
 * QuantityBreakdown39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown38
 * QuantityBreakdown38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown44
 * QuantityBreakdown44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown33
 * QuantityBreakdown33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown34
 * QuantityBreakdown34}</li>
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
 * "LotBreakdown"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security."
 * </li>
 * </ul>
 */
public class LotBreakdown {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities included in the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit4#TotalUnitsNumber
	 * Unit4.TotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities included in the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotUnit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit4.TotalUnitsNumber);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotUnit";
			definition = "Quantity of securities included in the lot.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Number of securities included in a lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#LotBreakdown
	 * SecuritiesQuantity.LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#LotQuantity
	 * QuantityBreakdown3.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#LotQuantity
	 * QuantityBreakdown13.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#LotQuantity
	 * QuantityBreakdown18.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown5#LotQuantity
	 * QuantityBreakdown5.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown6#LotQuantity
	 * QuantityBreakdown6.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown15#LotQuantity
	 * QuantityBreakdown15.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#LotQuantity
	 * QuantityBreakdown9.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#LotQuantity
	 * QuantityBreakdown12.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown20#LotQuantity
	 * QuantityBreakdown20.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#LotQuantity
	 * QuantityBreakdown17.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#LotQuantity
	 * QuantityBreakdown4.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#LotQuantity
	 * QuantityBreakdown8.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#LotQuantity
	 * QuantityBreakdown14.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#LotQuantity
	 * QuantityBreakdown19.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#LotQuantity
	 * QuantityBreakdown24.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#LotQuantity
	 * QuantityBreakdown25.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#LotQuantity
	 * QuantityBreakdown7.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#LotQuantity
	 * QuantityBreakdown23.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#LotQuantity
	 * QuantityBreakdown26.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#LotQuantity
	 * QuantityBreakdown10.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#LotQuantity
	 * QuantityBreakdown16.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#LotQuantity
	 * QuantityBreakdown21.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#LotQuantity
	 * QuantityBreakdown11.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#LotQuantityAndAmount
	 * LotDetails1.LotQuantityAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#LotQuantity
	 * QuantityBreakdown22.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#LotQuantity
	 * QuantityBreakDown2.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#LotQuantity
	 * QuantityBreakDown1.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#LotQuantity
	 * QuantityBreakdown27.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#LotQuantity
	 * QuantityBreakdown30.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#LotQuantity
	 * QuantityBreakdown29.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#LotQuantity
	 * QuantityBreakdown28.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#LotQuantity
	 * QuantityBreakdown32.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown31#LotQuantity
	 * QuantityBreakdown31.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#LotQuantity
	 * QuantityBreakdown40.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#LotQuantity
	 * QuantityBreakdown39.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#LotQuantity
	 * QuantityBreakdown38.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#LotQuantity
	 * QuantityBreakdown44.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown33#LotQuantity
	 * QuantityBreakdown33.LotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#LotQuantity
	 * QuantityBreakdown34.LotQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of securities included in a lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown3.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown13.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown18.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown5.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown6.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown15.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown9.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown12.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown20.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown17.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown4.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown8.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown14.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown19.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown24.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown25.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown7.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown23.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown26.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown10.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown16.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown21.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown11.LotQuantity, com.tools20022.repository.msg.LotDetails1.LotQuantityAndAmount,
					com.tools20022.repository.msg.QuantityBreakdown22.LotQuantity, com.tools20022.repository.msg.QuantityBreakDown2.LotQuantity, com.tools20022.repository.msg.QuantityBreakDown1.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown27.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown30.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown29.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown28.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown32.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown31.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown40.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown39.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown38.LotQuantity,
					com.tools20022.repository.msg.QuantityBreakdown44.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown33.LotQuantity, com.tools20022.repository.msg.QuantityBreakdown34.LotQuantity);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Number of securities included in a lot.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the number of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForLot
	 * GenericIdentification.IdentificationForLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#LotNumber
	 * QuantityBreakdown3.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#LotNumber
	 * QuantityBreakdown13.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#LotNumber
	 * QuantityBreakdown18.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown5#LotNumber
	 * QuantityBreakdown5.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown6#LotNumber
	 * QuantityBreakdown6.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#LotNumber
	 * IntraPositionDetails12.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#LotNumber
	 * IntraPositionDetails13.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown15#LotNumber
	 * QuantityBreakdown15.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#LotNumber
	 * QuantityBreakdown9.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#LotNumber
	 * QuantityBreakdown12.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown20#LotNumber
	 * QuantityBreakdown20.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#LotNumber
	 * QuantityBreakdown17.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#LotNumber
	 * IntraPositionMovementDetails5.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#LotNumber
	 * IntraPositionMovementDetails6.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#LotNumber
	 * QuantityBreakdown4.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#LotNumber
	 * QuantityBreakdown8.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#LotNumber
	 * QuantityBreakdown14.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#LotNumber
	 * QuantityBreakdown19.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#LotNumber
	 * QuantityBreakdown24.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#LotNumber
	 * QuantityBreakdown25.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#LotNumber
	 * QuantityBreakdown7.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#LotNumber
	 * QuantityBreakdown23.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#LotNumber
	 * QuantityBreakdown26.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#LotNumber
	 * QuantityBreakdown10.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#LotNumber
	 * QuantityBreakdown16.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#LotNumber
	 * QuantityBreakdown21.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#LotNumber
	 * QuantityBreakdown11.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#LotNumber
	 * IntraPositionDetails11.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#LotNumber
	 * IntraPositionDetails16.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#LotNumber
	 * IntraPositionDetails19.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#LotNumber
	 * IntraPositionDetails23.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#LotNumber
	 * IntraPositionMovementDetails3.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#LotNumber
	 * IntraPositionMovementDetails4.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#LotNumber
	 * QuantityBreakdown22.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#TaxLotNumber
	 * CommonFinancialInstrumentAttributes1.TaxLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#LotNumber
	 * QuantityBreakDown2.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#LotNumber
	 * QuantityBreakDown1.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#LotNumber
	 * IntraPositionDetails31.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#LotNumber
	 * QuantityBreakdown27.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#LotNumber
	 * QuantityBreakdown30.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#LotNumber
	 * QuantityBreakdown29.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#LotNumber
	 * QuantityBreakdown28.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#LotNumber
	 * QuantityBreakdown32.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown31#LotNumber
	 * QuantityBreakdown31.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#LotNumber
	 * IntraPositionDetails38.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#LotNumber
	 * QuantityBreakdown40.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#LotNumber
	 * QuantityBreakdown39.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#LotNumber
	 * QuantityBreakdown38.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#LotNumber
	 * QuantityBreakdown44.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown33#LotNumber
	 * QuantityBreakdown33.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#LotNumber
	 * QuantityBreakdown34.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#LotNumber
	 * IntraPositionDetails39.LotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#LotNumber
	 * IntraPositionDetails42.LotNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LotNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown3.LotNumber, com.tools20022.repository.msg.QuantityBreakdown13.LotNumber, com.tools20022.repository.msg.QuantityBreakdown18.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown5.LotNumber, com.tools20022.repository.msg.QuantityBreakdown6.LotNumber, com.tools20022.repository.msg.IntraPositionDetails12.LotNumber,
					com.tools20022.repository.msg.IntraPositionDetails13.LotNumber, com.tools20022.repository.msg.QuantityBreakdown15.LotNumber, com.tools20022.repository.msg.QuantityBreakdown9.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown12.LotNumber, com.tools20022.repository.msg.QuantityBreakdown20.LotNumber, com.tools20022.repository.msg.QuantityBreakdown17.LotNumber,
					com.tools20022.repository.msg.IntraPositionMovementDetails5.LotNumber, com.tools20022.repository.msg.IntraPositionMovementDetails6.LotNumber, com.tools20022.repository.msg.QuantityBreakdown4.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown8.LotNumber, com.tools20022.repository.msg.QuantityBreakdown14.LotNumber, com.tools20022.repository.msg.QuantityBreakdown19.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown24.LotNumber, com.tools20022.repository.msg.QuantityBreakdown25.LotNumber, com.tools20022.repository.msg.QuantityBreakdown7.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown23.LotNumber, com.tools20022.repository.msg.QuantityBreakdown26.LotNumber, com.tools20022.repository.msg.QuantityBreakdown10.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown16.LotNumber, com.tools20022.repository.msg.QuantityBreakdown21.LotNumber, com.tools20022.repository.msg.QuantityBreakdown11.LotNumber,
					com.tools20022.repository.msg.IntraPositionDetails11.LotNumber, com.tools20022.repository.msg.IntraPositionDetails16.LotNumber, com.tools20022.repository.msg.IntraPositionDetails19.LotNumber,
					com.tools20022.repository.msg.IntraPositionDetails23.LotNumber, com.tools20022.repository.msg.IntraPositionMovementDetails3.LotNumber, com.tools20022.repository.msg.IntraPositionMovementDetails4.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown22.LotNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.TaxLotNumber, com.tools20022.repository.msg.QuantityBreakDown2.LotNumber,
					com.tools20022.repository.msg.QuantityBreakDown1.LotNumber, com.tools20022.repository.msg.IntraPositionDetails31.LotNumber, com.tools20022.repository.msg.QuantityBreakdown27.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown30.LotNumber, com.tools20022.repository.msg.QuantityBreakdown29.LotNumber, com.tools20022.repository.msg.QuantityBreakdown28.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown32.LotNumber, com.tools20022.repository.msg.QuantityBreakdown31.LotNumber, com.tools20022.repository.msg.IntraPositionDetails38.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown40.LotNumber, com.tools20022.repository.msg.QuantityBreakdown39.LotNumber, com.tools20022.repository.msg.QuantityBreakdown38.LotNumber,
					com.tools20022.repository.msg.QuantityBreakdown44.LotNumber, com.tools20022.repository.msg.QuantityBreakdown33.LotNumber, com.tools20022.repository.msg.QuantityBreakdown34.LotNumber,
					com.tools20022.repository.msg.IntraPositionDetails39.LotNumber, com.tools20022.repository.msg.IntraPositionDetails42.LotNumber);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotNumber";
			definition = "Specifies the number of the lot.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which the lot was purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#LotDateTime
	 * QuantityBreakdown3.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#LotDateTime
	 * QuantityBreakdown13.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#LotDateTime
	 * QuantityBreakdown18.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#LotDateTime
	 * QuantityBreakdown9.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#LotDateTime
	 * QuantityBreakdown4.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#LotDateTime
	 * QuantityBreakdown8.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#LotDateTime
	 * QuantityBreakdown14.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#LotDateTime
	 * QuantityBreakdown19.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#LotDateTime
	 * QuantityBreakdown24.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#LotDateTime
	 * QuantityBreakdown25.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#LotDateTime
	 * QuantityBreakdown7.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#LotDateTime
	 * QuantityBreakdown23.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#LotDateTime
	 * QuantityBreakdown26.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#LotDateTime
	 * QuantityBreakdown10.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#LotDateTime
	 * QuantityBreakdown16.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#LotDateTime
	 * QuantityBreakdown21.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#LotDateTime
	 * QuantityBreakdown11.LotDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1#TradeDate
	 * LotDetails1.TradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#LotDateTime
	 * QuantityBreakDown2.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#LotDateTime
	 * QuantityBreakDown1.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#LotDateTime
	 * QuantityBreakdown27.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#LotDateTime
	 * QuantityBreakdown30.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#LotDateTime
	 * QuantityBreakdown29.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#LotDateTime
	 * QuantityBreakdown28.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#LotDateTime
	 * QuantityBreakdown40.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#LotDateTime
	 * QuantityBreakdown39.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#LotDateTime
	 * QuantityBreakdown38.LotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#LotDateTime
	 * QuantityBreakdown44.LotDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown3.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown13.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown18.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown9.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown4.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown8.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown14.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown19.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown24.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown25.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown7.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown23.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown26.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown10.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown16.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown21.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown11.LotDateTime, com.tools20022.repository.msg.LotDetails1.TradeDate,
					com.tools20022.repository.msg.QuantityBreakDown2.LotDateTime, com.tools20022.repository.msg.QuantityBreakDown1.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown27.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown30.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown29.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown28.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown40.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown39.LotDateTime, com.tools20022.repository.msg.QuantityBreakdown38.LotDateTime,
					com.tools20022.repository.msg.QuantityBreakdown44.LotDateTime);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotDateTime";
			definition = "Date and time at which the lot was purchased.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the price of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#LotBreakdown
	 * SecuritiesPricing.LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#LotPrice
	 * QuantityBreakdown3.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#LotPrice
	 * QuantityBreakdown13.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#LotPrice
	 * QuantityBreakdown18.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#LotPrice
	 * QuantityBreakdown9.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#LotPrice
	 * QuantityBreakdown4.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#LotPrice
	 * QuantityBreakdown8.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#LotPrice
	 * QuantityBreakdown14.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#LotPrice
	 * QuantityBreakdown19.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#LotPrice
	 * QuantityBreakdown24.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#LotPrice
	 * QuantityBreakdown25.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#LotPrice
	 * QuantityBreakdown7.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#LotPrice
	 * QuantityBreakdown23.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#LotPrice
	 * QuantityBreakdown26.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#LotPrice
	 * QuantityBreakdown10.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#LotPrice
	 * QuantityBreakdown16.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#LotPrice
	 * QuantityBreakdown21.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#LotPrice
	 * QuantityBreakdown11.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#LotPrice
	 * QuantityBreakDown2.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#LotPrice
	 * QuantityBreakDown1.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#LotPrice
	 * QuantityBreakdown27.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#LotPrice
	 * QuantityBreakdown30.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#LotPrice
	 * QuantityBreakdown29.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#LotPrice
	 * QuantityBreakdown28.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#LotPrice
	 * QuantityBreakdown40.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#LotPrice
	 * QuantityBreakdown39.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#LotPrice
	 * QuantityBreakdown38.LotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#LotPrice
	 * QuantityBreakdown44.LotPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LotPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown3.LotPrice, com.tools20022.repository.msg.QuantityBreakdown13.LotPrice, com.tools20022.repository.msg.QuantityBreakdown18.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown9.LotPrice, com.tools20022.repository.msg.QuantityBreakdown4.LotPrice, com.tools20022.repository.msg.QuantityBreakdown8.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown14.LotPrice, com.tools20022.repository.msg.QuantityBreakdown19.LotPrice, com.tools20022.repository.msg.QuantityBreakdown24.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown25.LotPrice, com.tools20022.repository.msg.QuantityBreakdown7.LotPrice, com.tools20022.repository.msg.QuantityBreakdown23.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown26.LotPrice, com.tools20022.repository.msg.QuantityBreakdown10.LotPrice, com.tools20022.repository.msg.QuantityBreakdown16.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown21.LotPrice, com.tools20022.repository.msg.QuantityBreakdown11.LotPrice, com.tools20022.repository.msg.QuantityBreakDown2.LotPrice,
					com.tools20022.repository.msg.QuantityBreakDown1.LotPrice, com.tools20022.repository.msg.QuantityBreakdown27.LotPrice, com.tools20022.repository.msg.QuantityBreakdown30.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown29.LotPrice, com.tools20022.repository.msg.QuantityBreakdown28.LotPrice, com.tools20022.repository.msg.QuantityBreakdown40.LotPrice,
					com.tools20022.repository.msg.QuantityBreakdown39.LotPrice, com.tools20022.repository.msg.QuantityBreakdown38.LotPrice, com.tools20022.repository.msg.QuantityBreakdown44.LotPrice);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotPrice";
			definition = "Specifies the price of the lot.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the lot constituting an asset backed or mortgage backed
	 * security issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#LotIdentification
	 * Debt1.LotIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1#LotDescription
	 * LotDetails1.LotDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#LotIdentification
	 * Debt2.LotIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the lot constituting an asset backed or mortgage backed security issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.LotIdentification, com.tools20022.repository.msg.LotDetails1.LotDescription, com.tools20022.repository.msg.Debt2.LotIdentification);
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotIdentifier";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Market for which a trade lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#TradeLotSize
	 * TradingMarket.TradeLotSize}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a trade lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeLotMarket";
			definition = "Market for which a trade lot is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradeLotSize;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a quote lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#QuoteLot
	 * TradingMarket.QuoteLot}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a quote lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd QuoteLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteLotMarket";
			definition = "Market for which a quote lot is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.QuoteLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market for which a round lot size is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#RoundLot
	 * TradingMarket.RoundLot}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a round lot size is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RoundLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundLotMarket";
			definition = "Market for which a round lot size is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.RoundLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LotBreakdown";
				definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForLot, com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown,
						com.tools20022.repository.entity.TradingMarket.TradeLotSize, com.tools20022.repository.entity.TradingMarket.QuoteLot, com.tools20022.repository.entity.TradingMarket.RoundLot,
						com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity5.QuantityBreakdown, com.tools20022.repository.msg.Quantity6.QuantityBreakdown, com.tools20022.repository.msg.Quantity7.QuantityBreakdown,
						com.tools20022.repository.msg.Quantity8.QuantityBreakdown, com.tools20022.repository.msg.Quantity11.QuantityBreakdown, com.tools20022.repository.msg.Quantity12.QuantityBreakdown);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LotBreakdown.LotUnit, com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity, com.tools20022.repository.entity.LotBreakdown.LotNumber,
						com.tools20022.repository.entity.LotBreakdown.LotDateTime, com.tools20022.repository.entity.LotBreakdown.LotPrice, com.tools20022.repository.entity.LotBreakdown.LotIdentifier,
						com.tools20022.repository.entity.LotBreakdown.TradeLotMarket, com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket, com.tools20022.repository.entity.LotBreakdown.RoundLotMarket);
				derivationComponent_lazy = () -> Arrays.asList(QuantityBreakdown3.mmObject(), QuantityBreakdown13.mmObject(), QuantityBreakdown18.mmObject(), QuantityBreakdown5.mmObject(), QuantityBreakdown6.mmObject(),
						QuantityBreakdown15.mmObject(), QuantityBreakdown9.mmObject(), QuantityBreakdown12.mmObject(), QuantityBreakdown20.mmObject(), QuantityBreakdown17.mmObject(), QuantityBreakdown4.mmObject(),
						QuantityBreakdown8.mmObject(), QuantityBreakdown14.mmObject(), QuantityBreakdown19.mmObject(), QuantityBreakdown24.mmObject(), QuantityBreakdown25.mmObject(), QuantityBreakdown7.mmObject(),
						QuantityBreakdown23.mmObject(), QuantityBreakdown26.mmObject(), QuantityBreakdown10.mmObject(), QuantityBreakdown16.mmObject(), QuantityBreakdown21.mmObject(), QuantityBreakdown11.mmObject(), LotDetails1.mmObject(),
						QuantityBreakdown22.mmObject(), QuantityBreakDown2.mmObject(), QuantityBreakDown1.mmObject(), QuantityBreakdown27.mmObject(), QuantityBreakdown30.mmObject(), QuantityBreakdown29.mmObject(),
						QuantityBreakdown28.mmObject(), QuantityBreakdown32.mmObject(), QuantityBreakdown31.mmObject(), QuantityBreakdown40.mmObject(), QuantityBreakdown39.mmObject(), QuantityBreakdown38.mmObject(),
						QuantityBreakdown44.mmObject(), QuantityBreakdown33.mmObject(), QuantityBreakdown34.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}