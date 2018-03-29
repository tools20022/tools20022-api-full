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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information about the alternatives available to an account owner
 * when participating to a corporate action event. This is defined at a general
 * level without looking at the specificities of the securities balances.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionOption"
 * src="doc-files/CorporateActionOption.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
 * CorporateActionOption.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
 * CorporateActionOption.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
 * CorporateActionOption.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
 * CorporateActionOption.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
 * CorporateActionOption.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
 * CorporateActionOption.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
 * CorporateActionOption.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
 * CorporateActionOption.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
 * CorporateActionOption.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
 * CorporateActionOption.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionOptionServicing
 * CorporateActionOption.mmCorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
 * CorporateActionOption.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDistribution
 * CorporateActionOption.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDefault
 * CorporateActionOption.mmDefault}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
 * DateTimePeriod.mmCorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
 * ProceedsDefinition.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
 * CorporateActionElection.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
 * CorporateActionDistribution.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
 * CorporateActionOptionServicing.mmRelatedOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption4Choice
 * CorporateActionOption4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType2Choice
 * FractionDispositionType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption2
 * SecuritiesOption2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption5
 * CorporateActionOption5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption6Choice
 * CorporateActionOption6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType8Choice
 * FractionDispositionType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption7
 * SecuritiesOption7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption13
 * CorporateActionOption13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType10Choice
 * FractionDispositionType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption25
 * CorporateActionOption25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType11Choice
 * FractionDispositionType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption30
 * CorporateActionOption30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption12Choice
 * CorporateActionOption12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption38
 * CorporateActionOption38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption15Choice
 * CorporateActionOption15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption47
 * CorporateActionOption47}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType17Choice
 * FractionDispositionType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption57
 * CorporateActionOption57}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType18Choice
 * FractionDispositionType18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption58
 * CorporateActionOption58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption6
 * CorporateActionOption6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption21
 * CorporateActionOption21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption42
 * CorporateActionOption42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption28
 * CorporateActionOption28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption43
 * CorporateActionOption43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption5Choice
 * CorporateActionOption5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption9
 * CorporateActionOption9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice
 * CorporateActionOption7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption18
 * CorporateActionOption18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption22
 * CorporateActionOption22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption27
 * CorporateActionOption27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption26
 * CorporateActionOption26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption13Choice
 * CorporateActionOption13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption41
 * CorporateActionOption41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption16Choice
 * CorporateActionOption16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption50
 * CorporateActionOption50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice
 * CorporateActionOption2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1
 * InstructedCorporateActionOption1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption9Choice
 * CorporateActionOption9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2
 * InstructedCorporateActionOption2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption10Choice
 * CorporateActionOption10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4
 * InstructedCorporateActionOption4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice
 * CorporateActionOption17Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
 * InstructedCorporateActionOption5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption29
 * CorporateActionOption29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption3Choice
 * CorporateActionOption3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice
 * OptionFeaturesFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice
 * FractionDispositionType1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType4Choice
 * FractionDispositionType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption3
 * SecuritiesOption3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption4
 * CorporateActionOption4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption8Choice
 * CorporateActionOption8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice
 * OptionFeaturesFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice
 * FractionDispositionType6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType7Choice
 * FractionDispositionType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption8
 * SecuritiesOption8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption14
 * CorporateActionOption14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType12Choice
 * FractionDispositionType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption18
 * SecuritiesOption18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption23
 * CorporateActionOption23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType13Choice
 * FractionDispositionType13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption20
 * SecuritiesOption20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption31
 * CorporateActionOption31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice
 * CorporateActionOption11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption26
 * SecuritiesOption26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption37
 * CorporateActionOption37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice
 * CorporateActionOption14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption31
 * SecuritiesOption31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption46
 * CorporateActionOption46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice
 * FractionDispositionType23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption35
 * SecuritiesOption35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption53
 * CorporateActionOption53}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice
 * FractionDispositionType24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption36
 * SecuritiesOption36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption54
 * CorporateActionOption54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice
 * OfferTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat2Choice
 * OptionFeaturesFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption1
 * SecuritiesOption1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption4
 * SecuritiesOption4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption10
 * CorporateActionOption10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat2Choice
 * OfferTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat4Choice
 * OptionFeaturesFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption9
 * SecuritiesOption9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption10
 * SecuritiesOption10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption15
 * CorporateActionOption15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat6Choice
 * OptionFeaturesFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption15
 * SecuritiesOption15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption13
 * SecuritiesOption13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption20
 * CorporateActionOption20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat7Choice
 * OptionFeaturesFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption16
 * SecuritiesOption16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption17
 * SecuritiesOption17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption32
 * CorporateActionOption32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice
 * OptionFeaturesFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat9Choice
 * OptionFeaturesFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption23
 * SecuritiesOption23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption24
 * SecuritiesOption24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption35
 * CorporateActionOption35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice
 * OptionFeaturesFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption28
 * SecuritiesOption28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption29
 * SecuritiesOption29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption44
 * CorporateActionOption44}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice
 * FractionDispositionType19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice
 * OfferTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption33
 * SecuritiesOption33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption38
 * SecuritiesOption38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption52
 * CorporateActionOption52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice
 * FractionDispositionType20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat4Choice
 * OfferTypeFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption37
 * SecuritiesOption37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption39
 * SecuritiesOption39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption55
 * CorporateActionOption55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption5
 * SecuritiesOption5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption12
 * CorporateActionOption12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption11
 * SecuritiesOption11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption16
 * CorporateActionOption16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption19
 * SecuritiesOption19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption24
 * CorporateActionOption24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption21
 * SecuritiesOption21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption33
 * CorporateActionOption33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption27
 * SecuritiesOption27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption39
 * CorporateActionOption39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption32
 * SecuritiesOption32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption48
 * CorporateActionOption48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType3Choice
 * FractionDispositionType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption6
 * SecuritiesOption6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption3
 * CorporateActionOption3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType5Choice
 * FractionDispositionType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption12
 * SecuritiesOption12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption17
 * CorporateActionOption17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType9Choice
 * FractionDispositionType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption14
 * SecuritiesOption14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption19
 * CorporateActionOption19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType14Choice
 * FractionDispositionType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeaturesFormat8Choice
 * OptionFeaturesFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption22
 * SecuritiesOption22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption34
 * CorporateActionOption34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption25
 * SecuritiesOption25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption36
 * CorporateActionOption36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption30
 * SecuritiesOption30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption45
 * CorporateActionOption45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType15Choice
 * FractionDispositionType15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption51
 * CorporateActionOption51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType16Choice
 * FractionDispositionType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption56
 * CorporateActionOption56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
 * CorporateActionOption1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferType1FormatChoice
 * OfferType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice
 * FractionDispositionType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityOption1
 * SecurityOption1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice
 * OptionFeatures1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption1
 * CorporateActionOption1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption2
 * CorporateActionOption2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption7
 * CorporateActionOption7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption99
 * CorporateActionOption99}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption11
 * CorporateActionOption11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption8
 * CorporateActionOption8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption103
 * CorporateActionOption103}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption100
 * CorporateActionOption100}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption101
 * CorporateActionOption101}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption102
 * CorporateActionOption102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat5Choice
 * OfferTypeFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption42
 * SecuritiesOption42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption40
 * SecuritiesOption40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat12Choice
 * OptionFeaturesFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption110
 * CorporateActionOption110}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption108
 * CorporateActionOption108}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption107
 * CorporateActionOption107}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption106
 * CorporateActionOption106}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice
 * OfferTypeFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption48
 * SecuritiesOption48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat15Choice
 * OptionFeaturesFormat15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption45
 * SecuritiesOption45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption111
 * CorporateActionOption111}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption113
 * CorporateActionOption113}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption117
 * CorporateActionOption117}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption118
 * CorporateActionOption118}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption119
 * CorporateActionOption119}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption115
 * CorporateActionOption115}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption116
 * CorporateActionOption116}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption114
 * CorporateActionOption114}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption120
 * CorporateActionOption120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice
 * CorporateActionOption19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
 * InstructedCorporateActionOption6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice
 * CorporateActionOption18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice
 * CorporateActionOption21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice
 * FractionDispositionType25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption51
 * SecuritiesOption51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice
 * FractionDispositionType27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice
 * CorporateActionOption20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption49
 * SecuritiesOption49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice
 * FractionDispositionType26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption53
 * SecuritiesOption53}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice
 * OfferTypeFormat10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat17Choice
 * OptionFeaturesFormat17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption52
 * SecuritiesOption52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice
 * FractionDispositionType28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice
 * OptionFeaturesFormat18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat16Choice
 * OptionFeaturesFormat16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption50
 * SecuritiesOption50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption121
 * CorporateActionOption121}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption126
 * CorporateActionOption126}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption124
 * CorporateActionOption124}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption125
 * CorporateActionOption125}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption123
 * CorporateActionOption123}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption127
 * CorporateActionOption127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat19Choice
 * OptionFeaturesFormat19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType30Choice
 * FractionDispositionType30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption26Choice
 * CorporateActionOption26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption55
 * SecuritiesOption55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7
 * InstructedCorporateActionOption7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption23Choice
 * CorporateActionOption23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat21Choice
 * OptionFeaturesFormat21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType29Choice
 * FractionDispositionType29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption22Choice
 * CorporateActionOption22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption54
 * SecuritiesOption54}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption25Choice
 * CorporateActionOption25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat20Choice
 * OptionFeaturesFormat20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption57
 * SecuritiesOption57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice
 * OfferTypeFormat11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType31Choice
 * FractionDispositionType31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption56
 * SecuritiesOption56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FractionDispositionType32Choice
 * FractionDispositionType32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption58
 * SecuritiesOption58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption128
 * CorporateActionOption128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionOption29Choice
 * CorporateActionOption29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption132
 * CorporateActionOption132}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption130
 * CorporateActionOption130}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption131
 * CorporateActionOption131}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption129
 * CorporateActionOption129}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption60
 * SecuritiesOption60}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice
 * OptionFeaturesFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption59
 * SecuritiesOption59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption134
 * CorporateActionOption134}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption136
 * CorporateActionOption136}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption135
 * CorporateActionOption135}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption133
 * CorporateActionOption133}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption61
 * SecuritiesOption61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption63
 * SecuritiesOption63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat23Choice
 * OptionFeaturesFormat23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption140
 * CorporateActionOption140}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption141
 * CorporateActionOption141}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption138
 * CorporateActionOption138}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption142
 * CorporateActionOption142}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption139
 * CorporateActionOption139}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption64
 * SecuritiesOption64}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8
 * InstructedCorporateActionOption8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption65
 * SecuritiesOption65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption143
 * CorporateActionOption143}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption66
 * SecuritiesOption66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption144
 * CorporateActionOption144}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption9
 * InstructedCorporateActionOption9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption146
 * CorporateActionOption146}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption147
 * CorporateActionOption147}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption67
 * SecuritiesOption67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption148
 * CorporateActionOption148}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption68
 * SecuritiesOption68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption149
 * CorporateActionOption149}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption69
 * SecuritiesOption69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption150
 * CorporateActionOption150}</li>
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
 * "CorporateActionOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances."
 * </li>
 * </ul>
 */
public class CorporateActionOption {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmOptionNumber
	 * CorporateActionOption5.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmOptionNumber
	 * CorporateActionOption13.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmOptionNumber
	 * CorporateActionOption25.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmOptionNumber
	 * CorporateActionOption30.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmOptionNumber
	 * CorporateActionOption38.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmOptionNumber
	 * CorporateActionOption47.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmOptionNumber
	 * CorporateActionOption57.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmOptionNumber
	 * CorporateActionOption58.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#mmOptionNumber
	 * CorporateActionOption6.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#mmOptionNumber
	 * CorporateActionOption21.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#mmOptionNumber
	 * CorporateActionOption42.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#mmOptionNumber
	 * CorporateActionOption28.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#mmOptionNumber
	 * CorporateActionOption43.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmOptionNumber
	 * CorporateActionOption9.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmOptionNumber
	 * CorporateActionOption18.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmOptionNumber
	 * CorporateActionOption22.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmOptionNumber
	 * CorporateActionOption27.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmOptionNumber
	 * CorporateActionOption26.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmOptionNumber
	 * CorporateActionOption41.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmOptionNumber
	 * CorporateActionOption50.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmOptionNumber
	 * InstructedCorporateActionOption1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmOptionNumber
	 * InstructedCorporateActionOption2.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmOptionNumber
	 * InstructedCorporateActionOption4.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmOptionNumber
	 * InstructedCorporateActionOption5.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmOptionNumber
	 * CorporateActionOption29.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmOptionNumber
	 * CorporateActionOption4.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmOptionNumber
	 * CorporateActionOption14.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmOptionNumber
	 * CorporateActionOption23.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmOptionNumber
	 * CorporateActionOption31.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmOptionNumber
	 * CorporateActionOption37.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmOptionNumber
	 * CorporateActionOption46.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionNumber
	 * CorporateActionOption53.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmOptionNumber
	 * CorporateActionOption54.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmOptionNumber
	 * CorporateActionOption10.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmOptionNumber
	 * CorporateActionOption15.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmOptionNumber
	 * CorporateActionOption20.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmOptionNumber
	 * CorporateActionOption32.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmOptionNumber
	 * CorporateActionOption35.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmOptionNumber
	 * CorporateActionOption44.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmOptionNumber
	 * CorporateActionOption52.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmOptionNumber
	 * CorporateActionOption55.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#mmOptionNumber
	 * CorporateActionOption12.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#mmOptionNumber
	 * CorporateActionOption16.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#mmOptionNumber
	 * CorporateActionOption24.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#mmOptionNumber
	 * CorporateActionOption33.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#mmOptionNumber
	 * CorporateActionOption39.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#mmOptionNumber
	 * CorporateActionOption48.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmOptionNumber
	 * CorporateActionOption3.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmOptionNumber
	 * CorporateActionOption17.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionNumber
	 * CorporateActionOption19.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmOptionNumber
	 * CorporateActionOption34.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmOptionNumber
	 * CorporateActionOption36.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmOptionNumber
	 * CorporateActionOption45.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmOptionNumber
	 * CorporateActionOption51.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmOptionNumber
	 * CorporateActionOption56.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionNumber
	 * CorporateActionOption1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmOptionNumber
	 * SecuritiesAccount9.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionNumber
	 * CorporateActionElection3.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmOptionNumber
	 * CorporateActionElection1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmOptionNumber
	 * CorporateActionElection2.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionNumber
	 * EntitlementAdvice1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionNumber
	 * GlobalDistributionRequest1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmOptionNumber
	 * CorporateActionMovement1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmOptionNumber
	 * SecuritiesAccount8.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#mmOptionNumber
	 * CorporateActionOption2.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionNumber
	 * CorporateActionDeactivationInstructionStatus1.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#mmOptionNumber
	 * CorporateActionOption7.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption99#mmOptionNumber
	 * CorporateActionOption99.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#mmOptionNumber
	 * CorporateActionOption11.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmOptionNumber
	 * CorporateActionOption103.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmOptionNumber
	 * CorporateActionOption100.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmOptionNumber
	 * CorporateActionOption101.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionNumber
	 * CorporateActionOption102.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmOptionNumber
	 * CorporateActionOption110.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionNumber
	 * CorporateActionOption108.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmOptionNumber
	 * CorporateActionOption107.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmOptionNumber
	 * CorporateActionOption106.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionNumber
	 * CorporateActionOption111.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmOptionNumber
	 * CorporateActionOption113.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionNumber
	 * CorporateActionOption117.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmOptionNumber
	 * CorporateActionOption118.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmOptionNumber
	 * CorporateActionOption119.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmOptionNumber
	 * CorporateActionOption115.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmOptionNumber
	 * CorporateActionOption116.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionNumber
	 * CorporateActionOption114.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionNumber
	 * CorporateActionOption120.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionNumber
	 * InstructedCorporateActionOption6.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmOptionNumber
	 * CorporateActionOption121.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#mmOptionNumber
	 * CorporateActionOption126.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmOptionNumber
	 * CorporateActionOption124.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmOptionNumber
	 * CorporateActionOption125.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmOptionNumber
	 * CorporateActionOption123.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmOptionNumber
	 * CorporateActionOption127.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmOptionNumber
	 * InstructedCorporateActionOption7.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#mmOptionNumber
	 * CorporateActionOption128.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionNumber
	 * CorporateActionOption132.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionNumber
	 * CorporateActionOption130.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmOptionNumber
	 * CorporateActionOption131.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionNumber
	 * CorporateActionOption129.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.
	 * mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmOptionNumber
	 * CorporateActionOption134.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmOptionNumber
	 * CorporateActionOption136.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmOptionNumber
	 * CorporateActionOption135.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmOptionNumber
	 * CorporateActionOption133.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionNumber
	 * CorporateActionOption140.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmOptionNumber
	 * CorporateActionOption141.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionNumber
	 * CorporateActionOption138.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmOptionNumber
	 * CorporateActionOption142.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionNumber
	 * CorporateActionOption139.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionNumber
	 * InstructedCorporateActionOption8.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption143#mmOptionNumber
	 * CorporateActionOption143.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD2#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD2.
	 * mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmOptionNumber
	 * CorporateActionOption144.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption9#mmOptionNumber
	 * InstructedCorporateActionOption9.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmOptionNumber
	 * CorporateActionOption146.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmOptionNumber
	 * CorporateActionOption147.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmOptionNumber
	 * CorporateActionOption148.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption149#mmOptionNumber
	 * CorporateActionOption149.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmOptionNumber
	 * CorporateActionOption150.mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, Exact3NumericText> mmOptionNumber = new MMBusinessAttribute<CorporateActionOption, Exact3NumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption5.mmOptionNumber, CorporateActionOption13.mmOptionNumber, CorporateActionOption25.mmOptionNumber, CorporateActionOption30.mmOptionNumber,
					CorporateActionOption38.mmOptionNumber, CorporateActionOption47.mmOptionNumber, CorporateActionOption57.mmOptionNumber, CorporateActionOption58.mmOptionNumber, CorporateActionOption6.mmOptionNumber,
					CorporateActionOption21.mmOptionNumber, CorporateActionOption42.mmOptionNumber, CorporateActionOption28.mmOptionNumber, CorporateActionOption43.mmOptionNumber, CorporateActionOption9.mmOptionNumber,
					CorporateActionOption18.mmOptionNumber, CorporateActionOption22.mmOptionNumber, CorporateActionOption27.mmOptionNumber, CorporateActionOption26.mmOptionNumber, CorporateActionOption41.mmOptionNumber,
					CorporateActionOption50.mmOptionNumber, InstructedCorporateActionOption1.mmOptionNumber, InstructedCorporateActionOption2.mmOptionNumber, InstructedCorporateActionOption4.mmOptionNumber,
					InstructedCorporateActionOption5.mmOptionNumber, CorporateActionOption29.mmOptionNumber, CorporateActionOption4.mmOptionNumber, CorporateActionOption14.mmOptionNumber, CorporateActionOption23.mmOptionNumber,
					CorporateActionOption31.mmOptionNumber, CorporateActionOption37.mmOptionNumber, CorporateActionOption46.mmOptionNumber, CorporateActionOption53.mmOptionNumber, CorporateActionOption54.mmOptionNumber,
					CorporateActionOption10.mmOptionNumber, CorporateActionOption15.mmOptionNumber, CorporateActionOption20.mmOptionNumber, CorporateActionOption32.mmOptionNumber, CorporateActionOption35.mmOptionNumber,
					CorporateActionOption44.mmOptionNumber, CorporateActionOption52.mmOptionNumber, CorporateActionOption55.mmOptionNumber, CorporateActionOption12.mmOptionNumber, CorporateActionOption16.mmOptionNumber,
					CorporateActionOption24.mmOptionNumber, CorporateActionOption33.mmOptionNumber, CorporateActionOption39.mmOptionNumber, CorporateActionOption48.mmOptionNumber, CorporateActionOption3.mmOptionNumber,
					CorporateActionOption17.mmOptionNumber, CorporateActionOption19.mmOptionNumber, CorporateActionOption34.mmOptionNumber, CorporateActionOption36.mmOptionNumber, CorporateActionOption45.mmOptionNumber,
					CorporateActionOption51.mmOptionNumber, CorporateActionOption56.mmOptionNumber, CorporateActionOption1.mmOptionNumber, SecuritiesAccount9.mmOptionNumber, CorporateActionElection3.mmOptionNumber,
					CorporateActionElection1.mmOptionNumber, CorporateActionElection2.mmOptionNumber, EntitlementAdvice1.mmOptionNumber, GlobalDistributionRequest1.mmOptionNumber, CorporateActionMovement1.mmOptionNumber,
					SecuritiesAccount8.mmOptionNumber, CorporateActionOption2.mmOptionNumber, CorporateActionDeactivationInstructionStatus1.mmOptionNumber, CorporateActionOption7.mmOptionNumber, CorporateActionOption99.mmOptionNumber,
					CorporateActionOption11.mmOptionNumber, CorporateActionOption103.mmOptionNumber, CorporateActionOption100.mmOptionNumber, CorporateActionOption101.mmOptionNumber, CorporateActionOption102.mmOptionNumber,
					CorporateActionOption110.mmOptionNumber, CorporateActionOption108.mmOptionNumber, CorporateActionOption107.mmOptionNumber, CorporateActionOption106.mmOptionNumber, CorporateActionOption111.mmOptionNumber,
					CorporateActionOption113.mmOptionNumber, CorporateActionOption117.mmOptionNumber, CorporateActionOption118.mmOptionNumber, CorporateActionOption119.mmOptionNumber, CorporateActionOption115.mmOptionNumber,
					CorporateActionOption116.mmOptionNumber, CorporateActionOption114.mmOptionNumber, CorporateActionOption120.mmOptionNumber, InstructedCorporateActionOption6.mmOptionNumber, CorporateActionOption121.mmOptionNumber,
					CorporateActionOption126.mmOptionNumber, CorporateActionOption124.mmOptionNumber, CorporateActionOption125.mmOptionNumber, CorporateActionOption123.mmOptionNumber, CorporateActionOption127.mmOptionNumber,
					InstructedCorporateActionOption7.mmOptionNumber, CorporateActionOption128.mmOptionNumber, CorporateActionOption132.mmOptionNumber, CorporateActionOption130.mmOptionNumber, CorporateActionOption131.mmOptionNumber,
					CorporateActionOption129.mmOptionNumber, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmOptionNumber, CorporateActionInstructedBalanceOptionInstructionDetailsSD1.mmOptionNumber,
					CorporateActionOption134.mmOptionNumber, CorporateActionOption136.mmOptionNumber, CorporateActionOption135.mmOptionNumber, CorporateActionOption133.mmOptionNumber, CorporateActionOption140.mmOptionNumber,
					CorporateActionOption141.mmOptionNumber, CorporateActionOption138.mmOptionNumber, CorporateActionOption142.mmOptionNumber, CorporateActionOption139.mmOptionNumber, InstructedCorporateActionOption8.mmOptionNumber,
					CorporateActionOption143.mmOptionNumber, CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmOptionNumber, CorporateActionInstructedBalanceOptionInstructionDetailsSD2.mmOptionNumber,
					CorporateActionOption144.mmOptionNumber, InstructedCorporateActionOption9.mmOptionNumber, CorporateActionOption146.mmOptionNumber, CorporateActionOption147.mmOptionNumber, CorporateActionOption148.mmOptionNumber,
					CorporateActionOption149.mmOptionNumber, CorporateActionOption150.mmOptionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CorporateActionOption obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionOption obj, Exact3NumericText value) {
			obj.setOptionNumber(value);
		}
	};
	protected CorporateActionOptionCode optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption4Choice#mmCode
	 * CorporateActionOption4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption4Choice#mmProprietary
	 * CorporateActionOption4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmOptionType
	 * CorporateActionOption5.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption6Choice#mmCode
	 * CorporateActionOption6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption6Choice#mmProprietary
	 * CorporateActionOption6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmOptionType
	 * CorporateActionOption13.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmOptionType
	 * CorporateActionOption25.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmOptionType
	 * CorporateActionOption30.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption12Choice#mmCode
	 * CorporateActionOption12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption12Choice#mmProprietary
	 * CorporateActionOption12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmOptionType
	 * CorporateActionOption38.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption15Choice#mmCode
	 * CorporateActionOption15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption15Choice#mmProprietary
	 * CorporateActionOption15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmOptionType
	 * CorporateActionOption47.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmOptionType
	 * CorporateActionOption57.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmOptionType
	 * CorporateActionOption58.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#mmOptionType
	 * CorporateActionOption6.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#mmOptionType
	 * CorporateActionOption21.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#mmOptionType
	 * CorporateActionOption42.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#mmOptionType
	 * CorporateActionOption28.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#mmOptionType
	 * CorporateActionOption43.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption5Choice#mmCode
	 * CorporateActionOption5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption5Choice#mmProprietary
	 * CorporateActionOption5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmOptionType
	 * CorporateActionOption9.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice#mmCode
	 * CorporateActionOption7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice#mmProprietary
	 * CorporateActionOption7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmOptionType
	 * CorporateActionOption18.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmOptionType
	 * CorporateActionOption22.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmOptionType
	 * CorporateActionOption27.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmOptionType
	 * CorporateActionOption26.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption13Choice#mmCode
	 * CorporateActionOption13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption13Choice#mmProprietary
	 * CorporateActionOption13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmOptionType
	 * CorporateActionOption41.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption16Choice#mmCode
	 * CorporateActionOption16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption16Choice#mmProprietary
	 * CorporateActionOption16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmOptionType
	 * CorporateActionOption50.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice#mmCode
	 * CorporateActionOption2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice#mmProprietary
	 * CorporateActionOption2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmOptionType
	 * InstructedCorporateActionOption1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption9Choice#mmCode
	 * CorporateActionOption9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption9Choice#mmProprietary
	 * CorporateActionOption9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmOptionType
	 * InstructedCorporateActionOption2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption10Choice#mmCode
	 * CorporateActionOption10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption10Choice#mmProprietary
	 * CorporateActionOption10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmOptionType
	 * InstructedCorporateActionOption4.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice#mmCode
	 * CorporateActionOption17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice#mmProprietary
	 * CorporateActionOption17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmOptionType
	 * InstructedCorporateActionOption5.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmOptionType
	 * CorporateActionOption29.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption3Choice#mmCode
	 * CorporateActionOption3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption3Choice#mmProprietary
	 * CorporateActionOption3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmOptionType
	 * CorporateActionOption4.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption8Choice#mmCode
	 * CorporateActionOption8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption8Choice#mmProprietary
	 * CorporateActionOption8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmOptionType
	 * CorporateActionOption14.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmOptionType
	 * CorporateActionOption23.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmOptionType
	 * CorporateActionOption31.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice#mmCode
	 * CorporateActionOption11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice#mmProprietary
	 * CorporateActionOption11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmOptionType
	 * CorporateActionOption37.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice#mmCode
	 * CorporateActionOption14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice#mmProprietary
	 * CorporateActionOption14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmOptionType
	 * CorporateActionOption46.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionType
	 * CorporateActionOption53.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmOptionType
	 * CorporateActionOption54.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmOptionType
	 * CorporateActionOption10.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmOptionType
	 * CorporateActionOption15.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmOptionType
	 * CorporateActionOption20.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmOptionType
	 * CorporateActionOption32.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmOptionType
	 * CorporateActionOption35.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmOptionType
	 * CorporateActionOption44.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmOptionType
	 * CorporateActionOption52.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmOptionType
	 * CorporateActionOption55.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#mmOptionType
	 * CorporateActionOption12.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#mmOptionType
	 * CorporateActionOption16.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#mmOptionType
	 * CorporateActionOption24.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#mmOptionType
	 * CorporateActionOption33.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#mmOptionType
	 * CorporateActionOption39.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#mmOptionType
	 * CorporateActionOption48.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmOptionType
	 * CorporateActionOption3.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmOptionType
	 * CorporateActionOption17.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionType
	 * CorporateActionOption19.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmOptionType
	 * CorporateActionOption34.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmOptionType
	 * CorporateActionOption36.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmOptionType
	 * CorporateActionOption45.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmOptionType
	 * CorporateActionOption51.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmOptionType
	 * CorporateActionOption56.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmCorporateActionOptionType
	 * AggregateBalanceInformation8.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmCorporateActionOptionType
	 * AggregateBalanceInformation11.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmCorporateActionOptionType
	 * AggregateBalanceInformation13.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmCorporateActionOptionType
	 * AggregateBalanceInformation15.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmCorporateActionOptionType
	 * AggregateBalanceInformation17.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmCorporateActionOptionType
	 * AggregateBalanceInformation19.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmCorporateActionOptionType
	 * AggregateBalanceInformation22.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmCorporateActionOptionType
	 * AggregateBalanceInformation23.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmCorporateActionOptionType
	 * AggregateBalanceInformation9.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmCorporateActionOptionType
	 * AggregateBalanceInformation10.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmCorporateActionOptionType
	 * AggregateBalanceInformation12.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmCorporateActionOptionType
	 * AggregateBalanceInformation14.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmCorporateActionOptionType
	 * AggregateBalanceInformation16.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmCorporateActionOptionType
	 * AggregateBalanceInformation18.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmCorporateActionOptionType
	 * AggregateBalanceInformation21.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmCorporateActionOptionType
	 * AggregateBalanceInformation24.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#mmCode
	 * CorporateActionOption1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#mmProprietary
	 * CorporateActionOption1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmDefaultOptionType
	 * CorporateAction2.mmDefaultOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionType
	 * CorporateActionOption1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#mmOptionType
	 * SecuritiesAccount9.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionType
	 * CorporateActionElection3.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmOptionType
	 * CorporateActionElection1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmOptionType
	 * CorporateActionElection2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmOptionType
	 * EntitlementAdvice1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionType
	 * GlobalDistributionRequest1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmOptionType
	 * CorporateActionMovement1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#mmOptionType
	 * SecuritiesAccount8.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#mmOptionType
	 * CorporateActionOption2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionType
	 * CorporateActionDeactivationInstructionStatus1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#mmOptionType
	 * CorporateActionOption7.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmCorporateActionOptionType
	 * AggregateBalanceInformation20.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#mmOptionType
	 * CorporateActionOption11.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmCorporateActionOptionType
	 * AggregateBalanceInformation6.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmCorporateActionOptionType
	 * AggregateBalanceInformation7.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmOptionType
	 * CorporateActionOption103.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmOptionType
	 * CorporateActionOption100.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmOptionType
	 * CorporateActionOption101.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionType
	 * CorporateActionOption102.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmOptionType
	 * CorporateActionOption110.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionType
	 * CorporateActionOption108.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmOptionType
	 * CorporateActionOption107.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmOptionType
	 * CorporateActionOption106.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmCorporateActionOptionType
	 * AggregateBalanceInformation26.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmCorporateActionOptionType
	 * AggregateBalanceInformation25.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionType
	 * CorporateActionOption111.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmOptionType
	 * CorporateActionOption113.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmCorporateActionOptionType
	 * AggregateBalanceInformation28.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmCorporateActionOptionType
	 * AggregateBalanceInformation27.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmCorporateActionOptionType
	 * AggregateBalanceInformation30.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmCorporateActionOptionType
	 * AggregateBalanceInformation31.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionType
	 * CorporateActionOption117.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmOptionType
	 * CorporateActionOption118.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmOptionType
	 * CorporateActionOption119.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmOptionType
	 * CorporateActionOption115.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmOptionType
	 * CorporateActionOption116.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionType
	 * CorporateActionOption114.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmOptionType
	 * CorporateActionOption120.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmCode
	 * CorporateActionOption19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#mmProprietary
	 * CorporateActionOption19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionType
	 * InstructedCorporateActionOption6.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#mmCode
	 * CorporateActionOption18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#mmProprietary
	 * CorporateActionOption18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#mmCode
	 * CorporateActionOption21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#mmProprietary
	 * CorporateActionOption21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#mmCode
	 * CorporateActionOption20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#mmProprietary
	 * CorporateActionOption20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmOptionType
	 * CorporateActionOption121.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#mmOptionType
	 * CorporateActionOption126.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmOptionType
	 * CorporateActionOption124.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmOptionType
	 * CorporateActionOption125.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmOptionType
	 * CorporateActionOption123.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmOptionType
	 * CorporateActionOption127.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption26Choice#mmCode
	 * CorporateActionOption26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption26Choice#mmProprietary
	 * CorporateActionOption26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmOptionType
	 * InstructedCorporateActionOption7.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption23Choice#mmCode
	 * CorporateActionOption23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption23Choice#mmProprietary
	 * CorporateActionOption23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption22Choice#mmCode
	 * CorporateActionOption22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption22Choice#mmProprietary
	 * CorporateActionOption22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption25Choice#mmCode
	 * CorporateActionOption25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption25Choice#mmProprietary
	 * CorporateActionOption25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmCorporateActionOptionType
	 * AggregateBalanceInformation32.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmCorporateActionOptionType
	 * AggregateBalanceInformation33.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#mmOptionType
	 * CorporateActionOption128.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption29Choice#mmCode
	 * CorporateActionOption29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption29Choice#mmProprietary
	 * CorporateActionOption29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation34#mmCorporateActionOptionType
	 * AggregateBalanceInformation34.mmCorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionType
	 * CorporateActionOption132.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionType
	 * CorporateActionOption130.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmOptionType
	 * CorporateActionOption131.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionType
	 * CorporateActionOption129.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmOptionType
	 * CorporateActionOption134.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmOptionType
	 * CorporateActionOption136.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmOptionType
	 * CorporateActionOption135.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmOptionType
	 * CorporateActionOption133.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionType
	 * CorporateActionOption140.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmOptionType
	 * CorporateActionOption141.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionType
	 * CorporateActionOption138.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmOptionType
	 * CorporateActionOption142.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionType
	 * CorporateActionOption139.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionType
	 * InstructedCorporateActionOption8.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption143#mmOptionType
	 * CorporateActionOption143.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmOptionType
	 * CorporateActionOption144.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption9#mmOptionType
	 * InstructedCorporateActionOption9.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmOptionType
	 * CorporateActionOption146.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmOptionType
	 * CorporateActionOption147.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmOptionType
	 * CorporateActionOption148.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption149#mmOptionType
	 * CorporateActionOption149.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmOptionType
	 * CorporateActionOption150.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, CorporateActionOptionCode> mmOptionType = new MMBusinessAttribute<CorporateActionOption, CorporateActionOptionCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption4Choice.mmCode, CorporateActionOption4Choice.mmProprietary, CorporateActionOption5.mmOptionType, CorporateActionOption6Choice.mmCode,
					CorporateActionOption6Choice.mmProprietary, CorporateActionOption13.mmOptionType, CorporateActionOption25.mmOptionType, CorporateActionOption30.mmOptionType, CorporateActionOption12Choice.mmCode,
					CorporateActionOption12Choice.mmProprietary, CorporateActionOption38.mmOptionType, CorporateActionOption15Choice.mmCode, CorporateActionOption15Choice.mmProprietary, CorporateActionOption47.mmOptionType,
					CorporateActionOption57.mmOptionType, CorporateActionOption58.mmOptionType, CorporateActionOption6.mmOptionType, CorporateActionOption21.mmOptionType, CorporateActionOption42.mmOptionType,
					CorporateActionOption28.mmOptionType, CorporateActionOption43.mmOptionType, CorporateActionOption5Choice.mmCode, CorporateActionOption5Choice.mmProprietary, CorporateActionOption9.mmOptionType,
					CorporateActionOption7Choice.mmCode, CorporateActionOption7Choice.mmProprietary, CorporateActionOption18.mmOptionType, CorporateActionOption22.mmOptionType, CorporateActionOption27.mmOptionType,
					CorporateActionOption26.mmOptionType, CorporateActionOption13Choice.mmCode, CorporateActionOption13Choice.mmProprietary, CorporateActionOption41.mmOptionType, CorporateActionOption16Choice.mmCode,
					CorporateActionOption16Choice.mmProprietary, CorporateActionOption50.mmOptionType, CorporateActionOption2Choice.mmCode, CorporateActionOption2Choice.mmProprietary, InstructedCorporateActionOption1.mmOptionType,
					CorporateActionOption9Choice.mmCode, CorporateActionOption9Choice.mmProprietary, InstructedCorporateActionOption2.mmOptionType, CorporateActionOption10Choice.mmCode, CorporateActionOption10Choice.mmProprietary,
					InstructedCorporateActionOption4.mmOptionType, CorporateActionOption17Choice.mmCode, CorporateActionOption17Choice.mmProprietary, InstructedCorporateActionOption5.mmOptionType, CorporateActionOption29.mmOptionType,
					CorporateActionOption3Choice.mmCode, CorporateActionOption3Choice.mmProprietary, CorporateActionOption4.mmOptionType, CorporateActionOption8Choice.mmCode, CorporateActionOption8Choice.mmProprietary,
					CorporateActionOption14.mmOptionType, CorporateActionOption23.mmOptionType, CorporateActionOption31.mmOptionType, CorporateActionOption11Choice.mmCode, CorporateActionOption11Choice.mmProprietary,
					CorporateActionOption37.mmOptionType, CorporateActionOption14Choice.mmCode, CorporateActionOption14Choice.mmProprietary, CorporateActionOption46.mmOptionType, CorporateActionOption53.mmOptionType,
					CorporateActionOption54.mmOptionType, CorporateActionOption10.mmOptionType, CorporateActionOption15.mmOptionType, CorporateActionOption20.mmOptionType, CorporateActionOption32.mmOptionType,
					CorporateActionOption35.mmOptionType, CorporateActionOption44.mmOptionType, CorporateActionOption52.mmOptionType, CorporateActionOption55.mmOptionType, CorporateActionOption12.mmOptionType,
					CorporateActionOption16.mmOptionType, CorporateActionOption24.mmOptionType, CorporateActionOption33.mmOptionType, CorporateActionOption39.mmOptionType, CorporateActionOption48.mmOptionType,
					CorporateActionOption3.mmOptionType, CorporateActionOption17.mmOptionType, CorporateActionOption19.mmOptionType, CorporateActionOption34.mmOptionType, CorporateActionOption36.mmOptionType,
					CorporateActionOption45.mmOptionType, CorporateActionOption51.mmOptionType, CorporateActionOption56.mmOptionType, AggregateBalanceInformation8.mmCorporateActionOptionType,
					AggregateBalanceInformation11.mmCorporateActionOptionType, AggregateBalanceInformation13.mmCorporateActionOptionType, AggregateBalanceInformation15.mmCorporateActionOptionType,
					AggregateBalanceInformation17.mmCorporateActionOptionType, AggregateBalanceInformation19.mmCorporateActionOptionType, AggregateBalanceInformation22.mmCorporateActionOptionType,
					AggregateBalanceInformation23.mmCorporateActionOptionType, AggregateBalanceInformation9.mmCorporateActionOptionType, AggregateBalanceInformation10.mmCorporateActionOptionType,
					AggregateBalanceInformation12.mmCorporateActionOptionType, AggregateBalanceInformation14.mmCorporateActionOptionType, AggregateBalanceInformation16.mmCorporateActionOptionType,
					AggregateBalanceInformation18.mmCorporateActionOptionType, AggregateBalanceInformation21.mmCorporateActionOptionType, AggregateBalanceInformation24.mmCorporateActionOptionType, CorporateActionOption1FormatChoice.mmCode,
					CorporateActionOption1FormatChoice.mmProprietary, CorporateAction2.mmDefaultOptionType, CorporateActionOption1.mmOptionType, SecuritiesAccount9.mmOptionType, CorporateActionElection3.mmOptionType,
					CorporateActionElection1.mmOptionType, CorporateActionElection2.mmOptionType, EntitlementAdvice1.mmOptionType, GlobalDistributionRequest1.mmOptionType, CorporateActionMovement1.mmOptionType,
					SecuritiesAccount8.mmOptionType, CorporateActionOption2.mmOptionType, CorporateActionDeactivationInstructionStatus1.mmOptionType, CorporateActionOption7.mmOptionType,
					AggregateBalanceInformation20.mmCorporateActionOptionType, CorporateActionOption11.mmOptionType, AggregateBalanceInformation6.mmCorporateActionOptionType, AggregateBalanceInformation7.mmCorporateActionOptionType,
					CorporateActionOption103.mmOptionType, CorporateActionOption100.mmOptionType, CorporateActionOption101.mmOptionType, CorporateActionOption102.mmOptionType, CorporateActionOption110.mmOptionType,
					CorporateActionOption108.mmOptionType, CorporateActionOption107.mmOptionType, CorporateActionOption106.mmOptionType, AggregateBalanceInformation26.mmCorporateActionOptionType,
					AggregateBalanceInformation25.mmCorporateActionOptionType, CorporateActionOption111.mmOptionType, CorporateActionOption113.mmOptionType, AggregateBalanceInformation28.mmCorporateActionOptionType,
					AggregateBalanceInformation27.mmCorporateActionOptionType, AggregateBalanceInformation30.mmCorporateActionOptionType, AggregateBalanceInformation31.mmCorporateActionOptionType, CorporateActionOption117.mmOptionType,
					CorporateActionOption118.mmOptionType, CorporateActionOption119.mmOptionType, CorporateActionOption115.mmOptionType, CorporateActionOption116.mmOptionType, CorporateActionOption114.mmOptionType,
					CorporateActionOption120.mmOptionType, CorporateActionOption19Choice.mmCode, CorporateActionOption19Choice.mmProprietary, InstructedCorporateActionOption6.mmOptionType, CorporateActionOption18Choice.mmCode,
					CorporateActionOption18Choice.mmProprietary, CorporateActionOption21Choice.mmCode, CorporateActionOption21Choice.mmProprietary, CorporateActionOption20Choice.mmCode, CorporateActionOption20Choice.mmProprietary,
					CorporateActionOption121.mmOptionType, CorporateActionOption126.mmOptionType, CorporateActionOption124.mmOptionType, CorporateActionOption125.mmOptionType, CorporateActionOption123.mmOptionType,
					CorporateActionOption127.mmOptionType, CorporateActionOption26Choice.mmCode, CorporateActionOption26Choice.mmProprietary, InstructedCorporateActionOption7.mmOptionType, CorporateActionOption23Choice.mmCode,
					CorporateActionOption23Choice.mmProprietary, CorporateActionOption22Choice.mmCode, CorporateActionOption22Choice.mmProprietary, CorporateActionOption25Choice.mmCode, CorporateActionOption25Choice.mmProprietary,
					AggregateBalanceInformation32.mmCorporateActionOptionType, AggregateBalanceInformation33.mmCorporateActionOptionType, CorporateActionOption128.mmOptionType, CorporateActionOption29Choice.mmCode,
					CorporateActionOption29Choice.mmProprietary, AggregateBalanceInformation34.mmCorporateActionOptionType, CorporateActionOption132.mmOptionType, CorporateActionOption130.mmOptionType,
					CorporateActionOption131.mmOptionType, CorporateActionOption129.mmOptionType, CorporateActionOption134.mmOptionType, CorporateActionOption136.mmOptionType, CorporateActionOption135.mmOptionType,
					CorporateActionOption133.mmOptionType, CorporateActionOption140.mmOptionType, CorporateActionOption141.mmOptionType, CorporateActionOption138.mmOptionType, CorporateActionOption142.mmOptionType,
					CorporateActionOption139.mmOptionType, InstructedCorporateActionOption8.mmOptionType, CorporateActionOption143.mmOptionType, CorporateActionOption144.mmOptionType, InstructedCorporateActionOption9.mmOptionType,
					CorporateActionOption146.mmOptionType, CorporateActionOption147.mmOptionType, CorporateActionOption148.mmOptionType, CorporateActionOption149.mmOptionType, CorporateActionOption150.mmOptionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		@Override
		public CorporateActionOptionCode getValue(CorporateActionOption obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionOption obj, CorporateActionOptionCode value) {
			obj.setOptionType(value);
		}
	};
	protected FractionDispositionTypeCode fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType2Choice#mmCode
	 * FractionDispositionType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType2Choice#mmProprietary
	 * FractionDispositionType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmFractionDisposition
	 * CorporateActionOption5.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType8Choice#mmCode
	 * FractionDispositionType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType8Choice#mmProprietary
	 * FractionDispositionType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmFractionDisposition
	 * CorporateActionOption13.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType10Choice#mmCode
	 * FractionDispositionType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType10Choice#mmProprietary
	 * FractionDispositionType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmFractionDisposition
	 * CorporateActionOption25.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType11Choice#mmCode
	 * FractionDispositionType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType11Choice#mmProprietary
	 * FractionDispositionType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmFractionDisposition
	 * CorporateActionOption30.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmFractionDisposition
	 * CorporateActionOption38.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmFractionDisposition
	 * CorporateActionOption47.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType17Choice#mmCode
	 * FractionDispositionType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType17Choice#mmProprietary
	 * FractionDispositionType17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmFractionDisposition
	 * CorporateActionOption57.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType18Choice#mmCode
	 * FractionDispositionType18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType18Choice#mmProprietary
	 * FractionDispositionType18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmFractionDisposition
	 * CorporateActionOption58.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice#mmCode
	 * FractionDispositionType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice#mmProprietary
	 * FractionDispositionType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType4Choice#mmCode
	 * FractionDispositionType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType4Choice#mmProprietary
	 * FractionDispositionType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmFractionDisposition
	 * SecuritiesOption3.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmFractionDisposition
	 * CorporateActionOption4.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice#mmCode
	 * FractionDispositionType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice#mmProprietary
	 * FractionDispositionType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType7Choice#mmCode
	 * FractionDispositionType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType7Choice#mmProprietary
	 * FractionDispositionType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmFractionDisposition
	 * SecuritiesOption8.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmFractionDisposition
	 * CorporateActionOption14.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType12Choice#mmCode
	 * FractionDispositionType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType12Choice#mmProprietary
	 * FractionDispositionType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmFractionDisposition
	 * SecuritiesOption18.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmFractionDisposition
	 * CorporateActionOption23.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType13Choice#mmCode
	 * FractionDispositionType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType13Choice#mmProprietary
	 * FractionDispositionType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmFractionDisposition
	 * SecuritiesOption20.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmFractionDisposition
	 * CorporateActionOption31.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmFractionDisposition
	 * SecuritiesOption26.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmFractionDisposition
	 * CorporateActionOption37.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmFractionDisposition
	 * SecuritiesOption31.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmFractionDisposition
	 * CorporateActionOption46.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice#mmCode
	 * FractionDispositionType23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice#mmProprietary
	 * FractionDispositionType23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmFractionDisposition
	 * SecuritiesOption35.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmFractionDisposition
	 * CorporateActionOption53.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice#mmCode
	 * FractionDispositionType24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice#mmProprietary
	 * FractionDispositionType24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmFractionDisposition
	 * SecuritiesOption36.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmFractionDisposition
	 * CorporateActionOption54.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmFractionDisposition
	 * SecuritiesOption4.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmFractionDisposition
	 * CorporateActionOption10.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmFractionDisposition
	 * SecuritiesOption10.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmFractionDisposition
	 * CorporateActionOption15.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmFractionDisposition
	 * SecuritiesOption13.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmFractionDisposition
	 * CorporateActionOption20.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmFractionDisposition
	 * SecuritiesOption17.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmFractionDisposition
	 * CorporateActionOption32.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmFractionDisposition
	 * SecuritiesOption24.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmFractionDisposition
	 * CorporateActionOption35.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmFractionDisposition
	 * SecuritiesOption29.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmFractionDisposition
	 * CorporateActionOption44.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice#mmCode
	 * FractionDispositionType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice#mmProprietary
	 * FractionDispositionType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmFractionDisposition
	 * SecuritiesOption33.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmFractionDisposition
	 * SecuritiesOption38.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmFractionDisposition
	 * CorporateActionOption52.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice#mmCode
	 * FractionDispositionType20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice#mmProprietary
	 * FractionDispositionType20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmFractionDisposition
	 * SecuritiesOption37.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmFractionDisposition
	 * SecuritiesOption39.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmFractionDisposition
	 * CorporateActionOption55.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType3Choice#mmCode
	 * FractionDispositionType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType3Choice#mmProprietary
	 * FractionDispositionType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmFractionDisposition
	 * FinancialInstrumentAttributes3.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmFractionDisposition
	 * SecuritiesOption6.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmFractionDisposition
	 * CorporateActionOption3.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType5Choice#mmCode
	 * FractionDispositionType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType5Choice#mmProprietary
	 * FractionDispositionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmFractionDisposition
	 * FinancialInstrumentAttributes12.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmFractionDisposition
	 * SecuritiesOption12.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmFractionDisposition
	 * CorporateActionOption17.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType9Choice#mmCode
	 * FractionDispositionType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType9Choice#mmProprietary
	 * FractionDispositionType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmFractionDisposition
	 * FinancialInstrumentAttributes17.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmFractionDisposition
	 * SecuritiesOption14.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmFractionDisposition
	 * CorporateActionOption19.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType14Choice#mmCode
	 * FractionDispositionType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType14Choice#mmProprietary
	 * FractionDispositionType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmFractionDisposition
	 * FinancialInstrumentAttributes25.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmFractionDisposition
	 * SecuritiesOption22.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmFractionDisposition
	 * CorporateActionOption34.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmFractionDisposition
	 * SecuritiesOption25.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmFractionDisposition
	 * CorporateActionOption36.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmFractionDisposition
	 * SecuritiesOption30.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmFractionDisposition
	 * CorporateActionOption45.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType15Choice#mmCode
	 * FractionDispositionType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType15Choice#mmProprietary
	 * FractionDispositionType15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmFractionDisposition
	 * FinancialInstrumentAttributes46.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmFractionDisposition
	 * CorporateActionOption51.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType16Choice#mmCode
	 * FractionDispositionType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType16Choice#mmProprietary
	 * FractionDispositionType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmFractionDisposition
	 * FinancialInstrumentAttributes47.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmFractionDisposition
	 * CorporateActionOption56.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#mmCode
	 * FractionDispositionType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#mmProprietary
	 * FractionDispositionType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmFractionDisposition
	 * SecurityOption1.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmFractionDisposition
	 * CorporateActionOption1.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmFractionDisposition
	 * CorporateActionOption103.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmFractionDisposition
	 * CorporateActionOption100.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmFractionDisposition
	 * CorporateActionOption101.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmFractionDisposition
	 * CorporateActionOption102.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmFractionDisposition
	 * SecuritiesOption42.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmFractionDisposition
	 * SecuritiesOption40.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmFractionDisposition
	 * CorporateActionOption110.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmFractionDisposition
	 * CorporateActionOption108.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmFractionDisposition
	 * CorporateActionOption107.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmFractionDisposition
	 * CorporateActionOption106.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmFractionDisposition
	 * SecuritiesOption48.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmFractionDisposition
	 * SecuritiesOption45.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmFractionDisposition
	 * CorporateActionOption111.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmFractionDisposition
	 * CorporateActionOption113.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmFractionDisposition
	 * CorporateActionOption117.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmFractionDisposition
	 * CorporateActionOption118.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmFractionDisposition
	 * CorporateActionOption115.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmFractionDisposition
	 * CorporateActionOption114.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmFractionDisposition
	 * FinancialInstrumentAttributes68.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#mmCode
	 * FractionDispositionType25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#mmProprietary
	 * FractionDispositionType25Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#mmCode
	 * FractionDispositionType27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#mmProprietary
	 * FractionDispositionType27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmFractionDisposition
	 * SecuritiesOption49.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#mmCode
	 * FractionDispositionType26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#mmProprietary
	 * FractionDispositionType26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#mmCode
	 * FractionDispositionType28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#mmProprietary
	 * FractionDispositionType28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmFractionDisposition
	 * SecuritiesOption50.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmFractionDisposition
	 * CorporateActionOption124.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmFractionDisposition
	 * CorporateActionOption125.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmFractionDisposition
	 * CorporateActionOption123.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmFractionDisposition
	 * FinancialInstrumentAttributes73.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmFractionDisposition
	 * CorporateActionOption127.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType30Choice#mmCode
	 * FractionDispositionType30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType30Choice#mmProprietary
	 * FractionDispositionType30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmFractionDisposition
	 * SecuritiesOption55.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType29Choice#mmCode
	 * FractionDispositionType29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType29Choice#mmProprietary
	 * FractionDispositionType29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmFractionDisposition
	 * SecuritiesOption57.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType31Choice#mmCode
	 * FractionDispositionType31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType31Choice#mmProprietary
	 * FractionDispositionType31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType32Choice#mmCode
	 * FractionDispositionType32Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType32Choice#mmProprietary
	 * FractionDispositionType32Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmFractionDisposition
	 * CorporateActionOption132.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmFractionDisposition
	 * CorporateActionOption130.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmFractionDisposition
	 * CorporateActionOption131.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmFractionDisposition
	 * CorporateActionOption129.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmFractionDisposition
	 * SecuritiesOption60.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmFractionDisposition
	 * SecuritiesOption59.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmFractionDisposition
	 * CorporateActionOption134.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmFractionDisposition
	 * CorporateActionOption136.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmFractionDisposition
	 * CorporateActionOption135.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmFractionDisposition
	 * CorporateActionOption133.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmFractionDisposition
	 * SecuritiesOption61.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmFractionDisposition
	 * SecuritiesOption63.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmFractionDisposition
	 * CorporateActionOption140.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmFractionDisposition
	 * CorporateActionOption138.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmFractionDisposition
	 * CorporateActionOption142.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmFractionDisposition
	 * CorporateActionOption139.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmFractionDisposition
	 * SecuritiesOption64.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmFractionDisposition
	 * SecuritiesOption65.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmFractionDisposition
	 * FinancialInstrumentAttributes93.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmFractionDisposition
	 * CorporateActionOption146.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmFractionDisposition
	 * CorporateActionOption147.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmFractionDisposition
	 * SecuritiesOption67.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmFractionDisposition
	 * CorporateActionOption148.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmFractionDisposition
	 * SecuritiesOption68.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94#mmFractionDisposition
	 * FinancialInstrumentAttributes94.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmFractionDisposition
	 * CorporateActionOption150.mmFractionDisposition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, FractionDispositionTypeCode> mmFractionDisposition = new MMBusinessAttribute<CorporateActionOption, FractionDispositionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FractionDispositionType2Choice.mmCode, FractionDispositionType2Choice.mmProprietary, CorporateActionOption5.mmFractionDisposition, FractionDispositionType8Choice.mmCode,
					FractionDispositionType8Choice.mmProprietary, CorporateActionOption13.mmFractionDisposition, FractionDispositionType10Choice.mmCode, FractionDispositionType10Choice.mmProprietary,
					CorporateActionOption25.mmFractionDisposition, FractionDispositionType11Choice.mmCode, FractionDispositionType11Choice.mmProprietary, CorporateActionOption30.mmFractionDisposition,
					CorporateActionOption38.mmFractionDisposition, CorporateActionOption47.mmFractionDisposition, FractionDispositionType17Choice.mmCode, FractionDispositionType17Choice.mmProprietary,
					CorporateActionOption57.mmFractionDisposition, FractionDispositionType18Choice.mmCode, FractionDispositionType18Choice.mmProprietary, CorporateActionOption58.mmFractionDisposition, FractionDispositionType1Choice.mmCode,
					FractionDispositionType1Choice.mmProprietary, FractionDispositionType4Choice.mmCode, FractionDispositionType4Choice.mmProprietary, SecuritiesOption3.mmFractionDisposition, CorporateActionOption4.mmFractionDisposition,
					FractionDispositionType6Choice.mmCode, FractionDispositionType6Choice.mmProprietary, FractionDispositionType7Choice.mmCode, FractionDispositionType7Choice.mmProprietary, SecuritiesOption8.mmFractionDisposition,
					CorporateActionOption14.mmFractionDisposition, FractionDispositionType12Choice.mmCode, FractionDispositionType12Choice.mmProprietary, SecuritiesOption18.mmFractionDisposition,
					CorporateActionOption23.mmFractionDisposition, FractionDispositionType13Choice.mmCode, FractionDispositionType13Choice.mmProprietary, SecuritiesOption20.mmFractionDisposition,
					CorporateActionOption31.mmFractionDisposition, SecuritiesOption26.mmFractionDisposition, CorporateActionOption37.mmFractionDisposition, SecuritiesOption31.mmFractionDisposition,
					CorporateActionOption46.mmFractionDisposition, FractionDispositionType23Choice.mmCode, FractionDispositionType23Choice.mmProprietary, SecuritiesOption35.mmFractionDisposition,
					CorporateActionOption53.mmFractionDisposition, FractionDispositionType24Choice.mmCode, FractionDispositionType24Choice.mmProprietary, SecuritiesOption36.mmFractionDisposition,
					CorporateActionOption54.mmFractionDisposition, SecuritiesOption4.mmFractionDisposition, CorporateActionOption10.mmFractionDisposition, SecuritiesOption10.mmFractionDisposition,
					CorporateActionOption15.mmFractionDisposition, SecuritiesOption13.mmFractionDisposition, CorporateActionOption20.mmFractionDisposition, SecuritiesOption17.mmFractionDisposition,
					CorporateActionOption32.mmFractionDisposition, SecuritiesOption24.mmFractionDisposition, CorporateActionOption35.mmFractionDisposition, SecuritiesOption29.mmFractionDisposition,
					CorporateActionOption44.mmFractionDisposition, FractionDispositionType19Choice.mmCode, FractionDispositionType19Choice.mmProprietary, SecuritiesOption33.mmFractionDisposition, SecuritiesOption38.mmFractionDisposition,
					CorporateActionOption52.mmFractionDisposition, FractionDispositionType20Choice.mmCode, FractionDispositionType20Choice.mmProprietary, SecuritiesOption37.mmFractionDisposition, SecuritiesOption39.mmFractionDisposition,
					CorporateActionOption55.mmFractionDisposition, FractionDispositionType3Choice.mmCode, FractionDispositionType3Choice.mmProprietary, FinancialInstrumentAttributes3.mmFractionDisposition,
					SecuritiesOption6.mmFractionDisposition, CorporateActionOption3.mmFractionDisposition, FractionDispositionType5Choice.mmCode, FractionDispositionType5Choice.mmProprietary,
					FinancialInstrumentAttributes12.mmFractionDisposition, SecuritiesOption12.mmFractionDisposition, CorporateActionOption17.mmFractionDisposition, FractionDispositionType9Choice.mmCode,
					FractionDispositionType9Choice.mmProprietary, FinancialInstrumentAttributes17.mmFractionDisposition, SecuritiesOption14.mmFractionDisposition, CorporateActionOption19.mmFractionDisposition,
					FractionDispositionType14Choice.mmCode, FractionDispositionType14Choice.mmProprietary, FinancialInstrumentAttributes25.mmFractionDisposition, SecuritiesOption22.mmFractionDisposition,
					CorporateActionOption34.mmFractionDisposition, SecuritiesOption25.mmFractionDisposition, CorporateActionOption36.mmFractionDisposition, SecuritiesOption30.mmFractionDisposition,
					CorporateActionOption45.mmFractionDisposition, FractionDispositionType15Choice.mmCode, FractionDispositionType15Choice.mmProprietary, FinancialInstrumentAttributes46.mmFractionDisposition,
					CorporateActionOption51.mmFractionDisposition, FractionDispositionType16Choice.mmCode, FractionDispositionType16Choice.mmProprietary, FinancialInstrumentAttributes47.mmFractionDisposition,
					CorporateActionOption56.mmFractionDisposition, FractionDispositionType1FormatChoice.mmCode, FractionDispositionType1FormatChoice.mmProprietary, SecurityOption1.mmFractionDisposition,
					CorporateActionOption1.mmFractionDisposition, CorporateActionOption103.mmFractionDisposition, CorporateActionOption100.mmFractionDisposition, CorporateActionOption101.mmFractionDisposition,
					CorporateActionOption102.mmFractionDisposition, SecuritiesOption42.mmFractionDisposition, SecuritiesOption40.mmFractionDisposition, CorporateActionOption110.mmFractionDisposition,
					CorporateActionOption108.mmFractionDisposition, CorporateActionOption107.mmFractionDisposition, CorporateActionOption106.mmFractionDisposition, SecuritiesOption48.mmFractionDisposition,
					SecuritiesOption45.mmFractionDisposition, CorporateActionOption111.mmFractionDisposition, CorporateActionOption113.mmFractionDisposition, CorporateActionOption117.mmFractionDisposition,
					CorporateActionOption118.mmFractionDisposition, CorporateActionOption115.mmFractionDisposition, CorporateActionOption114.mmFractionDisposition, FinancialInstrumentAttributes68.mmFractionDisposition,
					FractionDispositionType25Choice.mmCode, FractionDispositionType25Choice.mmProprietary, FractionDispositionType27Choice.mmCode, FractionDispositionType27Choice.mmProprietary, SecuritiesOption49.mmFractionDisposition,
					FractionDispositionType26Choice.mmCode, FractionDispositionType26Choice.mmProprietary, FractionDispositionType28Choice.mmCode, FractionDispositionType28Choice.mmProprietary, SecuritiesOption50.mmFractionDisposition,
					CorporateActionOption124.mmFractionDisposition, CorporateActionOption125.mmFractionDisposition, CorporateActionOption123.mmFractionDisposition, FinancialInstrumentAttributes73.mmFractionDisposition,
					CorporateActionOption127.mmFractionDisposition, FractionDispositionType30Choice.mmCode, FractionDispositionType30Choice.mmProprietary, SecuritiesOption55.mmFractionDisposition, FractionDispositionType29Choice.mmCode,
					FractionDispositionType29Choice.mmProprietary, SecuritiesOption57.mmFractionDisposition, FractionDispositionType31Choice.mmCode, FractionDispositionType31Choice.mmProprietary, FractionDispositionType32Choice.mmCode,
					FractionDispositionType32Choice.mmProprietary, CorporateActionOption132.mmFractionDisposition, CorporateActionOption130.mmFractionDisposition, CorporateActionOption131.mmFractionDisposition,
					CorporateActionOption129.mmFractionDisposition, SecuritiesOption60.mmFractionDisposition, SecuritiesOption59.mmFractionDisposition, CorporateActionOption134.mmFractionDisposition,
					CorporateActionOption136.mmFractionDisposition, CorporateActionOption135.mmFractionDisposition, CorporateActionOption133.mmFractionDisposition, SecuritiesOption61.mmFractionDisposition,
					SecuritiesOption63.mmFractionDisposition, CorporateActionOption140.mmFractionDisposition, CorporateActionOption138.mmFractionDisposition, CorporateActionOption142.mmFractionDisposition,
					CorporateActionOption139.mmFractionDisposition, SecuritiesOption64.mmFractionDisposition, SecuritiesOption65.mmFractionDisposition, FinancialInstrumentAttributes93.mmFractionDisposition,
					CorporateActionOption146.mmFractionDisposition, CorporateActionOption147.mmFractionDisposition, SecuritiesOption67.mmFractionDisposition, CorporateActionOption148.mmFractionDisposition,
					SecuritiesOption68.mmFractionDisposition, FinancialInstrumentAttributes94.mmFractionDisposition, CorporateActionOption150.mmFractionDisposition);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}

		@Override
		public FractionDispositionTypeCode getValue(CorporateActionOption obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(CorporateActionOption obj, FractionDispositionTypeCode value) {
			obj.setFractionDisposition(value);
		}
	};
	protected CurrencyCode currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmCurrencyOption
	 * CorporateActionOption5.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmCurrencyOption
	 * CorporateActionOption13.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmCurrencyOption
	 * CorporateActionOption25.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmCurrencyOption
	 * CorporateActionOption30.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmCurrencyOption
	 * CorporateActionOption38.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmCurrencyOption
	 * CorporateActionOption47.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmCurrencyOption
	 * CorporateActionOption57.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmCurrencyOption
	 * CorporateActionOption58.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmCurrencyOption
	 * SecuritiesOption3.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmCurrencyOption
	 * CorporateActionOption4.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmCurrencyOption
	 * SecuritiesOption8.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmCurrencyOption
	 * CorporateActionOption14.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmCurrencyOption
	 * SecuritiesOption18.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmCurrencyOption
	 * CorporateActionOption23.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmCurrencyOption
	 * SecuritiesOption20.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmCurrencyOption
	 * CorporateActionOption31.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmCurrencyOption
	 * SecuritiesOption26.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmCurrencyOption
	 * CorporateActionOption37.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmCurrencyOption
	 * SecuritiesOption31.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmCurrencyOption
	 * CorporateActionOption46.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmCurrencyOption
	 * SecuritiesOption35.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmCurrencyOption
	 * CorporateActionOption53.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmCurrencyOption
	 * SecuritiesOption36.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmCurrencyOption
	 * CorporateActionOption54.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmCurrencyOption
	 * SecuritiesOption4.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmCurrencyOption
	 * CorporateActionOption10.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmCurrencyOption
	 * SecuritiesOption10.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmCurrencyOption
	 * CorporateActionOption15.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmCurrencyOption
	 * SecuritiesOption13.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmCurrencyOption
	 * CorporateActionOption20.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmCurrencyOption
	 * SecuritiesOption17.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmCurrencyOption
	 * CorporateActionOption32.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmCurrencyOption
	 * SecuritiesOption24.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmCurrencyOption
	 * CorporateActionOption35.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmCurrencyOption
	 * SecuritiesOption29.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmCurrencyOption
	 * CorporateActionOption44.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#mmCurrencyOption
	 * SecuritiesOption33.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmCurrencyOption
	 * SecuritiesOption38.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmCurrencyOption
	 * CorporateActionOption52.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#mmCurrencyOption
	 * SecuritiesOption37.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmCurrencyOption
	 * SecuritiesOption39.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmCurrencyOption
	 * CorporateActionOption55.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#mmCurrencyOption
	 * SecuritiesOption6.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmCurrencyOption
	 * CorporateActionOption3.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#mmCurrencyOption
	 * SecuritiesOption12.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmCurrencyOption
	 * CorporateActionOption17.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#mmCurrencyOption
	 * SecuritiesOption14.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCurrencyOption
	 * CorporateActionOption19.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#mmCurrencyOption
	 * SecuritiesOption22.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmCurrencyOption
	 * CorporateActionOption34.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#mmCurrencyOption
	 * SecuritiesOption25.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmCurrencyOption
	 * CorporateActionOption36.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmCurrencyOption
	 * SecuritiesOption30.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmCurrencyOption
	 * CorporateActionOption45.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmCurrencyOption
	 * CorporateActionOption51.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmCurrencyOption
	 * CorporateActionOption56.mmCurrencyOption}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmCurrency
	 * CashOption1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmCurrencyOption
	 * CorporateActionOption103.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmCurrencyOption
	 * CorporateActionOption100.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmCurrencyOption
	 * CorporateActionOption101.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmCurrencyOption
	 * CorporateActionOption102.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmCurrencyOption
	 * SecuritiesOption42.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmCurrencyOption
	 * SecuritiesOption40.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmCurrencyOption
	 * CorporateActionOption110.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmCurrencyOption
	 * CorporateActionOption108.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmCurrencyOption
	 * CorporateActionOption107.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmCurrencyOption
	 * CorporateActionOption106.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmCurrencyOption
	 * SecuritiesOption48.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmCurrencyOption
	 * SecuritiesOption45.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmCurrencyOption
	 * CorporateActionOption111.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmCurrencyOption
	 * CorporateActionOption113.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmCurrencyOption
	 * CorporateActionOption117.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmCurrencyOption
	 * CorporateActionOption118.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmCurrencyOption
	 * CorporateActionOption115.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmCurrencyOption
	 * CorporateActionOption114.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCurrencyOption
	 * SecuritiesOption49.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmCurrencyOption
	 * SecuritiesOption50.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmCurrencyOption
	 * CorporateActionOption124.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmCurrencyOption
	 * CorporateActionOption125.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmCurrencyOption
	 * CorporateActionOption123.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmCurrencyOption
	 * CorporateActionOption127.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmCurrencyOption
	 * SecuritiesOption55.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmCurrencyOption
	 * SecuritiesOption57.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmCurrencyOption
	 * CorporateActionOption132.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmCurrencyOption
	 * CorporateActionOption130.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmCurrencyOption
	 * CorporateActionOption131.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmCurrencyOption
	 * CorporateActionOption129.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCurrencyOption
	 * SecuritiesOption60.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCurrencyOption
	 * SecuritiesOption59.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmCurrencyOption
	 * CorporateActionOption134.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmCurrencyOption
	 * CorporateActionOption136.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmCurrencyOption
	 * CorporateActionOption135.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmCurrencyOption
	 * CorporateActionOption133.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmCurrencyOption
	 * SecuritiesOption61.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmCurrencyOption
	 * SecuritiesOption63.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmCurrencyOption
	 * CorporateActionOption140.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmCurrencyOption
	 * CorporateActionOption138.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmCurrencyOption
	 * CorporateActionOption142.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmCurrencyOption
	 * CorporateActionOption139.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmCurrencyOption
	 * SecuritiesOption64.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmCurrencyOption
	 * SecuritiesOption65.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmCurrencyOption
	 * CorporateActionOption146.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmCurrencyOption
	 * CorporateActionOption147.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmCurrencyOption
	 * SecuritiesOption67.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmCurrencyOption
	 * CorporateActionOption148.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68#mmCurrencyOption
	 * SecuritiesOption68.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmCurrencyOption
	 * CorporateActionOption150.mmCurrencyOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency choice given to the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, CurrencyCode> mmCurrencyOption = new MMBusinessAttribute<CorporateActionOption, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption5.mmCurrencyOption, CorporateActionOption13.mmCurrencyOption, CorporateActionOption25.mmCurrencyOption, CorporateActionOption30.mmCurrencyOption,
					CorporateActionOption38.mmCurrencyOption, CorporateActionOption47.mmCurrencyOption, CorporateActionOption57.mmCurrencyOption, CorporateActionOption58.mmCurrencyOption, SecuritiesOption3.mmCurrencyOption,
					CorporateActionOption4.mmCurrencyOption, SecuritiesOption8.mmCurrencyOption, CorporateActionOption14.mmCurrencyOption, SecuritiesOption18.mmCurrencyOption, CorporateActionOption23.mmCurrencyOption,
					SecuritiesOption20.mmCurrencyOption, CorporateActionOption31.mmCurrencyOption, SecuritiesOption26.mmCurrencyOption, CorporateActionOption37.mmCurrencyOption, SecuritiesOption31.mmCurrencyOption,
					CorporateActionOption46.mmCurrencyOption, SecuritiesOption35.mmCurrencyOption, CorporateActionOption53.mmCurrencyOption, SecuritiesOption36.mmCurrencyOption, CorporateActionOption54.mmCurrencyOption,
					SecuritiesOption4.mmCurrencyOption, CorporateActionOption10.mmCurrencyOption, SecuritiesOption10.mmCurrencyOption, CorporateActionOption15.mmCurrencyOption, SecuritiesOption13.mmCurrencyOption,
					CorporateActionOption20.mmCurrencyOption, SecuritiesOption17.mmCurrencyOption, CorporateActionOption32.mmCurrencyOption, SecuritiesOption24.mmCurrencyOption, CorporateActionOption35.mmCurrencyOption,
					SecuritiesOption29.mmCurrencyOption, CorporateActionOption44.mmCurrencyOption, SecuritiesOption33.mmCurrencyOption, SecuritiesOption38.mmCurrencyOption, CorporateActionOption52.mmCurrencyOption,
					SecuritiesOption37.mmCurrencyOption, SecuritiesOption39.mmCurrencyOption, CorporateActionOption55.mmCurrencyOption, SecuritiesOption6.mmCurrencyOption, CorporateActionOption3.mmCurrencyOption,
					SecuritiesOption12.mmCurrencyOption, CorporateActionOption17.mmCurrencyOption, SecuritiesOption14.mmCurrencyOption, CorporateActionOption19.mmCurrencyOption, SecuritiesOption22.mmCurrencyOption,
					CorporateActionOption34.mmCurrencyOption, SecuritiesOption25.mmCurrencyOption, CorporateActionOption36.mmCurrencyOption, SecuritiesOption30.mmCurrencyOption, CorporateActionOption45.mmCurrencyOption,
					CorporateActionOption51.mmCurrencyOption, CorporateActionOption56.mmCurrencyOption, CashOption1.mmCurrency, CorporateActionOption103.mmCurrencyOption, CorporateActionOption100.mmCurrencyOption,
					CorporateActionOption101.mmCurrencyOption, CorporateActionOption102.mmCurrencyOption, SecuritiesOption42.mmCurrencyOption, SecuritiesOption40.mmCurrencyOption, CorporateActionOption110.mmCurrencyOption,
					CorporateActionOption108.mmCurrencyOption, CorporateActionOption107.mmCurrencyOption, CorporateActionOption106.mmCurrencyOption, SecuritiesOption48.mmCurrencyOption, SecuritiesOption45.mmCurrencyOption,
					CorporateActionOption111.mmCurrencyOption, CorporateActionOption113.mmCurrencyOption, CorporateActionOption117.mmCurrencyOption, CorporateActionOption118.mmCurrencyOption, CorporateActionOption115.mmCurrencyOption,
					CorporateActionOption114.mmCurrencyOption, SecuritiesOption49.mmCurrencyOption, SecuritiesOption50.mmCurrencyOption, CorporateActionOption124.mmCurrencyOption, CorporateActionOption125.mmCurrencyOption,
					CorporateActionOption123.mmCurrencyOption, CorporateActionOption127.mmCurrencyOption, SecuritiesOption55.mmCurrencyOption, SecuritiesOption57.mmCurrencyOption, CorporateActionOption132.mmCurrencyOption,
					CorporateActionOption130.mmCurrencyOption, CorporateActionOption131.mmCurrencyOption, CorporateActionOption129.mmCurrencyOption, SecuritiesOption60.mmCurrencyOption, SecuritiesOption59.mmCurrencyOption,
					CorporateActionOption134.mmCurrencyOption, CorporateActionOption136.mmCurrencyOption, CorporateActionOption135.mmCurrencyOption, CorporateActionOption133.mmCurrencyOption, SecuritiesOption61.mmCurrencyOption,
					SecuritiesOption63.mmCurrencyOption, CorporateActionOption140.mmCurrencyOption, CorporateActionOption138.mmCurrencyOption, CorporateActionOption142.mmCurrencyOption, CorporateActionOption139.mmCurrencyOption,
					SecuritiesOption64.mmCurrencyOption, SecuritiesOption65.mmCurrencyOption, CorporateActionOption146.mmCurrencyOption, CorporateActionOption147.mmCurrencyOption, SecuritiesOption67.mmCurrencyOption,
					CorporateActionOption148.mmCurrencyOption, SecuritiesOption68.mmCurrencyOption, CorporateActionOption150.mmCurrencyOption);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CorporateActionOption obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(CorporateActionOption obj, CurrencyCode value) {
			obj.setCurrencyOption(value);
		}
	};
	protected ChoiceCorporateAction relatedChoiceCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction
	 * ChoiceCorporateAction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmRateAndAmountDetails
	 * CorporateActionOption5.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmRateAndAmountDetails
	 * CorporateActionOption13.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmRateAndAmountDetails
	 * CorporateActionOption25.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmRateAndAmountDetails
	 * CorporateActionOption30.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmRateAndAmountDetails
	 * CorporateActionOption38.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmRateAndAmountDetails
	 * CorporateActionOption47.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmRateAndAmountDetails
	 * CorporateActionOption57.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmRateAndAmountDetails
	 * CorporateActionOption58.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmAmountDetails
	 * CashOption2.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#mmDateDetails
	 * CashOption2.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmDateDetails
	 * CorporateActionOption4.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmPeriodDetails
	 * CorporateActionOption4.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmRateAndAmountDetails
	 * CorporateActionOption4.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmAmountDetails
	 * CashOption9.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#mmDateDetails
	 * CashOption9.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmDateDetails
	 * CorporateActionOption14.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmPeriodDetails
	 * CorporateActionOption14.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmRateAndAmountDetails
	 * CorporateActionOption14.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmAmountDetails
	 * CashOption12.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#mmDateDetails
	 * CashOption12.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmRateAndAmountDetails
	 * CashOption12.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmDateDetails
	 * CorporateActionOption23.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmPeriodDetails
	 * CorporateActionOption23.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmRateAndAmountDetails
	 * CorporateActionOption23.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmAmountDetails
	 * CashOption13.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#mmDateDetails
	 * CashOption13.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmRateAndAmountDetails
	 * CashOption13.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmDateDetails
	 * CorporateActionOption31.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmPeriodDetails
	 * CorporateActionOption31.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmRateAndAmountDetails
	 * CorporateActionOption31.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmAmountDetails
	 * CashOption18.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#mmDateDetails
	 * CashOption18.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmRateAndAmountDetails
	 * CashOption18.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmDateDetails
	 * CorporateActionOption37.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmPeriodDetails
	 * CorporateActionOption37.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmRateAndAmountDetails
	 * CorporateActionOption37.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmAmountDetails
	 * CashOption22.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#mmDateDetails
	 * CashOption22.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmRateAndAmountDetails
	 * CashOption22.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmDateDetails
	 * CorporateActionOption46.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmPeriodDetails
	 * CorporateActionOption46.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmRateAndAmountDetails
	 * CorporateActionOption46.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmAmountDetails
	 * CashOption26.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#mmDateDetails
	 * CashOption26.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmRateAndAmountDetails
	 * CashOption26.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmDateDetails
	 * CorporateActionOption53.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmPeriodDetails
	 * CorporateActionOption53.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmRateAndAmountDetails
	 * CorporateActionOption53.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmAmountDetails
	 * CashOption27.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#mmDateDetails
	 * CashOption27.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmRateAndAmountDetails
	 * CashOption27.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmDateDetails
	 * CorporateActionOption54.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmPeriodDetails
	 * CorporateActionOption54.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmRateAndAmountDetails
	 * CorporateActionOption54.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmAmountDetails
	 * CashOption3.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption3#mmDateDetails
	 * CashOption3.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmDateDetails
	 * CorporateActionOption10.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmPeriodDetails
	 * CorporateActionOption10.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmRateAndAmountDetails
	 * CorporateActionOption10.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmAmountDetails
	 * CashOption6.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption6#mmDateDetails
	 * CashOption6.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmDateDetails
	 * CorporateActionOption15.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmPeriodDetails
	 * CorporateActionOption15.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmRateAndAmountDetails
	 * CorporateActionOption15.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmAmountDetails
	 * CashOption11.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmDateDetails
	 * CashOption11.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#mmRateAndAmountDetails
	 * CashOption11.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmDateDetails
	 * CorporateActionOption20.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmPeriodDetails
	 * CorporateActionOption20.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmRateAndAmountDetails
	 * CorporateActionOption20.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmAmountDetails
	 * CashOption14.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#mmDateDetails
	 * CashOption14.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#mmRateAndAmountDetails
	 * CashOption14.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmDateDetails
	 * CorporateActionOption32.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmPeriodDetails
	 * CorporateActionOption32.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmRateAndAmountDetails
	 * CorporateActionOption32.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmAmountDetails
	 * CashOption16.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#mmDateDetails
	 * CashOption16.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#mmRateAndAmountDetails
	 * CashOption16.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmDateDetails
	 * CorporateActionOption35.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmPeriodDetails
	 * CorporateActionOption35.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmRateAndAmountDetails
	 * CorporateActionOption35.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmAmountDetails
	 * CashOption20.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#mmDateDetails
	 * CashOption20.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#mmRateAndAmountDetails
	 * CashOption20.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmDateDetails
	 * CorporateActionOption44.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmPeriodDetails
	 * CorporateActionOption44.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmRateAndAmountDetails
	 * CorporateActionOption44.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmAmountDetails
	 * CashOption25.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#mmDateDetails
	 * CashOption25.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#mmRateAndAmountDetails
	 * CashOption25.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmDateDetails
	 * CorporateActionOption52.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmPeriodDetails
	 * CorporateActionOption52.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmRateAndAmountDetails
	 * CorporateActionOption52.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmAmountDetails
	 * CashOption28.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#mmDateDetails
	 * CashOption28.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#mmRateAndAmountDetails
	 * CashOption28.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmDateDetails
	 * CorporateActionOption55.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmPeriodDetails
	 * CorporateActionOption55.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmRateAndAmountDetails
	 * CorporateActionOption55.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmAmountDetails
	 * CashOption4.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption4#mmDateDetails
	 * CashOption4.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmDateDetails
	 * CorporateActionOption3.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmPeriodDetails
	 * CorporateActionOption3.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmRateAndAmountDetails
	 * CorporateActionOption3.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmAmountDetails
	 * CashOption8.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption8#mmDateDetails
	 * CashOption8.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmDateDetails
	 * CorporateActionOption17.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmPeriodDetails
	 * CorporateActionOption17.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmRateAndAmountDetails
	 * CorporateActionOption17.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmAmountDetails
	 * CashOption10.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#mmDateDetails
	 * CashOption10.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#mmRateAndAmountDetails
	 * CashOption10.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmDateDetails
	 * CorporateActionOption19.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmPeriodDetails
	 * CorporateActionOption19.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmRateAndAmountDetails
	 * CorporateActionOption19.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmAmountDetails
	 * CashOption15.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#mmDateDetails
	 * CashOption15.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#mmRateAndAmountDetails
	 * CashOption15.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmDateDetails
	 * CorporateActionOption34.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmPeriodDetails
	 * CorporateActionOption34.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmRateAndAmountDetails
	 * CorporateActionOption34.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmAmountDetails
	 * CashOption17.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#mmDateDetails
	 * CashOption17.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#mmRateAndAmountDetails
	 * CashOption17.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmDateDetails
	 * CorporateActionOption36.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmPeriodDetails
	 * CorporateActionOption36.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmRateAndAmountDetails
	 * CorporateActionOption36.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmAmountDetails
	 * CashOption21.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#mmDateDetails
	 * CashOption21.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#mmRateAndAmountDetails
	 * CashOption21.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmDateDetails
	 * CorporateActionOption45.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmPeriodDetails
	 * CorporateActionOption45.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmRateAndAmountDetails
	 * CorporateActionOption45.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmAmountDetails
	 * CashOption24.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#mmDateDetails
	 * CashOption24.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#mmRateAndAmountDetails
	 * CashOption24.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmDateDetails
	 * CorporateActionOption51.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmPeriodDetails
	 * CorporateActionOption51.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmRateAndAmountDetails
	 * CorporateActionOption51.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmAmountDetails
	 * CashOption29.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#mmDateDetails
	 * CashOption29.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#mmRateAndAmountDetails
	 * CashOption29.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmDateDetails
	 * CorporateActionOption56.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmPeriodDetails
	 * CorporateActionOption56.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmRateAndAmountDetails
	 * CorporateActionOption56.mmRateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#mmDateDetails
	 * CashOption1.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption1#mmAmountDetails
	 * CashOption1.mmAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmDateDetails
	 * CorporateActionOption1.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRateAndAmountDetails
	 * CorporateActionOption1.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmPeriodDetails
	 * CorporateActionOption1.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmRateAndAmountDetails
	 * CorporateActionOption103.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmDateDetails
	 * CorporateActionOption100.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmPeriodDetails
	 * CorporateActionOption100.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmRateAndAmountDetails
	 * CorporateActionOption100.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmDateDetails
	 * CorporateActionOption101.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmPeriodDetails
	 * CorporateActionOption101.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmRateAndAmountDetails
	 * CorporateActionOption101.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmDateDetails
	 * CorporateActionOption102.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmPeriodDetails
	 * CorporateActionOption102.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmRateAndAmountDetails
	 * CorporateActionOption102.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmAmountDetails
	 * CashOption30.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#mmDateDetails
	 * CashOption30.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmRateAndAmountDetails
	 * CashOption30.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmAmountDetails
	 * CashOption31.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#mmDateDetails
	 * CashOption31.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#mmRateAndAmountDetails
	 * CashOption31.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmAmountDetails
	 * CashOption32.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#mmDateDetails
	 * CashOption32.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#mmRateAndAmountDetails
	 * CashOption32.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmDateDetails
	 * CorporateActionOption110.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmPeriodDetails
	 * CorporateActionOption110.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmRateAndAmountDetails
	 * CorporateActionOption110.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmDateDetails
	 * CorporateActionOption108.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmPeriodDetails
	 * CorporateActionOption108.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmRateAndAmountDetails
	 * CorporateActionOption108.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmRateAndAmountDetails
	 * CorporateActionOption107.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmDateDetails
	 * CorporateActionOption106.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmPeriodDetails
	 * CorporateActionOption106.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmRateAndAmountDetails
	 * CorporateActionOption106.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmAmountDetails
	 * CashOption36.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#mmDateDetails
	 * CashOption36.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#mmRateAndAmountDetails
	 * CashOption36.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmAmountDetails
	 * CashOption35.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#mmDateDetails
	 * CashOption35.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#mmRateAndAmountDetails
	 * CashOption35.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmAmountDetails
	 * CashOption38.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#mmDateDetails
	 * CashOption38.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmRateAndAmountDetails
	 * CashOption38.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmDateDetails
	 * CorporateActionOption111.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmPeriodDetails
	 * CorporateActionOption111.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmRateAndAmountDetails
	 * CorporateActionOption111.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmAmountDetails
	 * CashOption39.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#mmDateDetails
	 * CashOption39.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmRateAndAmountDetails
	 * CashOption39.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmDateDetails
	 * CorporateActionOption113.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmPeriodDetails
	 * CorporateActionOption113.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmRateAndAmountDetails
	 * CorporateActionOption113.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmAmountDetails
	 * CashOption41.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#mmDateDetails
	 * CashOption41.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmRateAndAmountDetails
	 * CashOption41.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmDateDetails
	 * CorporateActionOption117.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmPeriodDetails
	 * CorporateActionOption117.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmRateAndAmountDetails
	 * CorporateActionOption117.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmRateAndAmountDetails
	 * CorporateActionOption118.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmDateDetails
	 * CorporateActionOption115.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmPeriodDetails
	 * CorporateActionOption115.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmRateAndAmountDetails
	 * CorporateActionOption115.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmDateDetails
	 * CorporateActionOption114.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmPeriodDetails
	 * CorporateActionOption114.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmRateAndAmountDetails
	 * CorporateActionOption114.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmAmountDetails
	 * CashOption44.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#mmDateDetails
	 * CashOption44.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmRateAndAmountDetails
	 * CashOption44.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmAmountDetails
	 * CashOption42.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#mmDateDetails
	 * CashOption42.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#mmRateAndAmountDetails
	 * CashOption42.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmAmountDetails
	 * CashOption43.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#mmDateDetails
	 * CashOption43.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#mmRateAndAmountDetails
	 * CashOption43.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmDateDetails
	 * CorporateActionOption124.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmPeriodDetails
	 * CorporateActionOption124.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmRateAndAmountDetails
	 * CorporateActionOption124.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmDateDetails
	 * CorporateActionOption125.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmPeriodDetails
	 * CorporateActionOption125.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmRateAndAmountDetails
	 * CorporateActionOption125.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmRateAndAmountDetails
	 * CorporateActionOption123.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmDateDetails
	 * CorporateActionOption127.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmPeriodDetails
	 * CorporateActionOption127.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmRateAndAmountDetails
	 * CorporateActionOption127.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmAmountDetails
	 * CashOption46.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#mmDateDetails
	 * CashOption46.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmRateAndAmountDetails
	 * CashOption46.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmAmountDetails
	 * CashOption49.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#mmDateDetails
	 * CashOption49.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#mmRateAndAmountDetails
	 * CashOption49.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmAmountDetails
	 * CashOption47.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#mmDateDetails
	 * CashOption47.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#mmRateAndAmountDetails
	 * CashOption47.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmDateDetails
	 * CorporateActionOption132.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmPeriodDetails
	 * CorporateActionOption132.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmRateAndAmountDetails
	 * CorporateActionOption132.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmDateDetails
	 * CorporateActionOption130.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmPeriodDetails
	 * CorporateActionOption130.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmRateAndAmountDetails
	 * CorporateActionOption130.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmRateAndAmountDetails
	 * CorporateActionOption131.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmDateDetails
	 * CorporateActionOption129.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmPeriodDetails
	 * CorporateActionOption129.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmRateAndAmountDetails
	 * CorporateActionOption129.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmAmountDetails
	 * CashOption52.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmDateDetails
	 * CashOption52.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmRateAndAmountDetails
	 * CashOption52.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmAmountDetails
	 * CashOption51.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#mmDateDetails
	 * CashOption51.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmRateAndAmountDetails
	 * CashOption51.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmAmountDetails
	 * CashOption50.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#mmDateDetails
	 * CashOption50.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmRateAndAmountDetails
	 * CashOption50.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmRateAndAmountDetails
	 * CorporateActionOption134.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmDateDetails
	 * CorporateActionOption136.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmPeriodDetails
	 * CorporateActionOption136.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmRateAndAmountDetails
	 * CorporateActionOption136.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmDateDetails
	 * CorporateActionOption135.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmPeriodDetails
	 * CorporateActionOption135.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmRateAndAmountDetails
	 * CorporateActionOption135.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmDateDetails
	 * CorporateActionOption133.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmPeriodDetails
	 * CorporateActionOption133.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmRateAndAmountDetails
	 * CorporateActionOption133.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmAmountDetails
	 * CashOption53.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#mmDateDetails
	 * CashOption53.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#mmRateAndAmountDetails
	 * CashOption53.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmAmountDetails
	 * CashOption54.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#mmDateDetails
	 * CashOption54.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#mmRateAndAmountDetails
	 * CashOption54.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmAmountDetails
	 * CashOption55.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#mmDateDetails
	 * CashOption55.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmRateAndAmountDetails
	 * CashOption55.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmDateDetails
	 * CorporateActionOption140.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmPeriodDetails
	 * CorporateActionOption140.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmRateAndAmountDetails
	 * CorporateActionOption140.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmDateDetails
	 * CorporateActionOption138.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmPeriodDetails
	 * CorporateActionOption138.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmRateAndAmountDetails
	 * CorporateActionOption138.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmRateAndAmountDetails
	 * CorporateActionOption142.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmDateDetails
	 * CorporateActionOption139.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmPeriodDetails
	 * CorporateActionOption139.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmRateAndAmountDetails
	 * CorporateActionOption139.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmAmountDetails
	 * CashOption56.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption56#mmDateDetails
	 * CashOption56.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption56#mmRateAndAmountDetails
	 * CashOption56.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmAmountDetails
	 * CashOption57.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption57#mmDateDetails
	 * CashOption57.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption57#mmRateAndAmountDetails
	 * CashOption57.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmAmountDetails
	 * CashOption58.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmDateDetails
	 * CashOption58.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmRateAndAmountDetails
	 * CashOption58.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmRateAndAmountDetails
	 * CorporateActionOption146.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmDateDetails
	 * CorporateActionOption147.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmPeriodDetails
	 * CorporateActionOption147.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmRateAndAmountDetails
	 * CorporateActionOption147.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmAmountDetails
	 * CashOption60.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption60#mmDateDetails
	 * CashOption60.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmRateAndAmountDetails
	 * CashOption60.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmDateDetails
	 * CorporateActionOption148.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmPeriodDetails
	 * CorporateActionOption148.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmRateAndAmountDetails
	 * CorporateActionOption148.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption61#mmAmountDetails
	 * CashOption61.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption61#mmDateDetails
	 * CashOption61.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption61#mmRateAndAmountDetails
	 * CashOption61.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmDateDetails
	 * CorporateActionOption150.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmPeriodDetails
	 * CorporateActionOption150.mmPeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmRateAndAmountDetails
	 * CorporateActionOption150.mmRateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption63#mmAmountDetails
	 * CashOption63.mmAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmDateDetails
	 * CashOption63.mmDateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption63#mmRateAndAmountDetails
	 * CashOption63.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedChoiceCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which one or more options are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, Optional<ChoiceCorporateAction>> mmRelatedChoiceCorporateAction = new MMBusinessAssociationEnd<CorporateActionOption, Optional<ChoiceCorporateAction>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption5.mmRateAndAmountDetails, CorporateActionOption13.mmRateAndAmountDetails, CorporateActionOption25.mmRateAndAmountDetails,
					CorporateActionOption30.mmRateAndAmountDetails, CorporateActionOption38.mmRateAndAmountDetails, CorporateActionOption47.mmRateAndAmountDetails, CorporateActionOption57.mmRateAndAmountDetails,
					CorporateActionOption58.mmRateAndAmountDetails, CashOption2.mmAmountDetails, CashOption2.mmDateDetails, CorporateActionOption4.mmDateDetails, CorporateActionOption4.mmPeriodDetails,
					CorporateActionOption4.mmRateAndAmountDetails, CashOption9.mmAmountDetails, CashOption9.mmDateDetails, CorporateActionOption14.mmDateDetails, CorporateActionOption14.mmPeriodDetails,
					CorporateActionOption14.mmRateAndAmountDetails, CashOption12.mmAmountDetails, CashOption12.mmDateDetails, CashOption12.mmRateAndAmountDetails, CorporateActionOption23.mmDateDetails,
					CorporateActionOption23.mmPeriodDetails, CorporateActionOption23.mmRateAndAmountDetails, CashOption13.mmAmountDetails, CashOption13.mmDateDetails, CashOption13.mmRateAndAmountDetails,
					CorporateActionOption31.mmDateDetails, CorporateActionOption31.mmPeriodDetails, CorporateActionOption31.mmRateAndAmountDetails, CashOption18.mmAmountDetails, CashOption18.mmDateDetails,
					CashOption18.mmRateAndAmountDetails, CorporateActionOption37.mmDateDetails, CorporateActionOption37.mmPeriodDetails, CorporateActionOption37.mmRateAndAmountDetails, CashOption22.mmAmountDetails,
					CashOption22.mmDateDetails, CashOption22.mmRateAndAmountDetails, CorporateActionOption46.mmDateDetails, CorporateActionOption46.mmPeriodDetails, CorporateActionOption46.mmRateAndAmountDetails,
					CashOption26.mmAmountDetails, CashOption26.mmDateDetails, CashOption26.mmRateAndAmountDetails, CorporateActionOption53.mmDateDetails, CorporateActionOption53.mmPeriodDetails,
					CorporateActionOption53.mmRateAndAmountDetails, CashOption27.mmAmountDetails, CashOption27.mmDateDetails, CashOption27.mmRateAndAmountDetails, CorporateActionOption54.mmDateDetails,
					CorporateActionOption54.mmPeriodDetails, CorporateActionOption54.mmRateAndAmountDetails, CashOption3.mmAmountDetails, CashOption3.mmDateDetails, CorporateActionOption10.mmDateDetails,
					CorporateActionOption10.mmPeriodDetails, CorporateActionOption10.mmRateAndAmountDetails, CashOption6.mmAmountDetails, CashOption6.mmDateDetails, CorporateActionOption15.mmDateDetails,
					CorporateActionOption15.mmPeriodDetails, CorporateActionOption15.mmRateAndAmountDetails, CashOption11.mmAmountDetails, CashOption11.mmDateDetails, CashOption11.mmRateAndAmountDetails,
					CorporateActionOption20.mmDateDetails, CorporateActionOption20.mmPeriodDetails, CorporateActionOption20.mmRateAndAmountDetails, CashOption14.mmAmountDetails, CashOption14.mmDateDetails,
					CashOption14.mmRateAndAmountDetails, CorporateActionOption32.mmDateDetails, CorporateActionOption32.mmPeriodDetails, CorporateActionOption32.mmRateAndAmountDetails, CashOption16.mmAmountDetails,
					CashOption16.mmDateDetails, CashOption16.mmRateAndAmountDetails, CorporateActionOption35.mmDateDetails, CorporateActionOption35.mmPeriodDetails, CorporateActionOption35.mmRateAndAmountDetails,
					CashOption20.mmAmountDetails, CashOption20.mmDateDetails, CashOption20.mmRateAndAmountDetails, CorporateActionOption44.mmDateDetails, CorporateActionOption44.mmPeriodDetails,
					CorporateActionOption44.mmRateAndAmountDetails, CashOption25.mmAmountDetails, CashOption25.mmDateDetails, CashOption25.mmRateAndAmountDetails, CorporateActionOption52.mmDateDetails,
					CorporateActionOption52.mmPeriodDetails, CorporateActionOption52.mmRateAndAmountDetails, CashOption28.mmAmountDetails, CashOption28.mmDateDetails, CashOption28.mmRateAndAmountDetails,
					CorporateActionOption55.mmDateDetails, CorporateActionOption55.mmPeriodDetails, CorporateActionOption55.mmRateAndAmountDetails, CashOption4.mmAmountDetails, CashOption4.mmDateDetails,
					CorporateActionOption3.mmDateDetails, CorporateActionOption3.mmPeriodDetails, CorporateActionOption3.mmRateAndAmountDetails, CashOption8.mmAmountDetails, CashOption8.mmDateDetails, CorporateActionOption17.mmDateDetails,
					CorporateActionOption17.mmPeriodDetails, CorporateActionOption17.mmRateAndAmountDetails, CashOption10.mmAmountDetails, CashOption10.mmDateDetails, CashOption10.mmRateAndAmountDetails,
					CorporateActionOption19.mmDateDetails, CorporateActionOption19.mmPeriodDetails, CorporateActionOption19.mmRateAndAmountDetails, CashOption15.mmAmountDetails, CashOption15.mmDateDetails,
					CashOption15.mmRateAndAmountDetails, CorporateActionOption34.mmDateDetails, CorporateActionOption34.mmPeriodDetails, CorporateActionOption34.mmRateAndAmountDetails, CashOption17.mmAmountDetails,
					CashOption17.mmDateDetails, CashOption17.mmRateAndAmountDetails, CorporateActionOption36.mmDateDetails, CorporateActionOption36.mmPeriodDetails, CorporateActionOption36.mmRateAndAmountDetails,
					CashOption21.mmAmountDetails, CashOption21.mmDateDetails, CashOption21.mmRateAndAmountDetails, CorporateActionOption45.mmDateDetails, CorporateActionOption45.mmPeriodDetails,
					CorporateActionOption45.mmRateAndAmountDetails, CashOption24.mmAmountDetails, CashOption24.mmDateDetails, CashOption24.mmRateAndAmountDetails, CorporateActionOption51.mmDateDetails,
					CorporateActionOption51.mmPeriodDetails, CorporateActionOption51.mmRateAndAmountDetails, CashOption29.mmAmountDetails, CashOption29.mmDateDetails, CashOption29.mmRateAndAmountDetails,
					CorporateActionOption56.mmDateDetails, CorporateActionOption56.mmPeriodDetails, CorporateActionOption56.mmRateAndAmountDetails, CashOption1.mmDateDetails, CashOption1.mmAmountDetails,
					CorporateActionOption1.mmDateDetails, CorporateActionOption1.mmRateAndAmountDetails, CorporateActionOption1.mmPeriodDetails, CorporateActionOption103.mmRateAndAmountDetails, CorporateActionOption100.mmDateDetails,
					CorporateActionOption100.mmPeriodDetails, CorporateActionOption100.mmRateAndAmountDetails, CorporateActionOption101.mmDateDetails, CorporateActionOption101.mmPeriodDetails,
					CorporateActionOption101.mmRateAndAmountDetails, CorporateActionOption102.mmDateDetails, CorporateActionOption102.mmPeriodDetails, CorporateActionOption102.mmRateAndAmountDetails, CashOption30.mmAmountDetails,
					CashOption30.mmDateDetails, CashOption30.mmRateAndAmountDetails, CashOption31.mmAmountDetails, CashOption31.mmDateDetails, CashOption31.mmRateAndAmountDetails, CashOption32.mmAmountDetails, CashOption32.mmDateDetails,
					CashOption32.mmRateAndAmountDetails, CorporateActionOption110.mmDateDetails, CorporateActionOption110.mmPeriodDetails, CorporateActionOption110.mmRateAndAmountDetails, CorporateActionOption108.mmDateDetails,
					CorporateActionOption108.mmPeriodDetails, CorporateActionOption108.mmRateAndAmountDetails, CorporateActionOption107.mmRateAndAmountDetails, CorporateActionOption106.mmDateDetails,
					CorporateActionOption106.mmPeriodDetails, CorporateActionOption106.mmRateAndAmountDetails, CashOption36.mmAmountDetails, CashOption36.mmDateDetails, CashOption36.mmRateAndAmountDetails, CashOption35.mmAmountDetails,
					CashOption35.mmDateDetails, CashOption35.mmRateAndAmountDetails, CashOption38.mmAmountDetails, CashOption38.mmDateDetails, CashOption38.mmRateAndAmountDetails, CorporateActionOption111.mmDateDetails,
					CorporateActionOption111.mmPeriodDetails, CorporateActionOption111.mmRateAndAmountDetails, CashOption39.mmAmountDetails, CashOption39.mmDateDetails, CashOption39.mmRateAndAmountDetails,
					CorporateActionOption113.mmDateDetails, CorporateActionOption113.mmPeriodDetails, CorporateActionOption113.mmRateAndAmountDetails, CashOption41.mmAmountDetails, CashOption41.mmDateDetails,
					CashOption41.mmRateAndAmountDetails, CorporateActionOption117.mmDateDetails, CorporateActionOption117.mmPeriodDetails, CorporateActionOption117.mmRateAndAmountDetails, CorporateActionOption118.mmRateAndAmountDetails,
					CorporateActionOption115.mmDateDetails, CorporateActionOption115.mmPeriodDetails, CorporateActionOption115.mmRateAndAmountDetails, CorporateActionOption114.mmDateDetails, CorporateActionOption114.mmPeriodDetails,
					CorporateActionOption114.mmRateAndAmountDetails, CashOption44.mmAmountDetails, CashOption44.mmDateDetails, CashOption44.mmRateAndAmountDetails, CashOption42.mmAmountDetails, CashOption42.mmDateDetails,
					CashOption42.mmRateAndAmountDetails, CashOption43.mmAmountDetails, CashOption43.mmDateDetails, CashOption43.mmRateAndAmountDetails, CorporateActionOption124.mmDateDetails, CorporateActionOption124.mmPeriodDetails,
					CorporateActionOption124.mmRateAndAmountDetails, CorporateActionOption125.mmDateDetails, CorporateActionOption125.mmPeriodDetails, CorporateActionOption125.mmRateAndAmountDetails,
					CorporateActionOption123.mmRateAndAmountDetails, CorporateActionOption127.mmDateDetails, CorporateActionOption127.mmPeriodDetails, CorporateActionOption127.mmRateAndAmountDetails, CashOption46.mmAmountDetails,
					CashOption46.mmDateDetails, CashOption46.mmRateAndAmountDetails, CashOption49.mmAmountDetails, CashOption49.mmDateDetails, CashOption49.mmRateAndAmountDetails, CashOption47.mmAmountDetails, CashOption47.mmDateDetails,
					CashOption47.mmRateAndAmountDetails, CorporateActionOption132.mmDateDetails, CorporateActionOption132.mmPeriodDetails, CorporateActionOption132.mmRateAndAmountDetails, CorporateActionOption130.mmDateDetails,
					CorporateActionOption130.mmPeriodDetails, CorporateActionOption130.mmRateAndAmountDetails, CorporateActionOption131.mmRateAndAmountDetails, CorporateActionOption129.mmDateDetails,
					CorporateActionOption129.mmPeriodDetails, CorporateActionOption129.mmRateAndAmountDetails, CashOption52.mmAmountDetails, CashOption52.mmDateDetails, CashOption52.mmRateAndAmountDetails, CashOption51.mmAmountDetails,
					CashOption51.mmDateDetails, CashOption51.mmRateAndAmountDetails, CashOption50.mmAmountDetails, CashOption50.mmDateDetails, CashOption50.mmRateAndAmountDetails, CorporateActionOption134.mmRateAndAmountDetails,
					CorporateActionOption136.mmDateDetails, CorporateActionOption136.mmPeriodDetails, CorporateActionOption136.mmRateAndAmountDetails, CorporateActionOption135.mmDateDetails, CorporateActionOption135.mmPeriodDetails,
					CorporateActionOption135.mmRateAndAmountDetails, CorporateActionOption133.mmDateDetails, CorporateActionOption133.mmPeriodDetails, CorporateActionOption133.mmRateAndAmountDetails, CashOption53.mmAmountDetails,
					CashOption53.mmDateDetails, CashOption53.mmRateAndAmountDetails, CashOption54.mmAmountDetails, CashOption54.mmDateDetails, CashOption54.mmRateAndAmountDetails, CashOption55.mmAmountDetails, CashOption55.mmDateDetails,
					CashOption55.mmRateAndAmountDetails, CorporateActionOption140.mmDateDetails, CorporateActionOption140.mmPeriodDetails, CorporateActionOption140.mmRateAndAmountDetails, CorporateActionOption138.mmDateDetails,
					CorporateActionOption138.mmPeriodDetails, CorporateActionOption138.mmRateAndAmountDetails, CorporateActionOption142.mmRateAndAmountDetails, CorporateActionOption139.mmDateDetails,
					CorporateActionOption139.mmPeriodDetails, CorporateActionOption139.mmRateAndAmountDetails, CashOption56.mmAmountDetails, CashOption56.mmDateDetails, CashOption56.mmRateAndAmountDetails, CashOption57.mmAmountDetails,
					CashOption57.mmDateDetails, CashOption57.mmRateAndAmountDetails, CashOption58.mmAmountDetails, CashOption58.mmDateDetails, CashOption58.mmRateAndAmountDetails, CorporateActionOption146.mmRateAndAmountDetails,
					CorporateActionOption147.mmDateDetails, CorporateActionOption147.mmPeriodDetails, CorporateActionOption147.mmRateAndAmountDetails, CashOption60.mmAmountDetails, CashOption60.mmDateDetails,
					CashOption60.mmRateAndAmountDetails, CorporateActionOption148.mmDateDetails, CorporateActionOption148.mmPeriodDetails, CorporateActionOption148.mmRateAndAmountDetails, CashOption61.mmAmountDetails,
					CashOption61.mmDateDetails, CashOption61.mmRateAndAmountDetails, CorporateActionOption150.mmDateDetails, CorporateActionOption150.mmPeriodDetails, CorporateActionOption150.mmRateAndAmountDetails,
					CashOption63.mmAmountDetails, CashOption63.mmDateDetails, CashOption63.mmRateAndAmountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ChoiceCorporateAction.mmObject();
		}

		@Override
		public Optional<ChoiceCorporateAction> getValue(CorporateActionOption obj) {
			return obj.getRelatedChoiceCorporateAction();
		}

		@Override
		public void setValue(CorporateActionOption obj, Optional<ChoiceCorporateAction> value) {
			obj.setRelatedChoiceCorporateAction(value.orElse(null));
		}
	};
	protected CorporateActionElection corporateActionElection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
	 * CorporateActionElection.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which selected a specific option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, CorporateActionElection> mmCorporateActionElection = new MMBusinessAssociationEnd<CorporateActionOption, CorporateActionElection>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionElection.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionElection.mmObject();
		}

		@Override
		public CorporateActionElection getValue(CorporateActionOption obj) {
			return obj.getCorporateActionElection();
		}

		@Override
		public void setValue(CorporateActionOption obj, CorporateActionElection value) {
			obj.setCorporateActionElection(value);
		}
	};
	protected OptionFeaturesCode optionFeatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice#mmCode
	 * OptionFeaturesFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice#mmProprietary
	 * OptionFeaturesFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmOptionFeatures
	 * CorporateActionOption4.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice#mmCode
	 * OptionFeaturesFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice#mmProprietary
	 * OptionFeaturesFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmOptionFeatures
	 * CorporateActionOption14.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmOptionFeatures
	 * CorporateActionOption23.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmOptionFeatures
	 * CorporateActionOption31.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmOptionFeatures
	 * CorporateActionOption37.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmOptionFeatures
	 * CorporateActionOption46.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmOptionFeatures
	 * CorporateActionOption53.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmOptionFeatures
	 * CorporateActionOption54.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat2Choice#mmCode
	 * OptionFeaturesFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat2Choice#mmProprietary
	 * OptionFeaturesFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmOptionFeatures
	 * CorporateActionOption10.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat4Choice#mmCode
	 * OptionFeaturesFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat4Choice#mmProprietary
	 * OptionFeaturesFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmOptionFeatures
	 * CorporateActionOption15.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat6Choice#mmCode
	 * OptionFeaturesFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat6Choice#mmProprietary
	 * OptionFeaturesFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmOptionFeatures
	 * CorporateActionOption20.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat7Choice#mmCode
	 * OptionFeaturesFormat7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat7Choice#mmProprietary
	 * OptionFeaturesFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmOptionFeatures
	 * CorporateActionOption32.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice#mmCode
	 * OptionFeaturesFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice#mmProprietary
	 * OptionFeaturesFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat9Choice#mmCode
	 * OptionFeaturesFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat9Choice#mmProprietary
	 * OptionFeaturesFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmOptionFeatures
	 * CorporateActionOption35.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice#mmCode
	 * OptionFeaturesFormat11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice#mmProprietary
	 * OptionFeaturesFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmOptionFeatures
	 * CorporateActionOption44.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmOptionFeatures
	 * CorporateActionOption52.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmOptionFeatures
	 * CorporateActionOption55.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmOptionFeatures
	 * CorporateActionOption3.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmOptionFeatures
	 * CorporateActionOption17.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionFeatures
	 * CorporateActionOption19.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat8Choice#mmCode
	 * OptionFeaturesFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat8Choice#mmProprietary
	 * OptionFeaturesFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmOptionFeatures
	 * CorporateActionOption34.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmOptionFeatures
	 * CorporateActionOption36.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmOptionFeatures
	 * CorporateActionOption45.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmOptionFeatures
	 * CorporateActionOption51.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmOptionFeatures
	 * CorporateActionOption56.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#mmCode
	 * OptionFeatures1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#mmProprietary
	 * OptionFeatures1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOptionFeatures
	 * CorporateActionOption1.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmOptionFeatures
	 * CorporateActionOption100.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmOptionFeatures
	 * CorporateActionOption101.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmOptionFeatures
	 * CorporateActionOption102.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat12Choice#mmCode
	 * OptionFeaturesFormat12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat12Choice#mmProprietary
	 * OptionFeaturesFormat12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmOptionFeatures
	 * CorporateActionOption110.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOptionFeatures
	 * CorporateActionOption108.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmOptionFeatures
	 * CorporateActionOption106.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat15Choice#mmCode
	 * OptionFeaturesFormat15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat15Choice#mmProprietary
	 * OptionFeaturesFormat15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmOptionFeatures
	 * CorporateActionOption111.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmOptionFeatures
	 * CorporateActionOption113.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmOptionFeatures
	 * CorporateActionOption117.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmOptionFeatures
	 * CorporateActionOption115.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOptionFeatures
	 * CorporateActionOption114.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat17Choice#mmCode
	 * OptionFeaturesFormat17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat17Choice#mmProprietary
	 * OptionFeaturesFormat17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#mmCode
	 * OptionFeaturesFormat18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#mmProprietary
	 * OptionFeaturesFormat18Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat16Choice#mmCode
	 * OptionFeaturesFormat16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat16Choice#mmProprietary
	 * OptionFeaturesFormat16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmOptionFeatures
	 * CorporateActionOption124.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmOptionFeatures
	 * CorporateActionOption125.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmOptionFeatures
	 * CorporateActionOption127.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat19Choice#mmCode
	 * OptionFeaturesFormat19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat19Choice#mmProprietary
	 * OptionFeaturesFormat19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat21Choice#mmCode
	 * OptionFeaturesFormat21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat21Choice#mmProprietary
	 * OptionFeaturesFormat21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat20Choice#mmCode
	 * OptionFeaturesFormat20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat20Choice#mmProprietary
	 * OptionFeaturesFormat20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmOptionFeatures
	 * CorporateActionOption132.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOptionFeatures
	 * CorporateActionOption130.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOptionFeatures
	 * CorporateActionOption129.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmCode
	 * OptionFeaturesFormat22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#mmProprietary
	 * OptionFeaturesFormat22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmOptionFeatures
	 * CorporateActionOption136.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmOptionFeatures
	 * CorporateActionOption135.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmOptionFeatures
	 * CorporateActionOption133.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat23Choice#mmCode
	 * OptionFeaturesFormat23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat23Choice#mmProprietary
	 * OptionFeaturesFormat23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption140#mmOptionFeatures
	 * CorporateActionOption140.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOptionFeatures
	 * CorporateActionOption138.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOptionFeatures
	 * CorporateActionOption139.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption147#mmOptionFeatures
	 * CorporateActionOption147.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmOptionFeatures
	 * CorporateActionOption148.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmOptionFeatures
	 * CorporateActionOption150.mmOptionFeatures}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Features that may apply to a corporate action option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, OptionFeaturesCode> mmOptionFeatures = new MMBusinessAttribute<CorporateActionOption, OptionFeaturesCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OptionFeaturesFormat1Choice.mmCode, OptionFeaturesFormat1Choice.mmProprietary, CorporateActionOption4.mmOptionFeatures, OptionFeaturesFormat3Choice.mmCode,
					OptionFeaturesFormat3Choice.mmProprietary, CorporateActionOption14.mmOptionFeatures, CorporateActionOption23.mmOptionFeatures, CorporateActionOption31.mmOptionFeatures, CorporateActionOption37.mmOptionFeatures,
					CorporateActionOption46.mmOptionFeatures, CorporateActionOption53.mmOptionFeatures, CorporateActionOption54.mmOptionFeatures, OptionFeaturesFormat2Choice.mmCode, OptionFeaturesFormat2Choice.mmProprietary,
					CorporateActionOption10.mmOptionFeatures, OptionFeaturesFormat4Choice.mmCode, OptionFeaturesFormat4Choice.mmProprietary, CorporateActionOption15.mmOptionFeatures, OptionFeaturesFormat6Choice.mmCode,
					OptionFeaturesFormat6Choice.mmProprietary, CorporateActionOption20.mmOptionFeatures, OptionFeaturesFormat7Choice.mmCode, OptionFeaturesFormat7Choice.mmProprietary, CorporateActionOption32.mmOptionFeatures,
					OptionFeaturesFormat5Choice.mmCode, OptionFeaturesFormat5Choice.mmProprietary, OptionFeaturesFormat9Choice.mmCode, OptionFeaturesFormat9Choice.mmProprietary, CorporateActionOption35.mmOptionFeatures,
					OptionFeaturesFormat11Choice.mmCode, OptionFeaturesFormat11Choice.mmProprietary, CorporateActionOption44.mmOptionFeatures, CorporateActionOption52.mmOptionFeatures, CorporateActionOption55.mmOptionFeatures,
					CorporateActionOption3.mmOptionFeatures, CorporateActionOption17.mmOptionFeatures, CorporateActionOption19.mmOptionFeatures, OptionFeaturesFormat8Choice.mmCode, OptionFeaturesFormat8Choice.mmProprietary,
					CorporateActionOption34.mmOptionFeatures, CorporateActionOption36.mmOptionFeatures, CorporateActionOption45.mmOptionFeatures, CorporateActionOption51.mmOptionFeatures, CorporateActionOption56.mmOptionFeatures,
					OptionFeatures1FormatChoice.mmCode, OptionFeatures1FormatChoice.mmProprietary, CorporateActionOption1.mmOptionFeatures, CorporateActionOption100.mmOptionFeatures, CorporateActionOption101.mmOptionFeatures,
					CorporateActionOption102.mmOptionFeatures, OptionFeaturesFormat12Choice.mmCode, OptionFeaturesFormat12Choice.mmProprietary, CorporateActionOption110.mmOptionFeatures, CorporateActionOption108.mmOptionFeatures,
					CorporateActionOption106.mmOptionFeatures, OptionFeaturesFormat15Choice.mmCode, OptionFeaturesFormat15Choice.mmProprietary, CorporateActionOption111.mmOptionFeatures, CorporateActionOption113.mmOptionFeatures,
					CorporateActionOption117.mmOptionFeatures, CorporateActionOption115.mmOptionFeatures, CorporateActionOption114.mmOptionFeatures, OptionFeaturesFormat17Choice.mmCode, OptionFeaturesFormat17Choice.mmProprietary,
					OptionFeaturesFormat18Choice.mmCode, OptionFeaturesFormat18Choice.mmProprietary, OptionFeaturesFormat16Choice.mmCode, OptionFeaturesFormat16Choice.mmProprietary, CorporateActionOption124.mmOptionFeatures,
					CorporateActionOption125.mmOptionFeatures, CorporateActionOption127.mmOptionFeatures, OptionFeaturesFormat19Choice.mmCode, OptionFeaturesFormat19Choice.mmProprietary, OptionFeaturesFormat21Choice.mmCode,
					OptionFeaturesFormat21Choice.mmProprietary, OptionFeaturesFormat20Choice.mmCode, OptionFeaturesFormat20Choice.mmProprietary, CorporateActionOption132.mmOptionFeatures, CorporateActionOption130.mmOptionFeatures,
					CorporateActionOption129.mmOptionFeatures, OptionFeaturesFormat22Choice.mmCode, OptionFeaturesFormat22Choice.mmProprietary, CorporateActionOption136.mmOptionFeatures, CorporateActionOption135.mmOptionFeatures,
					CorporateActionOption133.mmOptionFeatures, OptionFeaturesFormat23Choice.mmCode, OptionFeaturesFormat23Choice.mmProprietary, CorporateActionOption140.mmOptionFeatures, CorporateActionOption138.mmOptionFeatures,
					CorporateActionOption139.mmOptionFeatures, CorporateActionOption147.mmOptionFeatures, CorporateActionOption148.mmOptionFeatures, CorporateActionOption150.mmOptionFeatures);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}

		@Override
		public OptionFeaturesCode getValue(CorporateActionOption obj) {
			return obj.getOptionFeatures();
		}

		@Override
		public void setValue(CorporateActionOption obj, OptionFeaturesCode value) {
			obj.setOptionFeatures(value);
		}
	};
	protected DateTimePeriod actionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
	 * DateTimePeriod.mmCorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#mmActionPeriod
	 * CorporateActionPeriod4.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmActionPeriod
	 * CorporateActionPeriod9.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmActionPeriod
	 * CorporateActionPeriod5.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmActionPeriod
	 * CorporateActionPeriod7.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmActionPeriod
	 * CorporateActionPeriod1.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmActionPeriod
	 * CorporateActionPeriod2.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmActionPeriod
	 * CorporateActionPeriod11.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmActionPeriod
	 * CorporateActionPeriod12.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod13#mmActionPeriod
	 * CorporateActionPeriod13.mmActionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option remains valid, eg, offer period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, DateTimePeriod> mmActionPeriod = new MMBusinessAssociationEnd<CorporateActionOption, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod4.mmActionPeriod, CorporateActionPeriod9.mmActionPeriod, CorporateActionPeriod5.mmActionPeriod, CorporateActionPeriod7.mmActionPeriod,
					CorporateActionPeriod1.mmActionPeriod, CorporateActionPeriod2.mmActionPeriod, CorporateActionPeriod11.mmActionPeriod, CorporateActionPeriod12.mmActionPeriod, CorporateActionPeriod13.mmActionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmCorporateActionOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(CorporateActionOption obj) {
			return obj.getActionPeriod();
		}

		@Override
		public void setValue(CorporateActionOption obj, DateTimePeriod value) {
			obj.setActionPeriod(value);
		}
	};
	protected OfferTypeV2Code offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
	 * OfferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice#mmCode
	 * OfferTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice#mmProprietary
	 * OfferTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmOfferType
	 * CorporateActionOption10.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat2Choice#mmCode
	 * OfferTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat2Choice#mmProprietary
	 * OfferTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmOfferType
	 * CorporateActionOption15.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmOfferType
	 * CorporateActionOption20.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmOfferType
	 * CorporateActionOption32.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmOfferType
	 * CorporateActionOption35.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmOfferType
	 * CorporateActionOption44.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice#mmCode
	 * OfferTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice#mmProprietary
	 * OfferTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmOfferType
	 * CorporateActionOption52.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat4Choice#mmCode
	 * OfferTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat4Choice#mmProprietary
	 * OfferTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmOfferType
	 * CorporateActionOption55.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmOfferType
	 * CorporateAction3.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmOfferType
	 * CorporateActionOption3.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmOfferType
	 * CorporateAction4.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmOfferType
	 * CorporateActionOption17.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmOfferType
	 * CorporateAction5.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOfferType
	 * CorporateActionOption19.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmOfferType
	 * CorporateAction6.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmOfferType
	 * CorporateActionOption34.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmOfferType
	 * CorporateAction7.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmOfferType
	 * CorporateActionOption36.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmOfferType
	 * CorporateAction8.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmOfferType
	 * CorporateActionOption45.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmOfferType
	 * CorporateAction10.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmOfferType
	 * CorporateActionOption51.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmOfferType
	 * CorporateAction11.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmOfferType
	 * CorporateActionOption56.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#mmCode
	 * OfferType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#mmProprietary
	 * OfferType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmOfferType
	 * CorporateAction2.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmOfferType
	 * CorporateActionOption1.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmOfferType
	 * CorporateActionOption100.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmOfferType
	 * CorporateActionOption101.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmOfferType
	 * CorporateAction12.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat5Choice#mmCode
	 * OfferTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat5Choice#mmProprietary
	 * OfferTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmOfferType
	 * CorporateActionOption108.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmOfferType
	 * CorporateActionOption106.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmOfferType
	 * CorporateAction17.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice#mmCode
	 * OfferTypeFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice#mmProprietary
	 * OfferTypeFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmOfferType
	 * CorporateActionOption115.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmOfferType
	 * CorporateActionOption114.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmOfferType
	 * CorporateAction31.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmCode
	 * OfferTypeFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#mmProprietary
	 * OfferTypeFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmOfferType
	 * CorporateActionOption125.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmOfferType
	 * CorporateActionOption127.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmOfferType
	 * CorporateAction40.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice#mmCode
	 * OfferTypeFormat11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice#mmProprietary
	 * OfferTypeFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmOfferType
	 * CorporateActionOption130.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmOfferType
	 * CorporateActionOption129.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmOfferType
	 * CorporateActionOption135.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmOfferType
	 * CorporateActionOption133.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmOfferType
	 * CorporateAction41.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmOfferType
	 * CorporateActionOption138.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmOfferType
	 * CorporateActionOption139.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmOfferType
	 * CorporateActionOption148.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmOfferType
	 * CorporateAction51.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmOfferType
	 * CorporateActionOption150.mmOfferType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, OfferTypeV2Code> mmOfferType = new MMBusinessAttribute<CorporateActionOption, OfferTypeV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(OfferTypeFormat1Choice.mmCode, OfferTypeFormat1Choice.mmProprietary, CorporateActionOption10.mmOfferType, OfferTypeFormat2Choice.mmCode, OfferTypeFormat2Choice.mmProprietary,
					CorporateActionOption15.mmOfferType, CorporateActionOption20.mmOfferType, CorporateActionOption32.mmOfferType, CorporateActionOption35.mmOfferType, CorporateActionOption44.mmOfferType, OfferTypeFormat3Choice.mmCode,
					OfferTypeFormat3Choice.mmProprietary, CorporateActionOption52.mmOfferType, OfferTypeFormat4Choice.mmCode, OfferTypeFormat4Choice.mmProprietary, CorporateActionOption55.mmOfferType, CorporateAction3.mmOfferType,
					CorporateActionOption3.mmOfferType, CorporateAction4.mmOfferType, CorporateActionOption17.mmOfferType, CorporateAction5.mmOfferType, CorporateActionOption19.mmOfferType, CorporateAction6.mmOfferType,
					CorporateActionOption34.mmOfferType, CorporateAction7.mmOfferType, CorporateActionOption36.mmOfferType, CorporateAction8.mmOfferType, CorporateActionOption45.mmOfferType, CorporateAction10.mmOfferType,
					CorporateActionOption51.mmOfferType, CorporateAction11.mmOfferType, CorporateActionOption56.mmOfferType, OfferType1FormatChoice.mmCode, OfferType1FormatChoice.mmProprietary, CorporateAction2.mmOfferType,
					CorporateActionOption1.mmOfferType, CorporateActionOption100.mmOfferType, CorporateActionOption101.mmOfferType, CorporateAction12.mmOfferType, OfferTypeFormat5Choice.mmCode, OfferTypeFormat5Choice.mmProprietary,
					CorporateActionOption108.mmOfferType, CorporateActionOption106.mmOfferType, CorporateAction17.mmOfferType, OfferTypeFormat8Choice.mmCode, OfferTypeFormat8Choice.mmProprietary, CorporateActionOption115.mmOfferType,
					CorporateActionOption114.mmOfferType, CorporateAction31.mmOfferType, OfferTypeFormat10Choice.mmCode, OfferTypeFormat10Choice.mmProprietary, CorporateActionOption125.mmOfferType, CorporateActionOption127.mmOfferType,
					CorporateAction40.mmOfferType, OfferTypeFormat11Choice.mmCode, OfferTypeFormat11Choice.mmProprietary, CorporateActionOption130.mmOfferType, CorporateActionOption129.mmOfferType, CorporateActionOption135.mmOfferType,
					CorporateActionOption133.mmOfferType, CorporateAction41.mmOfferType, CorporateActionOption138.mmOfferType, CorporateActionOption139.mmOfferType, CorporateActionOption148.mmOfferType, CorporateAction51.mmOfferType,
					CorporateActionOption150.mmOfferType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}

		@Override
		public OfferTypeV2Code getValue(CorporateActionOption obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateActionOption obj, OfferTypeV2Code value) {
			obj.setOfferType(value);
		}
	};
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmChargesAppliedIndicator
	 * CorporateActionOption10.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmChargesAppliedIndicator
	 * CorporateActionOption15.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmChargesAppliedIndicator
	 * CorporateActionOption20.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmChargesAppliedIndicator
	 * CorporateActionOption32.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmChargesAppliedIndicator
	 * CorporateActionOption35.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmChargesAppliedIndicator
	 * CorporateActionOption44.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmChargesAppliedIndicator
	 * CorporateActionOption52.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmChargesAppliedIndicator
	 * CorporateActionOption55.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmChargesAppliedIndicator
	 * CorporateAction3.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmChargesAppliedIndicator
	 * CorporateActionOption3.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmChargesAppliedIndicator
	 * CorporateAction4.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmChargesAppliedIndicator
	 * CorporateActionOption17.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmChargesAppliedIndicator
	 * CorporateAction5.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmChargesAppliedIndicator
	 * CorporateActionOption19.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmChargesAppliedIndicator
	 * CorporateAction6.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmChargesAppliedIndicator
	 * CorporateActionOption34.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmChargesAppliedIndicator
	 * CorporateAction7.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmChargesAppliedIndicator
	 * CorporateActionOption36.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmChargesAppliedIndicator
	 * CorporateAction8.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmChargesAppliedIndicator
	 * CorporateActionOption45.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmChargesAppliedIndicator
	 * CorporateAction10.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmChargesAppliedIndicator
	 * CorporateActionOption51.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmChargesAppliedIndicator
	 * CorporateAction11.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmChargesAppliedIndicator
	 * CorporateActionOption56.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmRedemptionChargesAppliedIndicator
	 * CorporateAction2.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmRedemptionChargesAppliedIndicator
	 * CorporateActionOption1.mmRedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmChargesAppliedIndicator
	 * CorporateActionOption100.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmChargesAppliedIndicator
	 * CorporateActionOption101.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmChargesAppliedIndicator
	 * CorporateAction12.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmChargesAppliedIndicator
	 * CorporateActionOption108.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmChargesAppliedIndicator
	 * CorporateActionOption106.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmChargesAppliedIndicator
	 * CorporateAction17.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmChargesAppliedIndicator
	 * CorporateActionOption115.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmChargesAppliedIndicator
	 * CorporateActionOption114.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmChargesAppliedIndicator
	 * CorporateAction31.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmChargesAppliedIndicator
	 * CorporateActionOption125.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmChargesAppliedIndicator
	 * CorporateActionOption127.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmChargesAppliedIndicator
	 * CorporateAction40.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChargesAppliedIndicator
	 * CorporateActionOption130.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmChargesAppliedIndicator
	 * CorporateActionOption129.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmChargesAppliedIndicator
	 * CorporateActionOption135.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmChargesAppliedIndicator
	 * CorporateActionOption133.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmChargesAppliedIndicator
	 * CorporateAction41.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmChargesAppliedIndicator
	 * CorporateActionOption138.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmChargesAppliedIndicator
	 * CorporateActionOption139.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmChargesAppliedIndicator
	 * CorporateActionOption148.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmChargesAppliedIndicator
	 * CorporateAction51.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmChargesAppliedIndicator
	 * CorporateActionOption150.mmChargesAppliedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmChargesAppliedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmChargesAppliedIndicator, CorporateActionOption15.mmChargesAppliedIndicator, CorporateActionOption20.mmChargesAppliedIndicator,
					CorporateActionOption32.mmChargesAppliedIndicator, CorporateActionOption35.mmChargesAppliedIndicator, CorporateActionOption44.mmChargesAppliedIndicator, CorporateActionOption52.mmChargesAppliedIndicator,
					CorporateActionOption55.mmChargesAppliedIndicator, CorporateAction3.mmChargesAppliedIndicator, CorporateActionOption3.mmChargesAppliedIndicator, CorporateAction4.mmChargesAppliedIndicator,
					CorporateActionOption17.mmChargesAppliedIndicator, CorporateAction5.mmChargesAppliedIndicator, CorporateActionOption19.mmChargesAppliedIndicator, CorporateAction6.mmChargesAppliedIndicator,
					CorporateActionOption34.mmChargesAppliedIndicator, CorporateAction7.mmChargesAppliedIndicator, CorporateActionOption36.mmChargesAppliedIndicator, CorporateAction8.mmChargesAppliedIndicator,
					CorporateActionOption45.mmChargesAppliedIndicator, CorporateAction10.mmChargesAppliedIndicator, CorporateActionOption51.mmChargesAppliedIndicator, CorporateAction11.mmChargesAppliedIndicator,
					CorporateActionOption56.mmChargesAppliedIndicator, CorporateAction2.mmRedemptionChargesAppliedIndicator, CorporateActionOption1.mmRedemptionChargesAppliedIndicator, CorporateActionOption100.mmChargesAppliedIndicator,
					CorporateActionOption101.mmChargesAppliedIndicator, CorporateAction12.mmChargesAppliedIndicator, CorporateActionOption108.mmChargesAppliedIndicator, CorporateActionOption106.mmChargesAppliedIndicator,
					CorporateAction17.mmChargesAppliedIndicator, CorporateActionOption115.mmChargesAppliedIndicator, CorporateActionOption114.mmChargesAppliedIndicator, CorporateAction31.mmChargesAppliedIndicator,
					CorporateActionOption125.mmChargesAppliedIndicator, CorporateActionOption127.mmChargesAppliedIndicator, CorporateAction40.mmChargesAppliedIndicator, CorporateActionOption130.mmChargesAppliedIndicator,
					CorporateActionOption129.mmChargesAppliedIndicator, CorporateActionOption135.mmChargesAppliedIndicator, CorporateActionOption133.mmChargesAppliedIndicator, CorporateAction41.mmChargesAppliedIndicator,
					CorporateActionOption138.mmChargesAppliedIndicator, CorporateActionOption139.mmChargesAppliedIndicator, CorporateActionOption148.mmChargesAppliedIndicator, CorporateAction51.mmChargesAppliedIndicator,
					CorporateActionOption150.mmChargesAppliedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setChargesAppliedIndicator(value);
		}
	};
	protected YesNoIndicator withdrawalAllowedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmWithdrawalAllowedIndicator
	 * CorporateActionOption10.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmWithdrawalAllowedIndicator
	 * CorporateActionOption15.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmWithdrawalAllowedIndicator
	 * CorporateActionOption20.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmWithdrawalAllowedIndicator
	 * CorporateActionOption32.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmWithdrawalAllowedIndicator
	 * CorporateActionOption35.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmWithdrawalAllowedIndicator
	 * CorporateActionOption44.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmWithdrawalAllowedIndicator
	 * CorporateActionOption52.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmWithdrawalAllowedIndicator
	 * CorporateActionOption55.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmWithdrawalAllowedIndicator
	 * CorporateActionOption3.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmWithdrawalAllowedIndicator
	 * CorporateActionOption17.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmWithdrawalAllowedIndicator
	 * CorporateActionOption19.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmWithdrawalAllowedIndicator
	 * CorporateActionOption34.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmWithdrawalAllowedIndicator
	 * CorporateActionOption36.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmWithdrawalAllowedIndicator
	 * CorporateActionOption45.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmWithdrawalAllowedIndicator
	 * CorporateActionOption51.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmWithdrawalAllowedIndicator
	 * CorporateActionOption56.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmWithdrawalAllowedIndicator
	 * CorporateActionOption1.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmWithdrawalAllowedIndicator
	 * CorporateActionOption100.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmWithdrawalAllowedIndicator
	 * CorporateActionOption101.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmWithdrawalAllowedIndicator
	 * CorporateActionOption108.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmWithdrawalAllowedIndicator
	 * CorporateActionOption106.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmWithdrawalAllowedIndicator
	 * CorporateActionOption115.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmWithdrawalAllowedIndicator
	 * CorporateActionOption114.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmWithdrawalAllowedIndicator
	 * CorporateActionOption125.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmWithdrawalAllowedIndicator
	 * CorporateActionOption127.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmWithdrawalAllowedIndicator
	 * CorporateActionOption130.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmWithdrawalAllowedIndicator
	 * CorporateActionOption129.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmWithdrawalAllowedIndicator
	 * CorporateActionOption135.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmWithdrawalAllowedIndicator
	 * CorporateActionOption133.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmWithdrawalAllowedIndicator
	 * CorporateActionOption138.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmWithdrawalAllowedIndicator
	 * CorporateActionOption139.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmWithdrawalAllowedIndicator
	 * CorporateActionOption148.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmWithdrawalAllowedIndicator
	 * CorporateActionOption150.mmWithdrawalAllowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmWithdrawalAllowedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmWithdrawalAllowedIndicator, CorporateActionOption15.mmWithdrawalAllowedIndicator, CorporateActionOption20.mmWithdrawalAllowedIndicator,
					CorporateActionOption32.mmWithdrawalAllowedIndicator, CorporateActionOption35.mmWithdrawalAllowedIndicator, CorporateActionOption44.mmWithdrawalAllowedIndicator, CorporateActionOption52.mmWithdrawalAllowedIndicator,
					CorporateActionOption55.mmWithdrawalAllowedIndicator, CorporateActionOption3.mmWithdrawalAllowedIndicator, CorporateActionOption17.mmWithdrawalAllowedIndicator, CorporateActionOption19.mmWithdrawalAllowedIndicator,
					CorporateActionOption34.mmWithdrawalAllowedIndicator, CorporateActionOption36.mmWithdrawalAllowedIndicator, CorporateActionOption45.mmWithdrawalAllowedIndicator, CorporateActionOption51.mmWithdrawalAllowedIndicator,
					CorporateActionOption56.mmWithdrawalAllowedIndicator, CorporateActionOption1.mmWithdrawalAllowedIndicator, CorporateActionOption100.mmWithdrawalAllowedIndicator, CorporateActionOption101.mmWithdrawalAllowedIndicator,
					CorporateActionOption108.mmWithdrawalAllowedIndicator, CorporateActionOption106.mmWithdrawalAllowedIndicator, CorporateActionOption115.mmWithdrawalAllowedIndicator, CorporateActionOption114.mmWithdrawalAllowedIndicator,
					CorporateActionOption125.mmWithdrawalAllowedIndicator, CorporateActionOption127.mmWithdrawalAllowedIndicator, CorporateActionOption130.mmWithdrawalAllowedIndicator, CorporateActionOption129.mmWithdrawalAllowedIndicator,
					CorporateActionOption135.mmWithdrawalAllowedIndicator, CorporateActionOption133.mmWithdrawalAllowedIndicator, CorporateActionOption138.mmWithdrawalAllowedIndicator, CorporateActionOption139.mmWithdrawalAllowedIndicator,
					CorporateActionOption148.mmWithdrawalAllowedIndicator, CorporateActionOption150.mmWithdrawalAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getWithdrawalAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setWithdrawalAllowedIndicator(value);
		}
	};
	protected YesNoIndicator changeAllowedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmChangeAllowedIndicator
	 * CorporateActionOption10.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmChangeAllowedIndicator
	 * CorporateActionOption15.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmChangeAllowedIndicator
	 * CorporateActionOption20.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmChangeAllowedIndicator
	 * CorporateActionOption32.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmChangeAllowedIndicator
	 * CorporateActionOption35.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmChangeAllowedIndicator
	 * CorporateActionOption44.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmChangeAllowedIndicator
	 * CorporateActionOption52.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmChangeAllowedIndicator
	 * CorporateActionOption55.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmChangeAllowedIndicator
	 * CorporateActionOption3.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmChangeAllowedIndicator
	 * CorporateActionOption17.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmChangeAllowedIndicator
	 * CorporateActionOption19.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmChangeAllowedIndicator
	 * CorporateActionOption34.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmChangeAllowedIndicator
	 * CorporateActionOption36.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmChangeAllowedIndicator
	 * CorporateActionOption45.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmChangeAllowedIndicator
	 * CorporateActionOption51.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmChangeAllowedIndicator
	 * CorporateActionOption56.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmChangeAllowedIndicator
	 * CorporateActionOption1.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmChangeAllowedIndicator
	 * CorporateActionOption100.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmChangeAllowedIndicator
	 * CorporateActionOption101.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmChangeAllowedIndicator
	 * CorporateActionOption108.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmChangeAllowedIndicator
	 * CorporateActionOption106.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmChangeAllowedIndicator
	 * CorporateActionOption115.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmChangeAllowedIndicator
	 * CorporateActionOption114.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmChangeAllowedIndicator
	 * CorporateActionOption125.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmChangeAllowedIndicator
	 * CorporateActionOption127.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmChangeAllowedIndicator
	 * CorporateActionOption130.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmChangeAllowedIndicator
	 * CorporateActionOption129.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmChangeAllowedIndicator
	 * CorporateActionOption135.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmChangeAllowedIndicator
	 * CorporateActionOption133.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmChangeAllowedIndicator
	 * CorporateActionOption138.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmChangeAllowedIndicator
	 * CorporateActionOption139.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmChangeAllowedIndicator
	 * CorporateActionOption148.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmChangeAllowedIndicator
	 * CorporateActionOption150.mmChangeAllowedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmChangeAllowedIndicator = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmChangeAllowedIndicator, CorporateActionOption15.mmChangeAllowedIndicator, CorporateActionOption20.mmChangeAllowedIndicator,
					CorporateActionOption32.mmChangeAllowedIndicator, CorporateActionOption35.mmChangeAllowedIndicator, CorporateActionOption44.mmChangeAllowedIndicator, CorporateActionOption52.mmChangeAllowedIndicator,
					CorporateActionOption55.mmChangeAllowedIndicator, CorporateActionOption3.mmChangeAllowedIndicator, CorporateActionOption17.mmChangeAllowedIndicator, CorporateActionOption19.mmChangeAllowedIndicator,
					CorporateActionOption34.mmChangeAllowedIndicator, CorporateActionOption36.mmChangeAllowedIndicator, CorporateActionOption45.mmChangeAllowedIndicator, CorporateActionOption51.mmChangeAllowedIndicator,
					CorporateActionOption56.mmChangeAllowedIndicator, CorporateActionOption1.mmChangeAllowedIndicator, CorporateActionOption100.mmChangeAllowedIndicator, CorporateActionOption101.mmChangeAllowedIndicator,
					CorporateActionOption108.mmChangeAllowedIndicator, CorporateActionOption106.mmChangeAllowedIndicator, CorporateActionOption115.mmChangeAllowedIndicator, CorporateActionOption114.mmChangeAllowedIndicator,
					CorporateActionOption125.mmChangeAllowedIndicator, CorporateActionOption127.mmChangeAllowedIndicator, CorporateActionOption130.mmChangeAllowedIndicator, CorporateActionOption129.mmChangeAllowedIndicator,
					CorporateActionOption135.mmChangeAllowedIndicator, CorporateActionOption133.mmChangeAllowedIndicator, CorporateActionOption138.mmChangeAllowedIndicator, CorporateActionOption139.mmChangeAllowedIndicator,
					CorporateActionOption148.mmChangeAllowedIndicator, CorporateActionOption150.mmChangeAllowedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getChangeAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setChangeAllowedIndicator(value);
		}
	};
	protected List<CorporateActionOptionServicing> corporateActionOptionServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
	 * CorporateActionOptionServicing.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing
	 * CorporateActionOptionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the entitlement on the basis of the proposed option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionOptionServicing>> mmCorporateActionOptionServicing = new MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionOptionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionOptionServicing.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionOptionServicing.mmObject();
		}

		@Override
		public List<CorporateActionOptionServicing> getValue(CorporateActionOption obj) {
			return obj.getCorporateActionOptionServicing();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<CorporateActionOptionServicing> value) {
			obj.setCorporateActionOptionServicing(value);
		}
	};
	protected List<ProceedsDefinition> proceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
	 * ProceedsDefinition.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of exchanges of cash and / or securities available in the processing of corporate actions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<ProceedsDefinition>> mmProceedsDefinition = new MMBusinessAssociationEnd<CorporateActionOption, List<ProceedsDefinition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			opposite_lazy = () -> ProceedsDefinition.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProceedsDefinition.mmObject();
		}

		@Override
		public List<ProceedsDefinition> getValue(CorporateActionOption obj) {
			return obj.getProceedsDefinition();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<ProceedsDefinition> value) {
			obj.setProceedsDefinition(value);
		}
	};
	protected List<CorporateActionDistribution> distribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
	 * CorporateActionDistribution.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which an option is selected."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionDistribution>> mmDistribution = new MMBusinessAssociationEnd<CorporateActionOption, List<CorporateActionDistribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionDistribution.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public List<CorporateActionDistribution> getValue(CorporateActionOption obj) {
			return obj.getDistribution();
		}

		@Override
		public void setValue(CorporateActionOption obj, List<CorporateActionDistribution> value) {
			obj.setDistribution(value);
		}
	};
	protected YesNoIndicator default_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option is the default option or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionOption, YesNoIndicator> mmDefault = new MMBusinessAttribute<CorporateActionOption, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionOption obj) {
			return obj.getDefault();
		}

		@Override
		public void setValue(CorporateActionOption obj, YesNoIndicator value) {
			obj.setDefault(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmCorporateActionOption, ProceedsDefinition.mmOption, CorporateActionElection.mmOption, ChoiceCorporateAction.mmCorporateActionOptionDefinition,
						CorporateActionDistribution.mmOption, CorporateActionOptionServicing.mmRelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.mmOptionNumber, com.tools20022.repository.entity.CorporateActionOption.mmOptionType,
						com.tools20022.repository.entity.CorporateActionOption.mmFractionDisposition, com.tools20022.repository.entity.CorporateActionOption.mmCurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.mmRelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmOptionFeatures, com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod, com.tools20022.repository.entity.CorporateActionOption.mmOfferType,
						com.tools20022.repository.entity.CorporateActionOption.mmChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmWithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.mmChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmDistribution, com.tools20022.repository.entity.CorporateActionOption.mmDefault);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionOption4Choice.mmObject(), FractionDispositionType2Choice.mmObject(), SecuritiesOption2.mmObject(), CorporateActionOption5.mmObject(),
						CorporateActionOption6Choice.mmObject(), FractionDispositionType8Choice.mmObject(), SecuritiesOption7.mmObject(), CorporateActionOption13.mmObject(), FractionDispositionType10Choice.mmObject(),
						CorporateActionOption25.mmObject(), FractionDispositionType11Choice.mmObject(), CorporateActionOption30.mmObject(), CorporateActionOption12Choice.mmObject(), CorporateActionOption38.mmObject(),
						CorporateActionOption15Choice.mmObject(), CorporateActionOption47.mmObject(), FractionDispositionType17Choice.mmObject(), CorporateActionOption57.mmObject(), FractionDispositionType18Choice.mmObject(),
						CorporateActionOption58.mmObject(), CorporateActionOption6.mmObject(), CorporateActionOption21.mmObject(), CorporateActionOption42.mmObject(), CorporateActionOption28.mmObject(), CorporateActionOption43.mmObject(),
						CorporateActionOption5Choice.mmObject(), CorporateActionOption9.mmObject(), CorporateActionOption7Choice.mmObject(), CorporateActionOption18.mmObject(), CorporateActionOption22.mmObject(),
						CorporateActionOption27.mmObject(), CorporateActionOption26.mmObject(), CorporateActionOption13Choice.mmObject(), CorporateActionOption41.mmObject(), CorporateActionOption16Choice.mmObject(),
						CorporateActionOption50.mmObject(), CorporateActionOption2Choice.mmObject(), InstructedCorporateActionOption1.mmObject(), CorporateActionOption9Choice.mmObject(), InstructedCorporateActionOption2.mmObject(),
						CorporateActionOption10Choice.mmObject(), InstructedCorporateActionOption4.mmObject(), CorporateActionOption17Choice.mmObject(), InstructedCorporateActionOption5.mmObject(), CorporateActionOption29.mmObject(),
						CorporateActionOption3Choice.mmObject(), OptionFeaturesFormat1Choice.mmObject(), FractionDispositionType1Choice.mmObject(), FractionDispositionType4Choice.mmObject(), SecuritiesOption3.mmObject(),
						CorporateActionOption4.mmObject(), CorporateActionOption8Choice.mmObject(), OptionFeaturesFormat3Choice.mmObject(), FractionDispositionType6Choice.mmObject(), FractionDispositionType7Choice.mmObject(),
						SecuritiesOption8.mmObject(), CorporateActionOption14.mmObject(), FractionDispositionType12Choice.mmObject(), SecuritiesOption18.mmObject(), CorporateActionOption23.mmObject(),
						FractionDispositionType13Choice.mmObject(), SecuritiesOption20.mmObject(), CorporateActionOption31.mmObject(), CorporateActionOption11Choice.mmObject(), SecuritiesOption26.mmObject(),
						CorporateActionOption37.mmObject(), CorporateActionOption14Choice.mmObject(), SecuritiesOption31.mmObject(), CorporateActionOption46.mmObject(), FractionDispositionType23Choice.mmObject(),
						SecuritiesOption35.mmObject(), CorporateActionOption53.mmObject(), FractionDispositionType24Choice.mmObject(), SecuritiesOption36.mmObject(), CorporateActionOption54.mmObject(), OfferTypeFormat1Choice.mmObject(),
						OptionFeaturesFormat2Choice.mmObject(), SecuritiesOption1.mmObject(), SecuritiesOption4.mmObject(), CorporateActionOption10.mmObject(), OfferTypeFormat2Choice.mmObject(), OptionFeaturesFormat4Choice.mmObject(),
						SecuritiesOption9.mmObject(), SecuritiesOption10.mmObject(), CorporateActionOption15.mmObject(), OptionFeaturesFormat6Choice.mmObject(), SecuritiesOption15.mmObject(), SecuritiesOption13.mmObject(),
						CorporateActionOption20.mmObject(), OptionFeaturesFormat7Choice.mmObject(), SecuritiesOption16.mmObject(), SecuritiesOption17.mmObject(), CorporateActionOption32.mmObject(), OptionFeaturesFormat5Choice.mmObject(),
						OptionFeaturesFormat9Choice.mmObject(), SecuritiesOption23.mmObject(), SecuritiesOption24.mmObject(), CorporateActionOption35.mmObject(), OptionFeaturesFormat11Choice.mmObject(), SecuritiesOption28.mmObject(),
						SecuritiesOption29.mmObject(), CorporateActionOption44.mmObject(), FractionDispositionType19Choice.mmObject(), OfferTypeFormat3Choice.mmObject(), SecuritiesOption33.mmObject(), SecuritiesOption38.mmObject(),
						CorporateActionOption52.mmObject(), FractionDispositionType20Choice.mmObject(), OfferTypeFormat4Choice.mmObject(), SecuritiesOption37.mmObject(), SecuritiesOption39.mmObject(), CorporateActionOption55.mmObject(),
						SecuritiesOption5.mmObject(), CorporateActionOption12.mmObject(), SecuritiesOption11.mmObject(), CorporateActionOption16.mmObject(), SecuritiesOption19.mmObject(), CorporateActionOption24.mmObject(),
						SecuritiesOption21.mmObject(), CorporateActionOption33.mmObject(), SecuritiesOption27.mmObject(), CorporateActionOption39.mmObject(), SecuritiesOption32.mmObject(), CorporateActionOption48.mmObject(),
						FractionDispositionType3Choice.mmObject(), SecuritiesOption6.mmObject(), CorporateActionOption3.mmObject(), FractionDispositionType5Choice.mmObject(), SecuritiesOption12.mmObject(),
						CorporateActionOption17.mmObject(), FractionDispositionType9Choice.mmObject(), SecuritiesOption14.mmObject(), CorporateActionOption19.mmObject(), FractionDispositionType14Choice.mmObject(),
						OptionFeaturesFormat8Choice.mmObject(), SecuritiesOption22.mmObject(), CorporateActionOption34.mmObject(), SecuritiesOption25.mmObject(), CorporateActionOption36.mmObject(), SecuritiesOption30.mmObject(),
						CorporateActionOption45.mmObject(), FractionDispositionType15Choice.mmObject(), CorporateActionOption51.mmObject(), FractionDispositionType16Choice.mmObject(), CorporateActionOption56.mmObject(),
						CorporateActionOption1FormatChoice.mmObject(), OfferType1FormatChoice.mmObject(), FractionDispositionType1FormatChoice.mmObject(), SecurityOption1.mmObject(), OptionFeatures1FormatChoice.mmObject(),
						CorporateActionOption1.mmObject(), CorporateActionOption2.mmObject(), CorporateActionOption7.mmObject(), CorporateActionOption99.mmObject(), CorporateActionOption11.mmObject(), CorporateActionOption8.mmObject(),
						CorporateActionOption103.mmObject(), CorporateActionOption100.mmObject(), CorporateActionOption101.mmObject(), CorporateActionOption102.mmObject(), OfferTypeFormat5Choice.mmObject(), SecuritiesOption42.mmObject(),
						SecuritiesOption40.mmObject(), OptionFeaturesFormat12Choice.mmObject(), CorporateActionOption110.mmObject(), CorporateActionOption108.mmObject(), CorporateActionOption107.mmObject(),
						CorporateActionOption106.mmObject(), OfferTypeFormat8Choice.mmObject(), SecuritiesOption48.mmObject(), OptionFeaturesFormat15Choice.mmObject(), SecuritiesOption45.mmObject(), CorporateActionOption111.mmObject(),
						CorporateActionOption113.mmObject(), CorporateActionOption117.mmObject(), CorporateActionOption118.mmObject(), CorporateActionOption119.mmObject(), CorporateActionOption115.mmObject(),
						CorporateActionOption116.mmObject(), CorporateActionOption114.mmObject(), CorporateActionOption120.mmObject(), CorporateActionOption19Choice.mmObject(), InstructedCorporateActionOption6.mmObject(),
						CorporateActionOption18Choice.mmObject(), CorporateActionOption21Choice.mmObject(), FractionDispositionType25Choice.mmObject(), SecuritiesOption51.mmObject(), FractionDispositionType27Choice.mmObject(),
						CorporateActionOption20Choice.mmObject(), SecuritiesOption49.mmObject(), FractionDispositionType26Choice.mmObject(), SecuritiesOption53.mmObject(), OfferTypeFormat10Choice.mmObject(),
						OptionFeaturesFormat17Choice.mmObject(), SecuritiesOption52.mmObject(), FractionDispositionType28Choice.mmObject(), OptionFeaturesFormat18Choice.mmObject(), OptionFeaturesFormat16Choice.mmObject(),
						SecuritiesOption50.mmObject(), CorporateActionOption121.mmObject(), CorporateActionOption126.mmObject(), CorporateActionOption124.mmObject(), CorporateActionOption125.mmObject(), CorporateActionOption123.mmObject(),
						CorporateActionOption127.mmObject(), OptionFeaturesFormat19Choice.mmObject(), FractionDispositionType30Choice.mmObject(), CorporateActionOption26Choice.mmObject(), SecuritiesOption55.mmObject(),
						InstructedCorporateActionOption7.mmObject(), CorporateActionOption23Choice.mmObject(), OptionFeaturesFormat21Choice.mmObject(), FractionDispositionType29Choice.mmObject(), CorporateActionOption22Choice.mmObject(),
						SecuritiesOption54.mmObject(), CorporateActionOption25Choice.mmObject(), OptionFeaturesFormat20Choice.mmObject(), SecuritiesOption57.mmObject(), OfferTypeFormat11Choice.mmObject(),
						FractionDispositionType31Choice.mmObject(), SecuritiesOption56.mmObject(), FractionDispositionType32Choice.mmObject(), SecuritiesOption58.mmObject(), CorporateActionOption128.mmObject(),
						CorporateActionOption29Choice.mmObject(), CorporateActionOption132.mmObject(), CorporateActionOption130.mmObject(), CorporateActionOption131.mmObject(), CorporateActionOption129.mmObject(),
						SecuritiesOption60.mmObject(), OptionFeaturesFormat22Choice.mmObject(), SecuritiesOption59.mmObject(), CorporateActionOption134.mmObject(), CorporateActionOption136.mmObject(), CorporateActionOption135.mmObject(),
						CorporateActionOption133.mmObject(), SecuritiesOption61.mmObject(), SecuritiesOption63.mmObject(), OptionFeaturesFormat23Choice.mmObject(), CorporateActionOption140.mmObject(), CorporateActionOption141.mmObject(),
						CorporateActionOption138.mmObject(), CorporateActionOption142.mmObject(), CorporateActionOption139.mmObject(), SecuritiesOption64.mmObject(), InstructedCorporateActionOption8.mmObject(),
						SecuritiesOption65.mmObject(), CorporateActionOption143.mmObject(), SecuritiesOption66.mmObject(), CorporateActionOption144.mmObject(), InstructedCorporateActionOption9.mmObject(),
						CorporateActionOption146.mmObject(), CorporateActionOption147.mmObject(), SecuritiesOption67.mmObject(), CorporateActionOption148.mmObject(), SecuritiesOption68.mmObject(), CorporateActionOption149.mmObject(),
						SecuritiesOption69.mmObject(), CorporateActionOption150.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionOption.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionOption setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOptionCode getOptionType() {
		return optionType;
	}

	public CorporateActionOption setOptionType(CorporateActionOptionCode optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public FractionDispositionTypeCode getFractionDisposition() {
		return fractionDisposition;
	}

	public CorporateActionOption setFractionDisposition(FractionDispositionTypeCode fractionDisposition) {
		this.fractionDisposition = Objects.requireNonNull(fractionDisposition);
		return this;
	}

	public CurrencyCode getCurrencyOption() {
		return currencyOption;
	}

	public CorporateActionOption setCurrencyOption(CurrencyCode currencyOption) {
		this.currencyOption = Objects.requireNonNull(currencyOption);
		return this;
	}

	public Optional<ChoiceCorporateAction> getRelatedChoiceCorporateAction() {
		return relatedChoiceCorporateAction == null ? Optional.empty() : Optional.of(relatedChoiceCorporateAction);
	}

	public CorporateActionOption setRelatedChoiceCorporateAction(ChoiceCorporateAction relatedChoiceCorporateAction) {
		this.relatedChoiceCorporateAction = relatedChoiceCorporateAction;
		return this;
	}

	public CorporateActionElection getCorporateActionElection() {
		return corporateActionElection;
	}

	public CorporateActionOption setCorporateActionElection(CorporateActionElection corporateActionElection) {
		this.corporateActionElection = Objects.requireNonNull(corporateActionElection);
		return this;
	}

	public OptionFeaturesCode getOptionFeatures() {
		return optionFeatures;
	}

	public CorporateActionOption setOptionFeatures(OptionFeaturesCode optionFeatures) {
		this.optionFeatures = Objects.requireNonNull(optionFeatures);
		return this;
	}

	public DateTimePeriod getActionPeriod() {
		return actionPeriod;
	}

	public CorporateActionOption setActionPeriod(DateTimePeriod actionPeriod) {
		this.actionPeriod = Objects.requireNonNull(actionPeriod);
		return this;
	}

	public OfferTypeV2Code getOfferType() {
		return offerType;
	}

	public CorporateActionOption setOfferType(OfferTypeV2Code offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public YesNoIndicator getChargesAppliedIndicator() {
		return chargesAppliedIndicator;
	}

	public CorporateActionOption setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = Objects.requireNonNull(chargesAppliedIndicator);
		return this;
	}

	public YesNoIndicator getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator;
	}

	public CorporateActionOption setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = Objects.requireNonNull(withdrawalAllowedIndicator);
		return this;
	}

	public YesNoIndicator getChangeAllowedIndicator() {
		return changeAllowedIndicator;
	}

	public CorporateActionOption setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = Objects.requireNonNull(changeAllowedIndicator);
		return this;
	}

	public List<CorporateActionOptionServicing> getCorporateActionOptionServicing() {
		return corporateActionOptionServicing == null ? corporateActionOptionServicing = new ArrayList<>() : corporateActionOptionServicing;
	}

	public CorporateActionOption setCorporateActionOptionServicing(List<CorporateActionOptionServicing> corporateActionOptionServicing) {
		this.corporateActionOptionServicing = Objects.requireNonNull(corporateActionOptionServicing);
		return this;
	}

	public List<ProceedsDefinition> getProceedsDefinition() {
		return proceedsDefinition == null ? proceedsDefinition = new ArrayList<>() : proceedsDefinition;
	}

	public CorporateActionOption setProceedsDefinition(List<ProceedsDefinition> proceedsDefinition) {
		this.proceedsDefinition = Objects.requireNonNull(proceedsDefinition);
		return this;
	}

	public List<CorporateActionDistribution> getDistribution() {
		return distribution == null ? distribution = new ArrayList<>() : distribution;
	}

	public CorporateActionOption setDistribution(List<CorporateActionDistribution> distribution) {
		this.distribution = Objects.requireNonNull(distribution);
		return this;
	}

	public YesNoIndicator getDefault() {
		return default_;
	}

	public CorporateActionOption setDefault(YesNoIndicator default_) {
		this.default_ = Objects.requireNonNull(default_);
		return this;
	}
}