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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotUnit
 * LotBreakdown.mmLotUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
 * LotBreakdown.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotDateTime
 * LotBreakdown.mmLotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
 * LotBreakdown.mmLotPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotIdentifier
 * LotBreakdown.mmLotIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
 * LotBreakdown.mmTradeLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
 * LotBreakdown.mmQuoteLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
 * LotBreakdown.mmRoundLotMarket}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
 * SecuritiesPricing.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
 * TradingMarket.mmTradeLotSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
 * TradingMarket.mmQuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
 * TradingMarket.mmRoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
 * SecuritiesQuantity.mmLotBreakdown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity5#mmQuantityBreakdown
 * Quantity5.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity6#mmQuantityBreakdown
 * Quantity6.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity7#mmQuantityBreakdown
 * Quantity7.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity8#mmQuantityBreakdown
 * Quantity8.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity11#mmQuantityBreakdown
 * Quantity11.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity12#mmQuantityBreakdown
 * Quantity12.mmQuantityBreakdown}</li>
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
 * "LotBreakdown"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security."
 * </li>
 * </ul>
 */
public class LotBreakdown {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber lotUnit;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Unit4#mmTotalUnitsNumber
	 * Unit4.mmTotalUnitsNumber}</li>
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
	public static final MMBusinessAttribute mmLotUnit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Unit4.mmTotalUnitsNumber);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotUnit";
			definition = "Quantity of securities included in the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotUnit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity securitiesQuantity;
	/**
	 * Number of securities included in a lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#mmLotQuantity
	 * QuantityBreakdown3.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#mmLotQuantity
	 * QuantityBreakdown13.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#mmLotQuantity
	 * QuantityBreakdown18.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown5#mmLotQuantity
	 * QuantityBreakdown5.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown6#mmLotQuantity
	 * QuantityBreakdown6.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown15#mmLotQuantity
	 * QuantityBreakdown15.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmLotQuantity
	 * QuantityBreakdown9.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#mmLotQuantity
	 * QuantityBreakdown12.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown20#mmLotQuantity
	 * QuantityBreakdown20.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#mmLotQuantity
	 * QuantityBreakdown17.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmLotQuantity
	 * QuantityBreakdown4.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmLotQuantity
	 * QuantityBreakdown8.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmLotQuantity
	 * QuantityBreakdown14.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmLotQuantity
	 * QuantityBreakdown19.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmLotQuantity
	 * QuantityBreakdown24.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmLotQuantity
	 * QuantityBreakdown25.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#mmLotQuantity
	 * QuantityBreakdown7.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#mmLotQuantity
	 * QuantityBreakdown23.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#mmLotQuantity
	 * QuantityBreakdown26.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmLotQuantity
	 * QuantityBreakdown10.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmLotQuantity
	 * QuantityBreakdown16.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmLotQuantity
	 * QuantityBreakdown21.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#mmLotQuantity
	 * QuantityBreakdown11.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#mmLotQuantityAndAmount
	 * LotDetails1.mmLotQuantityAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#mmLotQuantity
	 * QuantityBreakdown22.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmLotQuantity
	 * QuantityBreakDown2.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotQuantity
	 * QuantityBreakDown1.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotQuantity
	 * QuantityBreakdown27.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmLotQuantity
	 * QuantityBreakdown30.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmLotQuantity
	 * QuantityBreakdown29.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmLotQuantity
	 * QuantityBreakdown28.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#mmLotQuantity
	 * QuantityBreakdown32.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown31#mmLotQuantity
	 * QuantityBreakdown31.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#mmLotQuantity
	 * QuantityBreakdown40.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotQuantity
	 * QuantityBreakdown39.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#mmLotQuantity
	 * QuantityBreakdown38.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmLotQuantity
	 * QuantityBreakdown44.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown33#mmLotQuantity
	 * QuantityBreakdown33.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmLotQuantity
	 * QuantityBreakdown34.mmLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotQuantity, QuantityBreakdown13.mmLotQuantity, QuantityBreakdown18.mmLotQuantity, QuantityBreakdown5.mmLotQuantity, QuantityBreakdown6.mmLotQuantity,
					QuantityBreakdown15.mmLotQuantity, QuantityBreakdown9.mmLotQuantity, QuantityBreakdown12.mmLotQuantity, QuantityBreakdown20.mmLotQuantity, QuantityBreakdown17.mmLotQuantity, QuantityBreakdown4.mmLotQuantity,
					QuantityBreakdown8.mmLotQuantity, QuantityBreakdown14.mmLotQuantity, QuantityBreakdown19.mmLotQuantity, QuantityBreakdown24.mmLotQuantity, QuantityBreakdown25.mmLotQuantity, QuantityBreakdown7.mmLotQuantity,
					QuantityBreakdown23.mmLotQuantity, QuantityBreakdown26.mmLotQuantity, QuantityBreakdown10.mmLotQuantity, QuantityBreakdown16.mmLotQuantity, QuantityBreakdown21.mmLotQuantity, QuantityBreakdown11.mmLotQuantity,
					LotDetails1.mmLotQuantityAndAmount, QuantityBreakdown22.mmLotQuantity, QuantityBreakDown2.mmLotQuantity, QuantityBreakDown1.mmLotQuantity, QuantityBreakdown27.mmLotQuantity, QuantityBreakdown30.mmLotQuantity,
					QuantityBreakdown29.mmLotQuantity, QuantityBreakdown28.mmLotQuantity, QuantityBreakdown32.mmLotQuantity, QuantityBreakdown31.mmLotQuantity, QuantityBreakdown40.mmLotQuantity, QuantityBreakdown39.mmLotQuantity,
					QuantityBreakdown38.mmLotQuantity, QuantityBreakdown44.mmLotQuantity, QuantityBreakdown33.mmLotQuantity, QuantityBreakdown34.mmLotQuantity);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Number of securities included in a lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> lotNumber;
	/**
	 * Specifies the number of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
	 * GenericIdentification.mmIdentificationForLot}</li>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#mmLotNumber
	 * QuantityBreakdown3.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#mmLotNumber
	 * QuantityBreakdown13.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#mmLotNumber
	 * QuantityBreakdown18.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown5#mmLotNumber
	 * QuantityBreakdown5.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown6#mmLotNumber
	 * QuantityBreakdown6.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmLotNumber
	 * IntraPositionDetails12.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmLotNumber
	 * IntraPositionDetails13.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown15#mmLotNumber
	 * QuantityBreakdown15.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmLotNumber
	 * QuantityBreakdown9.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown12#mmLotNumber
	 * QuantityBreakdown12.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown20#mmLotNumber
	 * QuantityBreakdown20.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown17#mmLotNumber
	 * QuantityBreakdown17.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmLotNumber
	 * IntraPositionMovementDetails5.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmLotNumber
	 * IntraPositionMovementDetails6.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmLotNumber
	 * QuantityBreakdown4.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmLotNumber
	 * QuantityBreakdown8.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmLotNumber
	 * QuantityBreakdown14.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmLotNumber
	 * QuantityBreakdown19.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmLotNumber
	 * QuantityBreakdown24.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmLotNumber
	 * QuantityBreakdown25.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#mmLotNumber
	 * QuantityBreakdown7.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#mmLotNumber
	 * QuantityBreakdown23.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#mmLotNumber
	 * QuantityBreakdown26.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmLotNumber
	 * QuantityBreakdown10.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmLotNumber
	 * QuantityBreakdown16.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmLotNumber
	 * QuantityBreakdown21.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#mmLotNumber
	 * QuantityBreakdown11.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmLotNumber
	 * IntraPositionDetails11.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmLotNumber
	 * IntraPositionDetails16.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails19#mmLotNumber
	 * IntraPositionDetails19.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails23#mmLotNumber
	 * IntraPositionDetails23.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmLotNumber
	 * IntraPositionMovementDetails3.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmLotNumber
	 * IntraPositionMovementDetails4.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown22#mmLotNumber
	 * QuantityBreakdown22.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmTaxLotNumber
	 * CommonFinancialInstrumentAttributes1.mmTaxLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmLotNumber
	 * QuantityBreakDown2.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotNumber
	 * QuantityBreakDown1.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails31#mmLotNumber
	 * IntraPositionDetails31.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotNumber
	 * QuantityBreakdown27.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmLotNumber
	 * QuantityBreakdown30.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmLotNumber
	 * QuantityBreakdown29.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmLotNumber
	 * QuantityBreakdown28.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown32#mmLotNumber
	 * QuantityBreakdown32.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown31#mmLotNumber
	 * QuantityBreakdown31.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails38#mmLotNumber
	 * IntraPositionDetails38.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#mmLotNumber
	 * QuantityBreakdown40.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotNumber
	 * QuantityBreakdown39.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#mmLotNumber
	 * QuantityBreakdown38.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmLotNumber
	 * QuantityBreakdown44.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown33#mmLotNumber
	 * QuantityBreakdown33.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown34#mmLotNumber
	 * QuantityBreakdown34.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmLotNumber
	 * IntraPositionDetails39.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmLotNumber
	 * IntraPositionDetails42.mmLotNumber}</li>
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
	public static final MMBusinessAssociationEnd mmLotNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotNumber, QuantityBreakdown13.mmLotNumber, QuantityBreakdown18.mmLotNumber, QuantityBreakdown5.mmLotNumber, QuantityBreakdown6.mmLotNumber,
					IntraPositionDetails12.mmLotNumber, IntraPositionDetails13.mmLotNumber, QuantityBreakdown15.mmLotNumber, QuantityBreakdown9.mmLotNumber, QuantityBreakdown12.mmLotNumber, QuantityBreakdown20.mmLotNumber,
					QuantityBreakdown17.mmLotNumber, IntraPositionMovementDetails5.mmLotNumber, IntraPositionMovementDetails6.mmLotNumber, QuantityBreakdown4.mmLotNumber, QuantityBreakdown8.mmLotNumber, QuantityBreakdown14.mmLotNumber,
					QuantityBreakdown19.mmLotNumber, QuantityBreakdown24.mmLotNumber, QuantityBreakdown25.mmLotNumber, QuantityBreakdown7.mmLotNumber, QuantityBreakdown23.mmLotNumber, QuantityBreakdown26.mmLotNumber,
					QuantityBreakdown10.mmLotNumber, QuantityBreakdown16.mmLotNumber, QuantityBreakdown21.mmLotNumber, QuantityBreakdown11.mmLotNumber, IntraPositionDetails11.mmLotNumber, IntraPositionDetails16.mmLotNumber,
					IntraPositionDetails19.mmLotNumber, IntraPositionDetails23.mmLotNumber, IntraPositionMovementDetails3.mmLotNumber, IntraPositionMovementDetails4.mmLotNumber, QuantityBreakdown22.mmLotNumber,
					CommonFinancialInstrumentAttributes1.mmTaxLotNumber, QuantityBreakDown2.mmLotNumber, QuantityBreakDown1.mmLotNumber, IntraPositionDetails31.mmLotNumber, QuantityBreakdown27.mmLotNumber, QuantityBreakdown30.mmLotNumber,
					QuantityBreakdown29.mmLotNumber, QuantityBreakdown28.mmLotNumber, QuantityBreakdown32.mmLotNumber, QuantityBreakdown31.mmLotNumber, IntraPositionDetails38.mmLotNumber, QuantityBreakdown40.mmLotNumber,
					QuantityBreakdown39.mmLotNumber, QuantityBreakdown38.mmLotNumber, QuantityBreakdown44.mmLotNumber, QuantityBreakdown33.mmLotNumber, QuantityBreakdown34.mmLotNumber, IntraPositionDetails39.mmLotNumber,
					IntraPositionDetails42.mmLotNumber);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotNumber";
			definition = "Specifies the number of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected ISODateTime lotDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#mmLotDateTime
	 * QuantityBreakdown3.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#mmLotDateTime
	 * QuantityBreakdown13.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#mmLotDateTime
	 * QuantityBreakdown18.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmLotDateTime
	 * QuantityBreakdown9.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmLotDateTime
	 * QuantityBreakdown4.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmLotDateTime
	 * QuantityBreakdown8.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmLotDateTime
	 * QuantityBreakdown14.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmLotDateTime
	 * QuantityBreakdown19.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmLotDateTime
	 * QuantityBreakdown24.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmLotDateTime
	 * QuantityBreakdown25.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#mmLotDateTime
	 * QuantityBreakdown7.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#mmLotDateTime
	 * QuantityBreakdown23.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#mmLotDateTime
	 * QuantityBreakdown26.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmLotDateTime
	 * QuantityBreakdown10.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmLotDateTime
	 * QuantityBreakdown16.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmLotDateTime
	 * QuantityBreakdown21.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#mmLotDateTime
	 * QuantityBreakdown11.mmLotDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LotDetails1#mmTradeDate
	 * LotDetails1.mmTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmLotDateTime
	 * QuantityBreakDown2.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotDateTime
	 * QuantityBreakDown1.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotDateTime
	 * QuantityBreakdown27.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmLotDateTime
	 * QuantityBreakdown30.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmLotDateTime
	 * QuantityBreakdown29.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmLotDateTime
	 * QuantityBreakdown28.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#mmLotDateTime
	 * QuantityBreakdown40.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotDateTime
	 * QuantityBreakdown39.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#mmLotDateTime
	 * QuantityBreakdown38.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmLotDateTime
	 * QuantityBreakdown44.mmLotDateTime}</li>
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
	public static final MMBusinessAttribute mmLotDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotDateTime, QuantityBreakdown13.mmLotDateTime, QuantityBreakdown18.mmLotDateTime, QuantityBreakdown9.mmLotDateTime, QuantityBreakdown4.mmLotDateTime,
					QuantityBreakdown8.mmLotDateTime, QuantityBreakdown14.mmLotDateTime, QuantityBreakdown19.mmLotDateTime, QuantityBreakdown24.mmLotDateTime, QuantityBreakdown25.mmLotDateTime, QuantityBreakdown7.mmLotDateTime,
					QuantityBreakdown23.mmLotDateTime, QuantityBreakdown26.mmLotDateTime, QuantityBreakdown10.mmLotDateTime, QuantityBreakdown16.mmLotDateTime, QuantityBreakdown21.mmLotDateTime, QuantityBreakdown11.mmLotDateTime,
					LotDetails1.mmTradeDate, QuantityBreakDown2.mmLotDateTime, QuantityBreakDown1.mmLotDateTime, QuantityBreakdown27.mmLotDateTime, QuantityBreakdown30.mmLotDateTime, QuantityBreakdown29.mmLotDateTime,
					QuantityBreakdown28.mmLotDateTime, QuantityBreakdown40.mmLotDateTime, QuantityBreakdown39.mmLotDateTime, QuantityBreakdown38.mmLotDateTime, QuantityBreakdown44.mmLotDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotDateTime";
			definition = "Date and time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> lotPrice;
	/**
	 * Specifies the price of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
	 * SecuritiesPricing.mmLotBreakdown}</li>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown3#mmLotPrice
	 * QuantityBreakdown3.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown13#mmLotPrice
	 * QuantityBreakdown13.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown18#mmLotPrice
	 * QuantityBreakdown18.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown9#mmLotPrice
	 * QuantityBreakdown9.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmLotPrice
	 * QuantityBreakdown4.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmLotPrice
	 * QuantityBreakdown8.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmLotPrice
	 * QuantityBreakdown14.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmLotPrice
	 * QuantityBreakdown19.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmLotPrice
	 * QuantityBreakdown24.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmLotPrice
	 * QuantityBreakdown25.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown7#mmLotPrice
	 * QuantityBreakdown7.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown23#mmLotPrice
	 * QuantityBreakdown23.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown26#mmLotPrice
	 * QuantityBreakdown26.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown10#mmLotPrice
	 * QuantityBreakdown10.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown16#mmLotPrice
	 * QuantityBreakdown16.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown21#mmLotPrice
	 * QuantityBreakdown21.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11#mmLotPrice
	 * QuantityBreakdown11.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmLotPrice
	 * QuantityBreakDown2.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown1#mmLotPrice
	 * QuantityBreakDown1.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotPrice
	 * QuantityBreakdown27.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmLotPrice
	 * QuantityBreakdown30.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmLotPrice
	 * QuantityBreakdown29.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmLotPrice
	 * QuantityBreakdown28.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown40#mmLotPrice
	 * QuantityBreakdown40.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmLotPrice
	 * QuantityBreakdown39.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown38#mmLotPrice
	 * QuantityBreakdown38.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown44#mmLotPrice
	 * QuantityBreakdown44.mmLotPrice}</li>
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
	public static final MMBusinessAssociationEnd mmLotPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotPrice, QuantityBreakdown13.mmLotPrice, QuantityBreakdown18.mmLotPrice, QuantityBreakdown9.mmLotPrice, QuantityBreakdown4.mmLotPrice, QuantityBreakdown8.mmLotPrice,
					QuantityBreakdown14.mmLotPrice, QuantityBreakdown19.mmLotPrice, QuantityBreakdown24.mmLotPrice, QuantityBreakdown25.mmLotPrice, QuantityBreakdown7.mmLotPrice, QuantityBreakdown23.mmLotPrice,
					QuantityBreakdown26.mmLotPrice, QuantityBreakdown10.mmLotPrice, QuantityBreakdown16.mmLotPrice, QuantityBreakdown21.mmLotPrice, QuantityBreakdown11.mmLotPrice, QuantityBreakDown2.mmLotPrice,
					QuantityBreakDown1.mmLotPrice, QuantityBreakdown27.mmLotPrice, QuantityBreakdown30.mmLotPrice, QuantityBreakdown29.mmLotPrice, QuantityBreakdown28.mmLotPrice, QuantityBreakdown40.mmLotPrice,
					QuantityBreakdown39.mmLotPrice, QuantityBreakdown38.mmLotPrice, QuantityBreakdown44.mmLotPrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotPrice";
			definition = "Specifies the price of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected Max35Text lotIdentifier;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmLotIdentification
	 * Debt1.mmLotIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#mmLotDescription
	 * LotDetails1.mmLotDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmLotIdentification
	 * Debt2.mmLotIdentification}</li>
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
	public static final MMBusinessAttribute mmLotIdentifier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmLotIdentification, LotDetails1.mmLotDescription, Debt2.mmLotIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotIdentifier";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingMarket tradeLotMarket;
	/**
	 * Market for which a trade lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
	 * TradingMarket.mmTradeLotSize}</li>
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
	public static final MMBusinessAssociationEnd mmTradeLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeLotMarket";
			definition = "Market for which a trade lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradeLotSize;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected TradingMarket quoteLotMarket;
	/**
	 * Market for which a quote lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
	 * TradingMarket.mmQuoteLot}</li>
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
	public static final MMBusinessAssociationEnd mmQuoteLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteLotMarket";
			definition = "Market for which a quote lot is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmQuoteLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected TradingMarket roundLotMarket;
	/**
	 * Market for which a round lot size is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
	 * TradingMarket.mmRoundLot}</li>
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
	public static final MMBusinessAssociationEnd mmRoundLotMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundLotMarket";
			definition = "Market for which a round lot size is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmRoundLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LotBreakdown";
				definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot, com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown,
						com.tools20022.repository.entity.TradingMarket.mmTradeLotSize, com.tools20022.repository.entity.TradingMarket.mmQuoteLot, com.tools20022.repository.entity.TradingMarket.mmRoundLot,
						com.tools20022.repository.entity.SecuritiesQuantity.mmLotBreakdown);
				derivationElement_lazy = () -> Arrays.asList(Quantity5.mmQuantityBreakdown, Quantity6.mmQuantityBreakdown, Quantity7.mmQuantityBreakdown, Quantity8.mmQuantityBreakdown, Quantity11.mmQuantityBreakdown,
						Quantity12.mmQuantityBreakdown);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LotBreakdown.mmLotUnit, com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity, com.tools20022.repository.entity.LotBreakdown.mmLotNumber,
						com.tools20022.repository.entity.LotBreakdown.mmLotDateTime, com.tools20022.repository.entity.LotBreakdown.mmLotPrice, com.tools20022.repository.entity.LotBreakdown.mmLotIdentifier,
						com.tools20022.repository.entity.LotBreakdown.mmTradeLotMarket, com.tools20022.repository.entity.LotBreakdown.mmQuoteLotMarket, com.tools20022.repository.entity.LotBreakdown.mmRoundLotMarket);
				derivationComponent_lazy = () -> Arrays.asList(QuantityBreakdown3.mmObject(), QuantityBreakdown13.mmObject(), QuantityBreakdown18.mmObject(), QuantityBreakdown5.mmObject(), QuantityBreakdown6.mmObject(),
						QuantityBreakdown15.mmObject(), QuantityBreakdown9.mmObject(), QuantityBreakdown12.mmObject(), QuantityBreakdown20.mmObject(), QuantityBreakdown17.mmObject(), QuantityBreakdown4.mmObject(),
						QuantityBreakdown8.mmObject(), QuantityBreakdown14.mmObject(), QuantityBreakdown19.mmObject(), QuantityBreakdown24.mmObject(), QuantityBreakdown25.mmObject(), QuantityBreakdown7.mmObject(),
						QuantityBreakdown23.mmObject(), QuantityBreakdown26.mmObject(), QuantityBreakdown10.mmObject(), QuantityBreakdown16.mmObject(), QuantityBreakdown21.mmObject(), QuantityBreakdown11.mmObject(), LotDetails1.mmObject(),
						QuantityBreakdown22.mmObject(), QuantityBreakDown2.mmObject(), QuantityBreakDown1.mmObject(), QuantityBreakdown27.mmObject(), QuantityBreakdown30.mmObject(), QuantityBreakdown29.mmObject(),
						QuantityBreakdown28.mmObject(), QuantityBreakdown32.mmObject(), QuantityBreakdown31.mmObject(), QuantityBreakdown40.mmObject(), QuantityBreakdown39.mmObject(), QuantityBreakdown38.mmObject(),
						QuantityBreakdown44.mmObject(), QuantityBreakdown33.mmObject(), QuantityBreakdown34.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return LotBreakdown.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getLotUnit() {
		return lotUnit;
	}

	public void setLotUnit(DecimalNumber lotUnit) {
		this.lotUnit = lotUnit;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<GenericIdentification> getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(List<com.tools20022.repository.entity.GenericIdentification> lotNumber) {
		this.lotNumber = lotNumber;
	}

	public ISODateTime getLotDateTime() {
		return lotDateTime;
	}

	public void setLotDateTime(ISODateTime lotDateTime) {
		this.lotDateTime = lotDateTime;
	}

	public List<SecuritiesPricing> getLotPrice() {
		return lotPrice;
	}

	public void setLotPrice(List<com.tools20022.repository.entity.SecuritiesPricing> lotPrice) {
		this.lotPrice = lotPrice;
	}

	public Max35Text getLotIdentifier() {
		return lotIdentifier;
	}

	public void setLotIdentifier(Max35Text lotIdentifier) {
		this.lotIdentifier = lotIdentifier;
	}

	public TradingMarket getTradeLotMarket() {
		return tradeLotMarket;
	}

	public void setTradeLotMarket(com.tools20022.repository.entity.TradingMarket tradeLotMarket) {
		this.tradeLotMarket = tradeLotMarket;
	}

	public TradingMarket getQuoteLotMarket() {
		return quoteLotMarket;
	}

	public void setQuoteLotMarket(com.tools20022.repository.entity.TradingMarket quoteLotMarket) {
		this.quoteLotMarket = quoteLotMarket;
	}

	public TradingMarket getRoundLotMarket() {
		return roundLotMarket;
	}

	public void setRoundLotMarket(com.tools20022.repository.entity.TradingMarket roundLotMarket) {
		this.roundLotMarket = roundLotMarket;
	}
}