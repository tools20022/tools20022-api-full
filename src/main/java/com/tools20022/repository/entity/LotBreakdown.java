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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.Quantity14#mmQuantityBreakdown
 * Quantity14.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity15#mmQuantityBreakdown
 * Quantity15.mmQuantityBreakdown}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown45
 * QuantityBreakdown45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown46
 * QuantityBreakdown46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown47
 * QuantityBreakdown47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown48
 * QuantityBreakdown48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown52
 * QuantityBreakdown52}</li>
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
	protected DecimalNumber lotUnit;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Unit9#mmTotalUnitsNumber
	 * Unit9.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: UNIT</li>
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
	public static final MMBusinessAttribute<LotBreakdown, DecimalNumber> mmLotUnit = new MMBusinessAttribute<LotBreakdown, DecimalNumber>() {
		{
			derivation_lazy = () -> Arrays.asList(Unit4.mmTotalUnitsNumber, Unit9.mmTotalUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "UNIT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotUnit";
			definition = "Quantity of securities included in the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(LotBreakdown obj) {
			return obj.getLotUnit();
		}

		@Override
		public void setValue(LotBreakdown obj, DecimalNumber value) {
			obj.setLotUnit(value);
		}
	};
	protected SecuritiesQuantity securitiesQuantity;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown45#mmLotQuantity
	 * QuantityBreakdown45.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown46#mmLotQuantity
	 * QuantityBreakdown46.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmLotQuantity
	 * QuantityBreakdown47.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown48#mmLotQuantity
	 * QuantityBreakdown48.mmLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmLotQuantity
	 * QuantityBreakdown52.mmLotQuantity}</li>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, SecuritiesQuantity> mmSecuritiesQuantity = new MMBusinessAssociationEnd<LotBreakdown, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotQuantity, QuantityBreakdown13.mmLotQuantity, QuantityBreakdown18.mmLotQuantity, QuantityBreakdown5.mmLotQuantity, QuantityBreakdown6.mmLotQuantity,
					QuantityBreakdown15.mmLotQuantity, QuantityBreakdown9.mmLotQuantity, QuantityBreakdown12.mmLotQuantity, QuantityBreakdown20.mmLotQuantity, QuantityBreakdown17.mmLotQuantity, QuantityBreakdown4.mmLotQuantity,
					QuantityBreakdown8.mmLotQuantity, QuantityBreakdown14.mmLotQuantity, QuantityBreakdown19.mmLotQuantity, QuantityBreakdown24.mmLotQuantity, QuantityBreakdown25.mmLotQuantity, QuantityBreakdown7.mmLotQuantity,
					QuantityBreakdown23.mmLotQuantity, QuantityBreakdown26.mmLotQuantity, QuantityBreakdown10.mmLotQuantity, QuantityBreakdown16.mmLotQuantity, QuantityBreakdown21.mmLotQuantity, QuantityBreakdown11.mmLotQuantity,
					LotDetails1.mmLotQuantityAndAmount, QuantityBreakdown22.mmLotQuantity, QuantityBreakDown2.mmLotQuantity, QuantityBreakDown1.mmLotQuantity, QuantityBreakdown27.mmLotQuantity, QuantityBreakdown30.mmLotQuantity,
					QuantityBreakdown29.mmLotQuantity, QuantityBreakdown28.mmLotQuantity, QuantityBreakdown32.mmLotQuantity, QuantityBreakdown31.mmLotQuantity, QuantityBreakdown40.mmLotQuantity, QuantityBreakdown39.mmLotQuantity,
					QuantityBreakdown38.mmLotQuantity, QuantityBreakdown44.mmLotQuantity, QuantityBreakdown33.mmLotQuantity, QuantityBreakdown34.mmLotQuantity, QuantityBreakdown45.mmLotQuantity, QuantityBreakdown46.mmLotQuantity,
					QuantityBreakdown47.mmLotQuantity, QuantityBreakdown48.mmLotQuantity, QuantityBreakdown52.mmLotQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Number of securities included in a lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(LotBreakdown obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(LotBreakdown obj, SecuritiesQuantity value) {
			obj.setSecuritiesQuantity(value);
		}
	};
	protected List<GenericIdentification> lotNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmTaxLotNumber
	 * CommonFinancialInstrumentAttributes4.mmTaxLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown45#mmLotNumber
	 * QuantityBreakdown45.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails39#mmLotNumber
	 * IntraPositionDetails39.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails42#mmLotNumber
	 * IntraPositionDetails42.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown46#mmLotNumber
	 * QuantityBreakdown46.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmLotNumber
	 * QuantityBreakdown47.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown48#mmLotNumber
	 * QuantityBreakdown48.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmLotNumber
	 * QuantityBreakdown52.mmLotNumber}</li>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, List<GenericIdentification>> mmLotNumber = new MMBusinessAssociationEnd<LotBreakdown, List<GenericIdentification>>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotNumber, QuantityBreakdown13.mmLotNumber, QuantityBreakdown18.mmLotNumber, QuantityBreakdown5.mmLotNumber, QuantityBreakdown6.mmLotNumber,
					IntraPositionDetails12.mmLotNumber, IntraPositionDetails13.mmLotNumber, QuantityBreakdown15.mmLotNumber, QuantityBreakdown9.mmLotNumber, QuantityBreakdown12.mmLotNumber, QuantityBreakdown20.mmLotNumber,
					QuantityBreakdown17.mmLotNumber, IntraPositionMovementDetails5.mmLotNumber, IntraPositionMovementDetails6.mmLotNumber, QuantityBreakdown4.mmLotNumber, QuantityBreakdown8.mmLotNumber, QuantityBreakdown14.mmLotNumber,
					QuantityBreakdown19.mmLotNumber, QuantityBreakdown24.mmLotNumber, QuantityBreakdown25.mmLotNumber, QuantityBreakdown7.mmLotNumber, QuantityBreakdown23.mmLotNumber, QuantityBreakdown26.mmLotNumber,
					QuantityBreakdown10.mmLotNumber, QuantityBreakdown16.mmLotNumber, QuantityBreakdown21.mmLotNumber, QuantityBreakdown11.mmLotNumber, IntraPositionDetails11.mmLotNumber, IntraPositionDetails16.mmLotNumber,
					IntraPositionDetails19.mmLotNumber, IntraPositionDetails23.mmLotNumber, IntraPositionMovementDetails3.mmLotNumber, IntraPositionMovementDetails4.mmLotNumber, QuantityBreakdown22.mmLotNumber,
					CommonFinancialInstrumentAttributes1.mmTaxLotNumber, QuantityBreakDown2.mmLotNumber, QuantityBreakDown1.mmLotNumber, IntraPositionDetails31.mmLotNumber, QuantityBreakdown27.mmLotNumber, QuantityBreakdown30.mmLotNumber,
					QuantityBreakdown29.mmLotNumber, QuantityBreakdown28.mmLotNumber, QuantityBreakdown32.mmLotNumber, QuantityBreakdown31.mmLotNumber, IntraPositionDetails38.mmLotNumber, QuantityBreakdown40.mmLotNumber,
					QuantityBreakdown39.mmLotNumber, QuantityBreakdown38.mmLotNumber, QuantityBreakdown44.mmLotNumber, QuantityBreakdown33.mmLotNumber, QuantityBreakdown34.mmLotNumber, CommonFinancialInstrumentAttributes4.mmTaxLotNumber,
					QuantityBreakdown45.mmLotNumber, IntraPositionDetails39.mmLotNumber, IntraPositionDetails42.mmLotNumber, QuantityBreakdown46.mmLotNumber, QuantityBreakdown47.mmLotNumber, QuantityBreakdown48.mmLotNumber,
					QuantityBreakdown52.mmLotNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotNumber";
			definition = "Specifies the number of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public List<GenericIdentification> getValue(LotBreakdown obj) {
			return obj.getLotNumber();
		}

		@Override
		public void setValue(LotBreakdown obj, List<GenericIdentification> value) {
			obj.setLotNumber(value);
		}
	};
	protected ISODateTime lotDateTime;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown46#mmLotDateTime
	 * QuantityBreakdown46.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmLotDateTime
	 * QuantityBreakdown47.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown48#mmLotDateTime
	 * QuantityBreakdown48.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmLotDateTime
	 * QuantityBreakdown52.mmLotDateTime}</li>
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
	public static final MMBusinessAttribute<LotBreakdown, ISODateTime> mmLotDateTime = new MMBusinessAttribute<LotBreakdown, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotDateTime, QuantityBreakdown13.mmLotDateTime, QuantityBreakdown18.mmLotDateTime, QuantityBreakdown9.mmLotDateTime, QuantityBreakdown4.mmLotDateTime,
					QuantityBreakdown8.mmLotDateTime, QuantityBreakdown14.mmLotDateTime, QuantityBreakdown19.mmLotDateTime, QuantityBreakdown24.mmLotDateTime, QuantityBreakdown25.mmLotDateTime, QuantityBreakdown7.mmLotDateTime,
					QuantityBreakdown23.mmLotDateTime, QuantityBreakdown26.mmLotDateTime, QuantityBreakdown10.mmLotDateTime, QuantityBreakdown16.mmLotDateTime, QuantityBreakdown21.mmLotDateTime, QuantityBreakdown11.mmLotDateTime,
					LotDetails1.mmTradeDate, QuantityBreakDown2.mmLotDateTime, QuantityBreakDown1.mmLotDateTime, QuantityBreakdown27.mmLotDateTime, QuantityBreakdown30.mmLotDateTime, QuantityBreakdown29.mmLotDateTime,
					QuantityBreakdown28.mmLotDateTime, QuantityBreakdown40.mmLotDateTime, QuantityBreakdown39.mmLotDateTime, QuantityBreakdown38.mmLotDateTime, QuantityBreakdown44.mmLotDateTime, QuantityBreakdown46.mmLotDateTime,
					QuantityBreakdown47.mmLotDateTime, QuantityBreakdown48.mmLotDateTime, QuantityBreakdown52.mmLotDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotDateTime";
			definition = "Date and time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(LotBreakdown obj) {
			return obj.getLotDateTime();
		}

		@Override
		public void setValue(LotBreakdown obj, ISODateTime value) {
			obj.setLotDateTime(value);
		}
	};
	protected List<SecuritiesPricing> lotPrice;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown46#mmLotPrice
	 * QuantityBreakdown46.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown47#mmLotPrice
	 * QuantityBreakdown47.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown48#mmLotPrice
	 * QuantityBreakdown48.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown52#mmLotPrice
	 * QuantityBreakdown52.mmLotPrice}</li>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, List<SecuritiesPricing>> mmLotPrice = new MMBusinessAssociationEnd<LotBreakdown, List<SecuritiesPricing>>() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown3.mmLotPrice, QuantityBreakdown13.mmLotPrice, QuantityBreakdown18.mmLotPrice, QuantityBreakdown9.mmLotPrice, QuantityBreakdown4.mmLotPrice, QuantityBreakdown8.mmLotPrice,
					QuantityBreakdown14.mmLotPrice, QuantityBreakdown19.mmLotPrice, QuantityBreakdown24.mmLotPrice, QuantityBreakdown25.mmLotPrice, QuantityBreakdown7.mmLotPrice, QuantityBreakdown23.mmLotPrice,
					QuantityBreakdown26.mmLotPrice, QuantityBreakdown10.mmLotPrice, QuantityBreakdown16.mmLotPrice, QuantityBreakdown21.mmLotPrice, QuantityBreakdown11.mmLotPrice, QuantityBreakDown2.mmLotPrice,
					QuantityBreakDown1.mmLotPrice, QuantityBreakdown27.mmLotPrice, QuantityBreakdown30.mmLotPrice, QuantityBreakdown29.mmLotPrice, QuantityBreakdown28.mmLotPrice, QuantityBreakdown40.mmLotPrice,
					QuantityBreakdown39.mmLotPrice, QuantityBreakdown38.mmLotPrice, QuantityBreakdown44.mmLotPrice, QuantityBreakdown46.mmLotPrice, QuantityBreakdown47.mmLotPrice, QuantityBreakdown48.mmLotPrice,
					QuantityBreakdown52.mmLotPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotPrice";
			definition = "Specifies the price of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesPricing.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public List<SecuritiesPricing> getValue(LotBreakdown obj) {
			return obj.getLotPrice();
		}

		@Override
		public void setValue(LotBreakdown obj, List<SecuritiesPricing> value) {
			obj.setLotPrice(value);
		}
	};
	protected Max35Text lotIdentifier;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmLotIdentification
	 * Debt3.mmLotIdentification}</li>
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
	public static final MMBusinessAttribute<LotBreakdown, Max35Text> mmLotIdentifier = new MMBusinessAttribute<LotBreakdown, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmLotIdentification, LotDetails1.mmLotDescription, Debt2.mmLotIdentification, Debt3.mmLotIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotIdentifier";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(LotBreakdown obj) {
			return obj.getLotIdentifier();
		}

		@Override
		public void setValue(LotBreakdown obj, Max35Text value) {
			obj.setLotIdentifier(value);
		}
	};
	protected TradingMarket tradeLotMarket;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, TradingMarket> mmTradeLotMarket = new MMBusinessAssociationEnd<LotBreakdown, TradingMarket>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeLotMarket";
			definition = "Market for which a trade lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingMarket.mmTradeLotSize;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public TradingMarket getValue(LotBreakdown obj) {
			return obj.getTradeLotMarket();
		}

		@Override
		public void setValue(LotBreakdown obj, TradingMarket value) {
			obj.setTradeLotMarket(value);
		}
	};
	protected TradingMarket quoteLotMarket;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, Optional<TradingMarket>> mmQuoteLotMarket = new MMBusinessAssociationEnd<LotBreakdown, Optional<TradingMarket>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteLotMarket";
			definition = "Market for which a quote lot is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TradingMarket.mmQuoteLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public Optional<TradingMarket> getValue(LotBreakdown obj) {
			return obj.getQuoteLotMarket();
		}

		@Override
		public void setValue(LotBreakdown obj, Optional<TradingMarket> value) {
			obj.setQuoteLotMarket(value.orElse(null));
		}
	};
	protected TradingMarket roundLotMarket;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<LotBreakdown, Optional<TradingMarket>> mmRoundLotMarket = new MMBusinessAssociationEnd<LotBreakdown, Optional<TradingMarket>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundLotMarket";
			definition = "Market for which a round lot size is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TradingMarket.mmRoundLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public Optional<TradingMarket> getValue(LotBreakdown obj) {
			return obj.getRoundLotMarket();
		}

		@Override
		public void setValue(LotBreakdown obj, Optional<TradingMarket> value) {
			obj.setRoundLotMarket(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LotBreakdown";
				definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForLot, SecuritiesPricing.mmLotBreakdown, TradingMarket.mmTradeLotSize, TradingMarket.mmQuoteLot, TradingMarket.mmRoundLot,
						SecuritiesQuantity.mmLotBreakdown);
				derivationElement_lazy = () -> Arrays.asList(Quantity5.mmQuantityBreakdown, Quantity6.mmQuantityBreakdown, Quantity7.mmQuantityBreakdown, Quantity8.mmQuantityBreakdown, Quantity11.mmQuantityBreakdown,
						Quantity12.mmQuantityBreakdown, Quantity14.mmQuantityBreakdown, Quantity15.mmQuantityBreakdown);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LotBreakdown.mmLotUnit, com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity, com.tools20022.repository.entity.LotBreakdown.mmLotNumber,
						com.tools20022.repository.entity.LotBreakdown.mmLotDateTime, com.tools20022.repository.entity.LotBreakdown.mmLotPrice, com.tools20022.repository.entity.LotBreakdown.mmLotIdentifier,
						com.tools20022.repository.entity.LotBreakdown.mmTradeLotMarket, com.tools20022.repository.entity.LotBreakdown.mmQuoteLotMarket, com.tools20022.repository.entity.LotBreakdown.mmRoundLotMarket);
				derivationComponent_lazy = () -> Arrays.asList(QuantityBreakdown3.mmObject(), QuantityBreakdown13.mmObject(), QuantityBreakdown18.mmObject(), QuantityBreakdown5.mmObject(), QuantityBreakdown6.mmObject(),
						QuantityBreakdown15.mmObject(), QuantityBreakdown9.mmObject(), QuantityBreakdown12.mmObject(), QuantityBreakdown20.mmObject(), QuantityBreakdown17.mmObject(), QuantityBreakdown4.mmObject(),
						QuantityBreakdown8.mmObject(), QuantityBreakdown14.mmObject(), QuantityBreakdown19.mmObject(), QuantityBreakdown24.mmObject(), QuantityBreakdown25.mmObject(), QuantityBreakdown7.mmObject(),
						QuantityBreakdown23.mmObject(), QuantityBreakdown26.mmObject(), QuantityBreakdown10.mmObject(), QuantityBreakdown16.mmObject(), QuantityBreakdown21.mmObject(), QuantityBreakdown11.mmObject(), LotDetails1.mmObject(),
						QuantityBreakdown22.mmObject(), QuantityBreakDown2.mmObject(), QuantityBreakDown1.mmObject(), QuantityBreakdown27.mmObject(), QuantityBreakdown30.mmObject(), QuantityBreakdown29.mmObject(),
						QuantityBreakdown28.mmObject(), QuantityBreakdown32.mmObject(), QuantityBreakdown31.mmObject(), QuantityBreakdown40.mmObject(), QuantityBreakdown39.mmObject(), QuantityBreakdown38.mmObject(),
						QuantityBreakdown44.mmObject(), QuantityBreakdown33.mmObject(), QuantityBreakdown34.mmObject(), QuantityBreakdown45.mmObject(), QuantityBreakdown46.mmObject(), QuantityBreakdown47.mmObject(),
						QuantityBreakdown48.mmObject(), QuantityBreakdown52.mmObject());
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

	public LotBreakdown setLotUnit(DecimalNumber lotUnit) {
		this.lotUnit = Objects.requireNonNull(lotUnit);
		return this;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public LotBreakdown setSecuritiesQuantity(SecuritiesQuantity securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public List<GenericIdentification> getLotNumber() {
		return lotNumber == null ? lotNumber = new ArrayList<>() : lotNumber;
	}

	public LotBreakdown setLotNumber(List<GenericIdentification> lotNumber) {
		this.lotNumber = Objects.requireNonNull(lotNumber);
		return this;
	}

	public ISODateTime getLotDateTime() {
		return lotDateTime;
	}

	public LotBreakdown setLotDateTime(ISODateTime lotDateTime) {
		this.lotDateTime = Objects.requireNonNull(lotDateTime);
		return this;
	}

	public List<SecuritiesPricing> getLotPrice() {
		return lotPrice == null ? lotPrice = new ArrayList<>() : lotPrice;
	}

	public LotBreakdown setLotPrice(List<SecuritiesPricing> lotPrice) {
		this.lotPrice = Objects.requireNonNull(lotPrice);
		return this;
	}

	public Max35Text getLotIdentifier() {
		return lotIdentifier;
	}

	public LotBreakdown setLotIdentifier(Max35Text lotIdentifier) {
		this.lotIdentifier = Objects.requireNonNull(lotIdentifier);
		return this;
	}

	public TradingMarket getTradeLotMarket() {
		return tradeLotMarket;
	}

	public LotBreakdown setTradeLotMarket(TradingMarket tradeLotMarket) {
		this.tradeLotMarket = Objects.requireNonNull(tradeLotMarket);
		return this;
	}

	public Optional<TradingMarket> getQuoteLotMarket() {
		return quoteLotMarket == null ? Optional.empty() : Optional.of(quoteLotMarket);
	}

	public LotBreakdown setQuoteLotMarket(TradingMarket quoteLotMarket) {
		this.quoteLotMarket = quoteLotMarket;
		return this;
	}

	public Optional<TradingMarket> getRoundLotMarket() {
		return roundLotMarket == null ? Optional.empty() : Optional.of(roundLotMarket);
	}

	public LotBreakdown setRoundLotMarket(TradingMarket roundLotMarket) {
		this.roundLotMarket = roundLotMarket;
		return this;
	}
}