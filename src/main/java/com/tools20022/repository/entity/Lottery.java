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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * The parameters required to manage the organisation of a lottery.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Lottery" src="doc-files/Lottery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
 * Lottery.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
 * Lottery.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice
 * LotteryTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice
 * LotteryTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice
 * LotteryType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice
 * LotteryTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
 * LotteryTypeFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice
 * LotteryTypeFormat5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Lottery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The parameters required to manage the organisation of a lottery."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime lotteryDate;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmLotteryDate
	 * CorporateActionDate1.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmLotteryDate
	 * CorporateActionDate13.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmLotteryDate
	 * CorporateActionDate14.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmLotteryDate
	 * CorporateActionDate21.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmLotteryDate
	 * CorporateActionDate22.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmLotteryDate
	 * CorporateActionDate25.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmLotteryDate
	 * CorporateActionDate27.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmLotteryDate
	 * CorporateActionDate28.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmLotteryDate
	 * CorporateActionDate2.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD9#mmLotteryDate
	 * CorporateActionSD9.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD10#mmLotteryDate
	 * CorporateActionSD10.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#mmLotteryDate
	 * CorporateActionDate41.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#mmLotteryDate
	 * CorporateActionDate43.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#mmLotteryDate
	 * CorporateActionDate45.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmLotteryDate
	 * CorporateActionDate44.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#mmLotteryDate
	 * CorporateActionDate54.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLotteryDate
	 * CorporateActionDate58.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD16#mmLotteryDate
	 * CorporateActionSD16.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmLotteryDate
	 * CorporateActionDate61.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate63#mmLotteryDate
	 * CorporateActionDate63.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD19#mmLotteryDate
	 * CorporateActionSD19.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD20#mmLotteryDate
	 * CorporateActionSD20.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate70#mmLotteryDate
	 * CorporateActionDate70.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmLotteryDate
	 * CorporateActionDate74.mmLotteryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Lottery, ISODateTime> mmLotteryDate = new MMBusinessAttribute<Lottery, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmLotteryDate, CorporateActionDate13.mmLotteryDate, CorporateActionDate14.mmLotteryDate, CorporateActionDate21.mmLotteryDate, CorporateActionDate22.mmLotteryDate,
					CorporateActionDate25.mmLotteryDate, CorporateActionDate27.mmLotteryDate, CorporateActionDate28.mmLotteryDate, CorporateActionDate2.mmLotteryDate, CorporateActionSD9.mmLotteryDate, CorporateActionSD10.mmLotteryDate,
					CorporateActionDate41.mmLotteryDate, CorporateActionDate43.mmLotteryDate, CorporateActionDate45.mmLotteryDate, CorporateActionDate44.mmLotteryDate, CorporateActionDate54.mmLotteryDate,
					CorporateActionDate58.mmLotteryDate, CorporateActionSD16.mmLotteryDate, CorporateActionDate61.mmLotteryDate, CorporateActionDate63.mmLotteryDate, CorporateActionSD19.mmLotteryDate, CorporateActionSD20.mmLotteryDate,
					CorporateActionDate70.mmLotteryDate, CorporateActionDate74.mmLotteryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Lottery obj) {
			return obj.getLotteryDate();
		}

		@Override
		public void setValue(Lottery obj, ISODateTime value) {
			obj.setLotteryDate(value);
		}
	};
	protected SecuritiesQuantity incrementalDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
	 * SecuritiesQuantity.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmIncrementalDenomination
	 * CorporateActionQuantity1.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmIncrementalDenomination
	 * CorporateActionQuantity2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmIncrementalDenomination
	 * CorporateActionQuantity3.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmIncrementalDenomination
	 * CorporateActionQuantity4.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmIncrementalDenomination
	 * CorporateActionQuantity5.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmIncrementalDenomination
	 * CorporateActionQuantity6.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmIncrementalDenomination
	 * CorporateAction2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmIncrementalDenomination
	 * CorporateActionQuantity7.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmIncrementalDenomination
	 * CorporateActionQuantity8.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantitySD2#mmIncrementalDenomination
	 * CorporateActionQuantitySD2.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity9#mmIncrementalDenomination
	 * CorporateActionQuantity9.mmIncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity10#mmIncrementalDenomination
	 * CorporateActionQuantity10.mmIncrementalDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Lottery, SecuritiesQuantity> mmIncrementalDenomination = new MMBusinessAssociationEnd<Lottery, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionQuantity1.mmIncrementalDenomination, CorporateActionQuantity2.mmIncrementalDenomination, CorporateActionQuantity3.mmIncrementalDenomination,
					CorporateActionQuantity4.mmIncrementalDenomination, CorporateActionQuantity5.mmIncrementalDenomination, CorporateActionQuantity6.mmIncrementalDenomination, CorporateAction2.mmIncrementalDenomination,
					CorporateActionQuantity7.mmIncrementalDenomination, CorporateActionQuantity8.mmIncrementalDenomination, CorporateActionQuantitySD2.mmIncrementalDenomination, CorporateActionQuantity9.mmIncrementalDenomination,
					CorporateActionQuantity10.mmIncrementalDenomination);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(Lottery obj) {
			return obj.getIncrementalDenomination();
		}

		@Override
		public void setValue(Lottery obj, SecuritiesQuantity value) {
			obj.setIncrementalDenomination(value);
		}
	};
	protected LotteryTypeCode lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#mmCode
	 * LotteryTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#mmProprietary
	 * LotteryTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmLotteryType
	 * CorporateAction3.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#mmCode
	 * LotteryTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#mmProprietary
	 * LotteryTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmLotteryType
	 * CorporateAction4.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmLotteryType
	 * CorporateAction5.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmLotteryType
	 * CorporateAction6.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmLotteryType
	 * CorporateAction7.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmLotteryType
	 * CorporateAction8.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmLotteryType
	 * CorporateAction10.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmLotteryType
	 * CorporateAction11.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmCode
	 * LotteryType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#mmProprietary
	 * LotteryType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmLotteryType
	 * CorporateAction2.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmLotteryType
	 * CorporateAction13.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmLotteryType
	 * CorporateAction12.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction14#mmLotteryType
	 * CorporateAction14.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction20#mmLotteryType
	 * CorporateAction20.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction18#mmLotteryType
	 * CorporateAction18.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmLotteryType
	 * CorporateAction17.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#mmCode
	 * LotteryTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#mmProprietary
	 * LotteryTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24#mmLotteryType
	 * CorporateAction24.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction30#mmLotteryType
	 * CorporateAction30.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction28#mmLotteryType
	 * CorporateAction28.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction29#mmLotteryType
	 * CorporateAction29.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmLotteryType
	 * CorporateAction33.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#mmLotteryType
	 * CorporateAction32.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmLotteryType
	 * CorporateAction31.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmCode
	 * LotteryTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#mmProprietary
	 * LotteryTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#mmLotteryType
	 * CorporateAction34.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35#mmLotteryType
	 * CorporateAction35.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmLotteryType
	 * CorporateAction36.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#mmLotteryType
	 * CorporateAction38.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmLotteryType
	 * CorporateAction40.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#mmCode
	 * LotteryTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#mmProprietary
	 * LotteryTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmLotteryType
	 * CorporateAction41.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction43#mmLotteryType
	 * CorporateAction43.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction42#mmLotteryType
	 * CorporateAction42.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction44#mmLotteryType
	 * CorporateAction44.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction45#mmLotteryType
	 * CorporateAction45.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction46#mmLotteryType
	 * CorporateAction46.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction47#mmLotteryType
	 * CorporateAction47.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction48#mmLotteryType
	 * CorporateAction48.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction49#mmLotteryType
	 * CorporateAction49.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmLotteryType
	 * CorporateAction51.mmLotteryType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Lottery, LotteryTypeCode> mmLotteryType = new MMBusinessAttribute<Lottery, LotteryTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LotteryTypeFormat1Choice.mmCode, LotteryTypeFormat1Choice.mmProprietary, CorporateAction3.mmLotteryType, LotteryTypeFormat2Choice.mmCode, LotteryTypeFormat2Choice.mmProprietary,
					CorporateAction4.mmLotteryType, CorporateAction5.mmLotteryType, CorporateAction6.mmLotteryType, CorporateAction7.mmLotteryType, CorporateAction8.mmLotteryType, CorporateAction10.mmLotteryType,
					CorporateAction11.mmLotteryType, LotteryType1FormatChoice.mmCode, LotteryType1FormatChoice.mmProprietary, CorporateAction2.mmLotteryType, CorporateAction13.mmLotteryType, CorporateAction12.mmLotteryType,
					CorporateAction14.mmLotteryType, CorporateAction20.mmLotteryType, CorporateAction18.mmLotteryType, CorporateAction17.mmLotteryType, LotteryTypeFormat3Choice.mmCode, LotteryTypeFormat3Choice.mmProprietary,
					CorporateAction24.mmLotteryType, CorporateAction30.mmLotteryType, CorporateAction28.mmLotteryType, CorporateAction29.mmLotteryType, CorporateAction33.mmLotteryType, CorporateAction32.mmLotteryType,
					CorporateAction31.mmLotteryType, LotteryTypeFormat4Choice.mmCode, LotteryTypeFormat4Choice.mmProprietary, CorporateAction34.mmLotteryType, CorporateAction35.mmLotteryType, CorporateAction36.mmLotteryType,
					CorporateAction38.mmLotteryType, CorporateAction40.mmLotteryType, LotteryTypeFormat5Choice.mmCode, LotteryTypeFormat5Choice.mmProprietary, CorporateAction41.mmLotteryType, CorporateAction43.mmLotteryType,
					CorporateAction42.mmLotteryType, CorporateAction44.mmLotteryType, CorporateAction45.mmLotteryType, CorporateAction46.mmLotteryType, CorporateAction47.mmLotteryType, CorporateAction48.mmLotteryType,
					CorporateAction49.mmLotteryType, CorporateAction51.mmLotteryType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}

		@Override
		public LotteryTypeCode getValue(Lottery obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(Lottery obj, LotteryTypeCode value) {
			obj.setLotteryType(value);
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
	 * CorporateActionEvent.mmLottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which lottery information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Lottery, Optional<CorporateActionEvent>> mmRelatedCorporateEvent = new MMBusinessAssociationEnd<Lottery, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(Lottery obj) {
			return obj.getRelatedCorporateEvent();
		}

		@Override
		public void setValue(Lottery obj, Optional<CorporateActionEvent> value) {
			obj.setRelatedCorporateEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesQuantity.mmLottery, CorporateActionEvent.mmLottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.mmLotteryDate, com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.Lottery.mmLotteryType,
						com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent);
				derivationComponent_lazy = () -> Arrays.asList(LotteryTypeFormat1Choice.mmObject(), LotteryTypeFormat2Choice.mmObject(), LotteryType1FormatChoice.mmObject(), LotteryTypeFormat3Choice.mmObject(),
						LotteryTypeFormat4Choice.mmObject(), LotteryTypeFormat5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Lottery.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLotteryDate() {
		return lotteryDate;
	}

	public Lottery setLotteryDate(ISODateTime lotteryDate) {
		this.lotteryDate = Objects.requireNonNull(lotteryDate);
		return this;
	}

	public SecuritiesQuantity getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public Lottery setIncrementalDenomination(SecuritiesQuantity incrementalDenomination) {
		this.incrementalDenomination = Objects.requireNonNull(incrementalDenomination);
		return this;
	}

	public LotteryTypeCode getLotteryType() {
		return lotteryType;
	}

	public Lottery setLotteryType(LotteryTypeCode lotteryType) {
		this.lotteryType = Objects.requireNonNull(lotteryType);
		return this;
	}

	public Optional<CorporateActionEvent> getRelatedCorporateEvent() {
		return relatedCorporateEvent == null ? Optional.empty() : Optional.of(relatedCorporateEvent);
	}

	public Lottery setRelatedCorporateEvent(CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
		return this;
	}
}