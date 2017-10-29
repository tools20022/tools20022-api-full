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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#LotteryDate
 * Lottery.LotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
 * Lottery.IncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#LotteryType
 * Lottery.LotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
 * Lottery.RelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
 * SecuritiesQuantity.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
 * CorporateActionEvent.Lottery}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Lottery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The parameters required to manage the organisation of a lottery."</li>
 * </ul>
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the lottery is run and applied to the holder's positions.
	 * This is also applicable to partial calls.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#LotteryDate
	 * CorporateActionDate1.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#LotteryDate
	 * CorporateActionDate13.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#LotteryDate
	 * CorporateActionDate14.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#LotteryDate
	 * CorporateActionDate21.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#LotteryDate
	 * CorporateActionDate22.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#LotteryDate
	 * CorporateActionDate25.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#LotteryDate
	 * CorporateActionDate27.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#LotteryDate
	 * CorporateActionDate28.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#LotteryDate
	 * CorporateActionDate2.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD9#LotteryDate
	 * CorporateActionSD9.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD10#LotteryDate
	 * CorporateActionSD10.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#LotteryDate
	 * CorporateActionDate41.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#LotteryDate
	 * CorporateActionDate43.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#LotteryDate
	 * CorporateActionDate45.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#LotteryDate
	 * CorporateActionDate44.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#LotteryDate
	 * CorporateActionDate54.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#LotteryDate
	 * CorporateActionDate58.LotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD16#LotteryDate
	 * CorporateActionSD16.LotteryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotteryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.LotteryDate, com.tools20022.repository.msg.CorporateActionDate13.LotteryDate,
					com.tools20022.repository.msg.CorporateActionDate14.LotteryDate, com.tools20022.repository.msg.CorporateActionDate21.LotteryDate, com.tools20022.repository.msg.CorporateActionDate22.LotteryDate,
					com.tools20022.repository.msg.CorporateActionDate25.LotteryDate, com.tools20022.repository.msg.CorporateActionDate27.LotteryDate, com.tools20022.repository.msg.CorporateActionDate28.LotteryDate,
					com.tools20022.repository.msg.CorporateActionDate2.LotteryDate, com.tools20022.repository.msg.CorporateActionSD9.LotteryDate, com.tools20022.repository.msg.CorporateActionSD10.LotteryDate,
					com.tools20022.repository.msg.CorporateActionDate41.LotteryDate, com.tools20022.repository.msg.CorporateActionDate43.LotteryDate, com.tools20022.repository.msg.CorporateActionDate45.LotteryDate,
					com.tools20022.repository.msg.CorporateActionDate44.LotteryDate, com.tools20022.repository.msg.CorporateActionDate54.LotteryDate, com.tools20022.repository.msg.CorporateActionDate58.LotteryDate,
					com.tools20022.repository.msg.CorporateActionSD16.LotteryDate);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
	 * SecuritiesQuantity.Lottery}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#IncrementalDenomination
	 * CorporateActionQuantity1.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#IncrementalDenomination
	 * CorporateActionQuantity2.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#IncrementalDenomination
	 * CorporateActionQuantity3.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#IncrementalDenomination
	 * CorporateActionQuantity4.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#IncrementalDenomination
	 * CorporateActionQuantity5.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#IncrementalDenomination
	 * CorporateActionQuantity6.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#IncrementalDenomination
	 * CorporateAction2.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#IncrementalDenomination
	 * CorporateActionQuantity7.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#IncrementalDenomination
	 * CorporateActionQuantity8.IncrementalDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantitySD2#IncrementalDenomination
	 * CorporateActionQuantitySD2.IncrementalDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IncrementalDenomination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity1.IncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity2.IncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity3.IncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity4.IncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity5.IncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity6.IncrementalDenomination,
					com.tools20022.repository.msg.CorporateAction2.IncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantity7.IncrementalDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity8.IncrementalDenomination, com.tools20022.repository.msg.CorporateActionQuantitySD2.IncrementalDenomination);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of lottery announced.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#Code
	 * LotteryTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice#Proprietary
	 * LotteryTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#LotteryType
	 * CorporateAction3.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#Code
	 * LotteryTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat2Choice#Proprietary
	 * LotteryTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#LotteryType
	 * CorporateAction4.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#LotteryType
	 * CorporateAction5.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#LotteryType
	 * CorporateAction6.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#LotteryType
	 * CorporateAction7.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#LotteryType
	 * CorporateAction8.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#LotteryType
	 * CorporateAction10.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#LotteryType
	 * CorporateAction11.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#Code
	 * LotteryType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryType1FormatChoice#Proprietary
	 * LotteryType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#LotteryType
	 * CorporateAction2.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#LotteryType
	 * CorporateAction13.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#LotteryType
	 * CorporateAction12.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction14#LotteryType
	 * CorporateAction14.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction20#LotteryType
	 * CorporateAction20.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction18#LotteryType
	 * CorporateAction18.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#LotteryType
	 * CorporateAction17.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#Code
	 * LotteryTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat3Choice#Proprietary
	 * LotteryTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction24#LotteryType
	 * CorporateAction24.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction30#LotteryType
	 * CorporateAction30.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction28#LotteryType
	 * CorporateAction28.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction29#LotteryType
	 * CorporateAction29.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33#LotteryType
	 * CorporateAction33.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction32#LotteryType
	 * CorporateAction32.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#LotteryType
	 * CorporateAction31.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#Code
	 * LotteryTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice#Proprietary
	 * LotteryTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction34#LotteryType
	 * CorporateAction34.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction35#LotteryType
	 * CorporateAction35.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36#LotteryType
	 * CorporateAction36.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction38#LotteryType
	 * CorporateAction38.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#LotteryType
	 * CorporateAction40.LotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#Code
	 * LotteryTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice#Proprietary
	 * LotteryTypeFormat5Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotteryType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LotteryTypeFormat1Choice.Code, com.tools20022.repository.choice.LotteryTypeFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.LotteryType, com.tools20022.repository.choice.LotteryTypeFormat2Choice.Code, com.tools20022.repository.choice.LotteryTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.LotteryType, com.tools20022.repository.msg.CorporateAction5.LotteryType, com.tools20022.repository.msg.CorporateAction6.LotteryType,
					com.tools20022.repository.msg.CorporateAction7.LotteryType, com.tools20022.repository.msg.CorporateAction8.LotteryType, com.tools20022.repository.msg.CorporateAction10.LotteryType,
					com.tools20022.repository.msg.CorporateAction11.LotteryType, com.tools20022.repository.choice.LotteryType1FormatChoice.Code, com.tools20022.repository.choice.LotteryType1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateAction2.LotteryType, com.tools20022.repository.msg.CorporateAction13.LotteryType, com.tools20022.repository.msg.CorporateAction12.LotteryType,
					com.tools20022.repository.msg.CorporateAction14.LotteryType, com.tools20022.repository.msg.CorporateAction20.LotteryType, com.tools20022.repository.msg.CorporateAction18.LotteryType,
					com.tools20022.repository.msg.CorporateAction17.LotteryType, com.tools20022.repository.choice.LotteryTypeFormat3Choice.Code, com.tools20022.repository.choice.LotteryTypeFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction24.LotteryType, com.tools20022.repository.msg.CorporateAction30.LotteryType, com.tools20022.repository.msg.CorporateAction28.LotteryType,
					com.tools20022.repository.msg.CorporateAction29.LotteryType, com.tools20022.repository.msg.CorporateAction33.LotteryType, com.tools20022.repository.msg.CorporateAction32.LotteryType,
					com.tools20022.repository.msg.CorporateAction31.LotteryType, com.tools20022.repository.choice.LotteryTypeFormat4Choice.Code, com.tools20022.repository.choice.LotteryTypeFormat4Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction34.LotteryType, com.tools20022.repository.msg.CorporateAction35.LotteryType, com.tools20022.repository.msg.CorporateAction36.LotteryType,
					com.tools20022.repository.msg.CorporateAction38.LotteryType, com.tools20022.repository.msg.CorporateAction40.LotteryType, com.tools20022.repository.choice.LotteryTypeFormat5Choice.Code,
					com.tools20022.repository.choice.LotteryTypeFormat5Choice.Proprietary);
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}
	};
	/**
	 * Corporate event for which lottery information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
	 * CorporateActionEvent.Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which lottery information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Lottery, com.tools20022.repository.entity.CorporateActionEvent.Lottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.LotteryDate, com.tools20022.repository.entity.Lottery.IncrementalDenomination, com.tools20022.repository.entity.Lottery.LotteryType,
						com.tools20022.repository.entity.Lottery.RelatedCorporateEvent);
				derivationComponent_lazy = () -> Arrays.asList(LotteryTypeFormat1Choice.mmObject(), LotteryTypeFormat2Choice.mmObject(), LotteryType1FormatChoice.mmObject(), LotteryTypeFormat3Choice.mmObject(),
						LotteryTypeFormat4Choice.mmObject(), LotteryTypeFormat5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}