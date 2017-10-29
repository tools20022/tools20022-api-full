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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionNumber
 * CorporateActionOption.OptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionType
 * CorporateActionOption.OptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#FractionDisposition
 * CorporateActionOption.FractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CurrencyOption
 * CorporateActionOption.CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#RelatedChoiceCorporateAction
 * CorporateActionOption.RelatedChoiceCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionElection
 * CorporateActionOption.CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OptionFeatures
 * CorporateActionOption.OptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ActionPeriod
 * CorporateActionOption.ActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#OfferType
 * CorporateActionOption.OfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ChargesAppliedIndicator
 * CorporateActionOption.ChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#WithdrawalAllowedIndicator
 * CorporateActionOption.WithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ChangeAllowedIndicator
 * CorporateActionOption.ChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#CorporateActionOptionServicing
 * CorporateActionOption.CorporateActionOptionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#ProceedsDefinition
 * CorporateActionOption.ProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Distribution
 * CorporateActionOption.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#Default
 * CorporateActionOption.Default}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CorporateActionOption
 * DateTimePeriod.CorporateActionOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#Option
 * ProceedsDefinition.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Option
 * CorporateActionElection.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#CorporateActionOptionDefinition
 * ChoiceCorporateAction.CorporateActionOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
 * CorporateActionDistribution.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedOption
 * CorporateActionOptionServicing.RelatedOption}</li>
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
	/**
	 * Number identifying the available corporate action options.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#OptionNumber
	 * CorporateActionOption5.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#OptionNumber
	 * CorporateActionOption13.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#OptionNumber
	 * CorporateActionOption25.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#OptionNumber
	 * CorporateActionOption30.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#OptionNumber
	 * CorporateActionOption38.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#OptionNumber
	 * CorporateActionOption47.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#OptionNumber
	 * CorporateActionOption57.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#OptionNumber
	 * CorporateActionOption58.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#OptionNumber
	 * CorporateActionOption6.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#OptionNumber
	 * CorporateActionOption21.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#OptionNumber
	 * CorporateActionOption42.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#OptionNumber
	 * CorporateActionOption28.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#OptionNumber
	 * CorporateActionOption43.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#OptionNumber
	 * CorporateActionOption9.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#OptionNumber
	 * CorporateActionOption18.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#OptionNumber
	 * CorporateActionOption22.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#OptionNumber
	 * CorporateActionOption27.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#OptionNumber
	 * CorporateActionOption26.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#OptionNumber
	 * CorporateActionOption41.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#OptionNumber
	 * CorporateActionOption50.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#OptionNumber
	 * InstructedCorporateActionOption1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#OptionNumber
	 * InstructedCorporateActionOption2.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#OptionNumber
	 * InstructedCorporateActionOption4.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#OptionNumber
	 * InstructedCorporateActionOption5.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#OptionNumber
	 * CorporateActionOption29.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#OptionNumber
	 * CorporateActionOption4.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#OptionNumber
	 * CorporateActionOption14.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#OptionNumber
	 * CorporateActionOption23.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#OptionNumber
	 * CorporateActionOption31.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#OptionNumber
	 * CorporateActionOption37.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#OptionNumber
	 * CorporateActionOption46.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#OptionNumber
	 * CorporateActionOption53.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionNumber
	 * CorporateActionOption54.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#OptionNumber
	 * CorporateActionOption10.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#OptionNumber
	 * CorporateActionOption15.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#OptionNumber
	 * CorporateActionOption20.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#OptionNumber
	 * CorporateActionOption32.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#OptionNumber
	 * CorporateActionOption35.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#OptionNumber
	 * CorporateActionOption44.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#OptionNumber
	 * CorporateActionOption52.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#OptionNumber
	 * CorporateActionOption55.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#OptionNumber
	 * CorporateActionOption12.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#OptionNumber
	 * CorporateActionOption16.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#OptionNumber
	 * CorporateActionOption24.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#OptionNumber
	 * CorporateActionOption33.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#OptionNumber
	 * CorporateActionOption39.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#OptionNumber
	 * CorporateActionOption48.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#OptionNumber
	 * CorporateActionOption3.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#OptionNumber
	 * CorporateActionOption17.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#OptionNumber
	 * CorporateActionOption19.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#OptionNumber
	 * CorporateActionOption34.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#OptionNumber
	 * CorporateActionOption36.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#OptionNumber
	 * CorporateActionOption45.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#OptionNumber
	 * CorporateActionOption51.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#OptionNumber
	 * CorporateActionOption56.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#OptionNumber
	 * CorporateActionOption1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#OptionNumber
	 * SecuritiesAccount9.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#OptionNumber
	 * CorporateActionElection3.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#OptionNumber
	 * CorporateActionElection1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#OptionNumber
	 * CorporateActionElection2.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#OptionNumber
	 * EntitlementAdvice1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#OptionNumber
	 * GlobalDistributionRequest1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#OptionNumber
	 * CorporateActionMovement1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#OptionNumber
	 * SecuritiesAccount8.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#OptionNumber
	 * CorporateActionOption2.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#OptionNumber
	 * CorporateActionDeactivationInstructionStatus1.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#OptionNumber
	 * CorporateActionOption7.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption99#OptionNumber
	 * CorporateActionOption99.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#OptionNumber
	 * CorporateActionOption11.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#OptionNumber
	 * CorporateActionOption103.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#OptionNumber
	 * CorporateActionOption100.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#OptionNumber
	 * CorporateActionOption101.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#OptionNumber
	 * CorporateActionOption102.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#OptionNumber
	 * CorporateActionOption110.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#OptionNumber
	 * CorporateActionOption108.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#OptionNumber
	 * CorporateActionOption107.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#OptionNumber
	 * CorporateActionOption106.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#OptionNumber
	 * CorporateActionOption111.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#OptionNumber
	 * CorporateActionOption113.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#OptionNumber
	 * CorporateActionOption117.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#OptionNumber
	 * CorporateActionOption118.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#OptionNumber
	 * CorporateActionOption119.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#OptionNumber
	 * CorporateActionOption115.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#OptionNumber
	 * CorporateActionOption116.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#OptionNumber
	 * CorporateActionOption114.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#OptionNumber
	 * CorporateActionOption120.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#OptionNumber
	 * InstructedCorporateActionOption6.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#OptionNumber
	 * CorporateActionOption121.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#OptionNumber
	 * CorporateActionOption126.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#OptionNumber
	 * CorporateActionOption124.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#OptionNumber
	 * CorporateActionOption125.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#OptionNumber
	 * CorporateActionOption123.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#OptionNumber
	 * CorporateActionOption127.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#OptionNumber
	 * InstructedCorporateActionOption7.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#OptionNumber
	 * CorporateActionOption128.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#OptionNumber
	 * CorporateActionOption132.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#OptionNumber
	 * CorporateActionOption130.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#OptionNumber
	 * CorporateActionOption131.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#OptionNumber
	 * CorporateActionOption129.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#OptionNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1#OptionNumber
	 * CorporateActionInstructedBalanceOptionInstructionDetailsSD1.OptionNumber}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#OptionNumber
	 * CorporateActionOption134.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#OptionNumber
	 * CorporateActionOption136.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#OptionNumber
	 * CorporateActionOption135.OptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#OptionNumber
	 * CorporateActionOption133.OptionNumber}</li>
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
	public static final MMBusinessAttribute OptionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.OptionNumber, com.tools20022.repository.msg.CorporateActionOption13.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption25.OptionNumber, com.tools20022.repository.msg.CorporateActionOption30.OptionNumber, com.tools20022.repository.msg.CorporateActionOption38.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption47.OptionNumber, com.tools20022.repository.msg.CorporateActionOption57.OptionNumber, com.tools20022.repository.msg.CorporateActionOption58.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption6.OptionNumber, com.tools20022.repository.msg.CorporateActionOption21.OptionNumber, com.tools20022.repository.msg.CorporateActionOption42.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption28.OptionNumber, com.tools20022.repository.msg.CorporateActionOption43.OptionNumber, com.tools20022.repository.msg.CorporateActionOption9.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption18.OptionNumber, com.tools20022.repository.msg.CorporateActionOption22.OptionNumber, com.tools20022.repository.msg.CorporateActionOption27.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption26.OptionNumber, com.tools20022.repository.msg.CorporateActionOption41.OptionNumber, com.tools20022.repository.msg.CorporateActionOption50.OptionNumber,
					com.tools20022.repository.msg.InstructedCorporateActionOption1.OptionNumber, com.tools20022.repository.msg.InstructedCorporateActionOption2.OptionNumber,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.OptionNumber, com.tools20022.repository.msg.InstructedCorporateActionOption5.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption29.OptionNumber, com.tools20022.repository.msg.CorporateActionOption4.OptionNumber, com.tools20022.repository.msg.CorporateActionOption14.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption23.OptionNumber, com.tools20022.repository.msg.CorporateActionOption31.OptionNumber, com.tools20022.repository.msg.CorporateActionOption37.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption46.OptionNumber, com.tools20022.repository.msg.CorporateActionOption53.OptionNumber, com.tools20022.repository.msg.CorporateActionOption54.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption10.OptionNumber, com.tools20022.repository.msg.CorporateActionOption15.OptionNumber, com.tools20022.repository.msg.CorporateActionOption20.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption32.OptionNumber, com.tools20022.repository.msg.CorporateActionOption35.OptionNumber, com.tools20022.repository.msg.CorporateActionOption44.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption52.OptionNumber, com.tools20022.repository.msg.CorporateActionOption55.OptionNumber, com.tools20022.repository.msg.CorporateActionOption12.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption16.OptionNumber, com.tools20022.repository.msg.CorporateActionOption24.OptionNumber, com.tools20022.repository.msg.CorporateActionOption33.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption39.OptionNumber, com.tools20022.repository.msg.CorporateActionOption48.OptionNumber, com.tools20022.repository.msg.CorporateActionOption3.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption17.OptionNumber, com.tools20022.repository.msg.CorporateActionOption19.OptionNumber, com.tools20022.repository.msg.CorporateActionOption34.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption36.OptionNumber, com.tools20022.repository.msg.CorporateActionOption45.OptionNumber, com.tools20022.repository.msg.CorporateActionOption51.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption56.OptionNumber, com.tools20022.repository.msg.CorporateActionOption1.OptionNumber, com.tools20022.repository.msg.SecuritiesAccount9.OptionNumber,
					com.tools20022.repository.msg.CorporateActionElection3.OptionNumber, com.tools20022.repository.msg.CorporateActionElection1.OptionNumber, com.tools20022.repository.msg.CorporateActionElection2.OptionNumber,
					com.tools20022.repository.msg.EntitlementAdvice1.OptionNumber, com.tools20022.repository.msg.GlobalDistributionRequest1.OptionNumber, com.tools20022.repository.msg.CorporateActionMovement1.OptionNumber,
					com.tools20022.repository.msg.SecuritiesAccount8.OptionNumber, com.tools20022.repository.msg.CorporateActionOption2.OptionNumber, com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption7.OptionNumber, com.tools20022.repository.msg.CorporateActionOption99.OptionNumber, com.tools20022.repository.msg.CorporateActionOption11.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption103.OptionNumber, com.tools20022.repository.msg.CorporateActionOption100.OptionNumber, com.tools20022.repository.msg.CorporateActionOption101.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption102.OptionNumber, com.tools20022.repository.msg.CorporateActionOption110.OptionNumber, com.tools20022.repository.msg.CorporateActionOption108.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption107.OptionNumber, com.tools20022.repository.msg.CorporateActionOption106.OptionNumber, com.tools20022.repository.msg.CorporateActionOption111.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption113.OptionNumber, com.tools20022.repository.msg.CorporateActionOption117.OptionNumber, com.tools20022.repository.msg.CorporateActionOption118.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption119.OptionNumber, com.tools20022.repository.msg.CorporateActionOption115.OptionNumber, com.tools20022.repository.msg.CorporateActionOption116.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption114.OptionNumber, com.tools20022.repository.msg.CorporateActionOption120.OptionNumber, com.tools20022.repository.msg.InstructedCorporateActionOption6.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption121.OptionNumber, com.tools20022.repository.msg.CorporateActionOption126.OptionNumber, com.tools20022.repository.msg.CorporateActionOption124.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption125.OptionNumber, com.tools20022.repository.msg.CorporateActionOption123.OptionNumber, com.tools20022.repository.msg.CorporateActionOption127.OptionNumber,
					com.tools20022.repository.msg.InstructedCorporateActionOption7.OptionNumber, com.tools20022.repository.msg.CorporateActionOption128.OptionNumber, com.tools20022.repository.msg.CorporateActionOption132.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption130.OptionNumber, com.tools20022.repository.msg.CorporateActionOption131.OptionNumber, com.tools20022.repository.msg.CorporateActionOption129.OptionNumber,
					com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.OptionNumber, com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionInstructionDetailsSD1.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption134.OptionNumber, com.tools20022.repository.msg.CorporateActionOption136.OptionNumber, com.tools20022.repository.msg.CorporateActionOption135.OptionNumber,
					com.tools20022.repository.msg.CorporateActionOption133.OptionNumber);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Type of corporate action options available to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption4Choice#Code
	 * CorporateActionOption4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption4Choice#Proprietary
	 * CorporateActionOption4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#OptionType
	 * CorporateActionOption5.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption6Choice#Code
	 * CorporateActionOption6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption6Choice#Proprietary
	 * CorporateActionOption6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#OptionType
	 * CorporateActionOption13.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#OptionType
	 * CorporateActionOption25.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#OptionType
	 * CorporateActionOption30.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption12Choice#Code
	 * CorporateActionOption12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption12Choice#Proprietary
	 * CorporateActionOption12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#OptionType
	 * CorporateActionOption38.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption15Choice#Code
	 * CorporateActionOption15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption15Choice#Proprietary
	 * CorporateActionOption15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#OptionType
	 * CorporateActionOption47.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#OptionType
	 * CorporateActionOption57.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#OptionType
	 * CorporateActionOption58.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#OptionType
	 * CorporateActionOption6.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#OptionType
	 * CorporateActionOption21.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#OptionType
	 * CorporateActionOption42.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#OptionType
	 * CorporateActionOption28.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#OptionType
	 * CorporateActionOption43.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption5Choice#Code
	 * CorporateActionOption5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption5Choice#Proprietary
	 * CorporateActionOption5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#OptionType
	 * CorporateActionOption9.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice#Code
	 * CorporateActionOption7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption7Choice#Proprietary
	 * CorporateActionOption7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#OptionType
	 * CorporateActionOption18.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#OptionType
	 * CorporateActionOption22.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#OptionType
	 * CorporateActionOption27.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#OptionType
	 * CorporateActionOption26.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption13Choice#Code
	 * CorporateActionOption13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption13Choice#Proprietary
	 * CorporateActionOption13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#OptionType
	 * CorporateActionOption41.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption16Choice#Code
	 * CorporateActionOption16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption16Choice#Proprietary
	 * CorporateActionOption16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#OptionType
	 * CorporateActionOption50.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice#Code
	 * CorporateActionOption2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice#Proprietary
	 * CorporateActionOption2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#OptionType
	 * InstructedCorporateActionOption1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption9Choice#Code
	 * CorporateActionOption9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption9Choice#Proprietary
	 * CorporateActionOption9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#OptionType
	 * InstructedCorporateActionOption2.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption10Choice#Code
	 * CorporateActionOption10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption10Choice#Proprietary
	 * CorporateActionOption10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#OptionType
	 * InstructedCorporateActionOption4.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice#Code
	 * CorporateActionOption17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice#Proprietary
	 * CorporateActionOption17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#OptionType
	 * InstructedCorporateActionOption5.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#OptionType
	 * CorporateActionOption29.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption3Choice#Code
	 * CorporateActionOption3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption3Choice#Proprietary
	 * CorporateActionOption3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#OptionType
	 * CorporateActionOption4.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption8Choice#Code
	 * CorporateActionOption8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption8Choice#Proprietary
	 * CorporateActionOption8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#OptionType
	 * CorporateActionOption14.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#OptionType
	 * CorporateActionOption23.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#OptionType
	 * CorporateActionOption31.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice#Code
	 * CorporateActionOption11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption11Choice#Proprietary
	 * CorporateActionOption11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#OptionType
	 * CorporateActionOption37.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice#Code
	 * CorporateActionOption14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption14Choice#Proprietary
	 * CorporateActionOption14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#OptionType
	 * CorporateActionOption46.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#OptionType
	 * CorporateActionOption53.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionType
	 * CorporateActionOption54.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#OptionType
	 * CorporateActionOption10.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#OptionType
	 * CorporateActionOption15.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#OptionType
	 * CorporateActionOption20.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#OptionType
	 * CorporateActionOption32.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#OptionType
	 * CorporateActionOption35.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#OptionType
	 * CorporateActionOption44.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#OptionType
	 * CorporateActionOption52.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#OptionType
	 * CorporateActionOption55.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#OptionType
	 * CorporateActionOption12.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#OptionType
	 * CorporateActionOption16.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#OptionType
	 * CorporateActionOption24.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#OptionType
	 * CorporateActionOption33.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#OptionType
	 * CorporateActionOption39.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#OptionType
	 * CorporateActionOption48.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#OptionType
	 * CorporateActionOption3.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#OptionType
	 * CorporateActionOption17.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#OptionType
	 * CorporateActionOption19.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#OptionType
	 * CorporateActionOption34.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#OptionType
	 * CorporateActionOption36.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#OptionType
	 * CorporateActionOption45.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#OptionType
	 * CorporateActionOption51.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#OptionType
	 * CorporateActionOption56.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#CorporateActionOptionType
	 * AggregateBalanceInformation8.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#CorporateActionOptionType
	 * AggregateBalanceInformation11.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#CorporateActionOptionType
	 * AggregateBalanceInformation13.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#CorporateActionOptionType
	 * AggregateBalanceInformation15.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#CorporateActionOptionType
	 * AggregateBalanceInformation17.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#CorporateActionOptionType
	 * AggregateBalanceInformation19.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#CorporateActionOptionType
	 * AggregateBalanceInformation22.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#CorporateActionOptionType
	 * AggregateBalanceInformation23.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#CorporateActionOptionType
	 * AggregateBalanceInformation9.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#CorporateActionOptionType
	 * AggregateBalanceInformation10.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#CorporateActionOptionType
	 * AggregateBalanceInformation12.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#CorporateActionOptionType
	 * AggregateBalanceInformation14.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#CorporateActionOptionType
	 * AggregateBalanceInformation16.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#CorporateActionOptionType
	 * AggregateBalanceInformation18.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#CorporateActionOptionType
	 * AggregateBalanceInformation21.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#CorporateActionOptionType
	 * AggregateBalanceInformation24.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#Code
	 * CorporateActionOption1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice#Proprietary
	 * CorporateActionOption1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#DefaultOptionType
	 * CorporateAction2.DefaultOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#OptionType
	 * CorporateActionOption1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount9#OptionType
	 * SecuritiesAccount9.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#OptionType
	 * CorporateActionElection3.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#OptionType
	 * CorporateActionElection1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#OptionType
	 * CorporateActionElection2.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#OptionType
	 * EntitlementAdvice1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#OptionType
	 * GlobalDistributionRequest1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#OptionType
	 * CorporateActionMovement1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount8#OptionType
	 * SecuritiesAccount8.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption2#OptionType
	 * CorporateActionOption2.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#OptionType
	 * CorporateActionDeactivationInstructionStatus1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#OptionType
	 * CorporateActionOption7.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#CorporateActionOptionType
	 * AggregateBalanceInformation20.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#OptionType
	 * CorporateActionOption11.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#CorporateActionOptionType
	 * AggregateBalanceInformation6.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#CorporateActionOptionType
	 * AggregateBalanceInformation7.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#OptionType
	 * CorporateActionOption103.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#OptionType
	 * CorporateActionOption100.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#OptionType
	 * CorporateActionOption101.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#OptionType
	 * CorporateActionOption102.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#OptionType
	 * CorporateActionOption110.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#OptionType
	 * CorporateActionOption108.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#OptionType
	 * CorporateActionOption107.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#OptionType
	 * CorporateActionOption106.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#CorporateActionOptionType
	 * AggregateBalanceInformation26.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#CorporateActionOptionType
	 * AggregateBalanceInformation25.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#OptionType
	 * CorporateActionOption111.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#OptionType
	 * CorporateActionOption113.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#CorporateActionOptionType
	 * AggregateBalanceInformation28.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#CorporateActionOptionType
	 * AggregateBalanceInformation27.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#CorporateActionOptionType
	 * AggregateBalanceInformation30.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#CorporateActionOptionType
	 * AggregateBalanceInformation31.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#OptionType
	 * CorporateActionOption117.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#OptionType
	 * CorporateActionOption118.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#OptionType
	 * CorporateActionOption119.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#OptionType
	 * CorporateActionOption115.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#OptionType
	 * CorporateActionOption116.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#OptionType
	 * CorporateActionOption114.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#OptionType
	 * CorporateActionOption120.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#Code
	 * CorporateActionOption19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption19Choice#Proprietary
	 * CorporateActionOption19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#OptionType
	 * InstructedCorporateActionOption6.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#Code
	 * CorporateActionOption18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice#Proprietary
	 * CorporateActionOption18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#Code
	 * CorporateActionOption21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption21Choice#Proprietary
	 * CorporateActionOption21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#Code
	 * CorporateActionOption20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption20Choice#Proprietary
	 * CorporateActionOption20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#OptionType
	 * CorporateActionOption121.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#OptionType
	 * CorporateActionOption126.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#OptionType
	 * CorporateActionOption124.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#OptionType
	 * CorporateActionOption125.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#OptionType
	 * CorporateActionOption123.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#OptionType
	 * CorporateActionOption127.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption26Choice#Code
	 * CorporateActionOption26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption26Choice#Proprietary
	 * CorporateActionOption26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#OptionType
	 * InstructedCorporateActionOption7.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption23Choice#Code
	 * CorporateActionOption23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption23Choice#Proprietary
	 * CorporateActionOption23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption22Choice#Code
	 * CorporateActionOption22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption22Choice#Proprietary
	 * CorporateActionOption22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption25Choice#Code
	 * CorporateActionOption25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption25Choice#Proprietary
	 * CorporateActionOption25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#CorporateActionOptionType
	 * AggregateBalanceInformation32.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#CorporateActionOptionType
	 * AggregateBalanceInformation33.CorporateActionOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#OptionType
	 * CorporateActionOption128.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption29Choice#Code
	 * CorporateActionOption29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption29Choice#Proprietary
	 * CorporateActionOption29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#OptionType
	 * CorporateActionOption132.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#OptionType
	 * CorporateActionOption130.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#OptionType
	 * CorporateActionOption131.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#OptionType
	 * CorporateActionOption129.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#OptionType
	 * CorporateActionOption134.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#OptionType
	 * CorporateActionOption136.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#OptionType
	 * CorporateActionOption135.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#OptionType
	 * CorporateActionOption133.OptionType}</li>
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
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionOption4Choice.Code, com.tools20022.repository.choice.CorporateActionOption4Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption5.OptionType, com.tools20022.repository.choice.CorporateActionOption6Choice.Code, com.tools20022.repository.choice.CorporateActionOption6Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption13.OptionType, com.tools20022.repository.msg.CorporateActionOption25.OptionType, com.tools20022.repository.msg.CorporateActionOption30.OptionType,
					com.tools20022.repository.choice.CorporateActionOption12Choice.Code, com.tools20022.repository.choice.CorporateActionOption12Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption38.OptionType,
					com.tools20022.repository.choice.CorporateActionOption15Choice.Code, com.tools20022.repository.choice.CorporateActionOption15Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption47.OptionType,
					com.tools20022.repository.msg.CorporateActionOption57.OptionType, com.tools20022.repository.msg.CorporateActionOption58.OptionType, com.tools20022.repository.msg.CorporateActionOption6.OptionType,
					com.tools20022.repository.msg.CorporateActionOption21.OptionType, com.tools20022.repository.msg.CorporateActionOption42.OptionType, com.tools20022.repository.msg.CorporateActionOption28.OptionType,
					com.tools20022.repository.msg.CorporateActionOption43.OptionType, com.tools20022.repository.choice.CorporateActionOption5Choice.Code, com.tools20022.repository.choice.CorporateActionOption5Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption9.OptionType, com.tools20022.repository.choice.CorporateActionOption7Choice.Code, com.tools20022.repository.choice.CorporateActionOption7Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption18.OptionType, com.tools20022.repository.msg.CorporateActionOption22.OptionType, com.tools20022.repository.msg.CorporateActionOption27.OptionType,
					com.tools20022.repository.msg.CorporateActionOption26.OptionType, com.tools20022.repository.choice.CorporateActionOption13Choice.Code, com.tools20022.repository.choice.CorporateActionOption13Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption41.OptionType, com.tools20022.repository.choice.CorporateActionOption16Choice.Code, com.tools20022.repository.choice.CorporateActionOption16Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption50.OptionType, com.tools20022.repository.choice.CorporateActionOption2Choice.Code, com.tools20022.repository.choice.CorporateActionOption2Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption1.OptionType, com.tools20022.repository.choice.CorporateActionOption9Choice.Code, com.tools20022.repository.choice.CorporateActionOption9Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption2.OptionType, com.tools20022.repository.choice.CorporateActionOption10Choice.Code, com.tools20022.repository.choice.CorporateActionOption10Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.OptionType, com.tools20022.repository.choice.CorporateActionOption17Choice.Code, com.tools20022.repository.choice.CorporateActionOption17Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption5.OptionType, com.tools20022.repository.msg.CorporateActionOption29.OptionType, com.tools20022.repository.choice.CorporateActionOption3Choice.Code,
					com.tools20022.repository.choice.CorporateActionOption3Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption4.OptionType, com.tools20022.repository.choice.CorporateActionOption8Choice.Code,
					com.tools20022.repository.choice.CorporateActionOption8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption14.OptionType, com.tools20022.repository.msg.CorporateActionOption23.OptionType,
					com.tools20022.repository.msg.CorporateActionOption31.OptionType, com.tools20022.repository.choice.CorporateActionOption11Choice.Code, com.tools20022.repository.choice.CorporateActionOption11Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption37.OptionType, com.tools20022.repository.choice.CorporateActionOption14Choice.Code, com.tools20022.repository.choice.CorporateActionOption14Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption46.OptionType, com.tools20022.repository.msg.CorporateActionOption53.OptionType, com.tools20022.repository.msg.CorporateActionOption54.OptionType,
					com.tools20022.repository.msg.CorporateActionOption10.OptionType, com.tools20022.repository.msg.CorporateActionOption15.OptionType, com.tools20022.repository.msg.CorporateActionOption20.OptionType,
					com.tools20022.repository.msg.CorporateActionOption32.OptionType, com.tools20022.repository.msg.CorporateActionOption35.OptionType, com.tools20022.repository.msg.CorporateActionOption44.OptionType,
					com.tools20022.repository.msg.CorporateActionOption52.OptionType, com.tools20022.repository.msg.CorporateActionOption55.OptionType, com.tools20022.repository.msg.CorporateActionOption12.OptionType,
					com.tools20022.repository.msg.CorporateActionOption16.OptionType, com.tools20022.repository.msg.CorporateActionOption24.OptionType, com.tools20022.repository.msg.CorporateActionOption33.OptionType,
					com.tools20022.repository.msg.CorporateActionOption39.OptionType, com.tools20022.repository.msg.CorporateActionOption48.OptionType, com.tools20022.repository.msg.CorporateActionOption3.OptionType,
					com.tools20022.repository.msg.CorporateActionOption17.OptionType, com.tools20022.repository.msg.CorporateActionOption19.OptionType, com.tools20022.repository.msg.CorporateActionOption34.OptionType,
					com.tools20022.repository.msg.CorporateActionOption36.OptionType, com.tools20022.repository.msg.CorporateActionOption45.OptionType, com.tools20022.repository.msg.CorporateActionOption51.OptionType,
					com.tools20022.repository.msg.CorporateActionOption56.OptionType, com.tools20022.repository.msg.AggregateBalanceInformation8.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation11.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation13.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation15.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation17.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation19.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation22.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation23.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation9.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation10.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation12.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation14.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation16.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation18.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation21.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation24.CorporateActionOptionType, com.tools20022.repository.choice.CorporateActionOption1FormatChoice.Code,
					com.tools20022.repository.choice.CorporateActionOption1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateAction2.DefaultOptionType, com.tools20022.repository.msg.CorporateActionOption1.OptionType,
					com.tools20022.repository.msg.SecuritiesAccount9.OptionType, com.tools20022.repository.msg.CorporateActionElection3.OptionType, com.tools20022.repository.msg.CorporateActionElection1.OptionType,
					com.tools20022.repository.msg.CorporateActionElection2.OptionType, com.tools20022.repository.msg.EntitlementAdvice1.OptionType, com.tools20022.repository.msg.GlobalDistributionRequest1.OptionType,
					com.tools20022.repository.msg.CorporateActionMovement1.OptionType, com.tools20022.repository.msg.SecuritiesAccount8.OptionType, com.tools20022.repository.msg.CorporateActionOption2.OptionType,
					com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1.OptionType, com.tools20022.repository.msg.CorporateActionOption7.OptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation20.CorporateActionOptionType, com.tools20022.repository.msg.CorporateActionOption11.OptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation6.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation7.CorporateActionOptionType,
					com.tools20022.repository.msg.CorporateActionOption103.OptionType, com.tools20022.repository.msg.CorporateActionOption100.OptionType, com.tools20022.repository.msg.CorporateActionOption101.OptionType,
					com.tools20022.repository.msg.CorporateActionOption102.OptionType, com.tools20022.repository.msg.CorporateActionOption110.OptionType, com.tools20022.repository.msg.CorporateActionOption108.OptionType,
					com.tools20022.repository.msg.CorporateActionOption107.OptionType, com.tools20022.repository.msg.CorporateActionOption106.OptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation26.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation25.CorporateActionOptionType,
					com.tools20022.repository.msg.CorporateActionOption111.OptionType, com.tools20022.repository.msg.CorporateActionOption113.OptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation28.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation27.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation30.CorporateActionOptionType, com.tools20022.repository.msg.AggregateBalanceInformation31.CorporateActionOptionType,
					com.tools20022.repository.msg.CorporateActionOption117.OptionType, com.tools20022.repository.msg.CorporateActionOption118.OptionType, com.tools20022.repository.msg.CorporateActionOption119.OptionType,
					com.tools20022.repository.msg.CorporateActionOption115.OptionType, com.tools20022.repository.msg.CorporateActionOption116.OptionType, com.tools20022.repository.msg.CorporateActionOption114.OptionType,
					com.tools20022.repository.msg.CorporateActionOption120.OptionType, com.tools20022.repository.choice.CorporateActionOption19Choice.Code, com.tools20022.repository.choice.CorporateActionOption19Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption6.OptionType, com.tools20022.repository.choice.CorporateActionOption18Choice.Code, com.tools20022.repository.choice.CorporateActionOption18Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionOption21Choice.Code, com.tools20022.repository.choice.CorporateActionOption21Choice.Proprietary, com.tools20022.repository.choice.CorporateActionOption20Choice.Code,
					com.tools20022.repository.choice.CorporateActionOption20Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption121.OptionType, com.tools20022.repository.msg.CorporateActionOption126.OptionType,
					com.tools20022.repository.msg.CorporateActionOption124.OptionType, com.tools20022.repository.msg.CorporateActionOption125.OptionType, com.tools20022.repository.msg.CorporateActionOption123.OptionType,
					com.tools20022.repository.msg.CorporateActionOption127.OptionType, com.tools20022.repository.choice.CorporateActionOption26Choice.Code, com.tools20022.repository.choice.CorporateActionOption26Choice.Proprietary,
					com.tools20022.repository.msg.InstructedCorporateActionOption7.OptionType, com.tools20022.repository.choice.CorporateActionOption23Choice.Code, com.tools20022.repository.choice.CorporateActionOption23Choice.Proprietary,
					com.tools20022.repository.choice.CorporateActionOption22Choice.Code, com.tools20022.repository.choice.CorporateActionOption22Choice.Proprietary, com.tools20022.repository.choice.CorporateActionOption25Choice.Code,
					com.tools20022.repository.choice.CorporateActionOption25Choice.Proprietary, com.tools20022.repository.msg.AggregateBalanceInformation32.CorporateActionOptionType,
					com.tools20022.repository.msg.AggregateBalanceInformation33.CorporateActionOptionType, com.tools20022.repository.msg.CorporateActionOption128.OptionType,
					com.tools20022.repository.choice.CorporateActionOption29Choice.Code, com.tools20022.repository.choice.CorporateActionOption29Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption132.OptionType,
					com.tools20022.repository.msg.CorporateActionOption130.OptionType, com.tools20022.repository.msg.CorporateActionOption131.OptionType, com.tools20022.repository.msg.CorporateActionOption129.OptionType,
					com.tools20022.repository.msg.CorporateActionOption134.OptionType, com.tools20022.repository.msg.CorporateActionOption136.OptionType, com.tools20022.repository.msg.CorporateActionOption135.OptionType,
					com.tools20022.repository.msg.CorporateActionOption133.OptionType);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Treatment of the fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType2Choice#Code
	 * FractionDispositionType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType2Choice#Proprietary
	 * FractionDispositionType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#FractionDisposition
	 * CorporateActionOption5.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType8Choice#Code
	 * FractionDispositionType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType8Choice#Proprietary
	 * FractionDispositionType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#FractionDisposition
	 * CorporateActionOption13.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType10Choice#Code
	 * FractionDispositionType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType10Choice#Proprietary
	 * FractionDispositionType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#FractionDisposition
	 * CorporateActionOption25.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType11Choice#Code
	 * FractionDispositionType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType11Choice#Proprietary
	 * FractionDispositionType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#FractionDisposition
	 * CorporateActionOption30.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#FractionDisposition
	 * CorporateActionOption38.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#FractionDisposition
	 * CorporateActionOption47.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType17Choice#Code
	 * FractionDispositionType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType17Choice#Proprietary
	 * FractionDispositionType17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#FractionDisposition
	 * CorporateActionOption57.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType18Choice#Code
	 * FractionDispositionType18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType18Choice#Proprietary
	 * FractionDispositionType18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#FractionDisposition
	 * CorporateActionOption58.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice#Code
	 * FractionDispositionType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice#Proprietary
	 * FractionDispositionType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType4Choice#Code
	 * FractionDispositionType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType4Choice#Proprietary
	 * FractionDispositionType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#FractionDisposition
	 * SecuritiesOption3.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#FractionDisposition
	 * CorporateActionOption4.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice#Code
	 * FractionDispositionType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice#Proprietary
	 * FractionDispositionType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType7Choice#Code
	 * FractionDispositionType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType7Choice#Proprietary
	 * FractionDispositionType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#FractionDisposition
	 * SecuritiesOption8.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#FractionDisposition
	 * CorporateActionOption14.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType12Choice#Code
	 * FractionDispositionType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType12Choice#Proprietary
	 * FractionDispositionType12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#FractionDisposition
	 * SecuritiesOption18.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#FractionDisposition
	 * CorporateActionOption23.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType13Choice#Code
	 * FractionDispositionType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType13Choice#Proprietary
	 * FractionDispositionType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#FractionDisposition
	 * SecuritiesOption20.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#FractionDisposition
	 * CorporateActionOption31.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#FractionDisposition
	 * SecuritiesOption26.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#FractionDisposition
	 * CorporateActionOption37.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#FractionDisposition
	 * SecuritiesOption31.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#FractionDisposition
	 * CorporateActionOption46.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice#Code
	 * FractionDispositionType23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType23Choice#Proprietary
	 * FractionDispositionType23Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#FractionDisposition
	 * SecuritiesOption35.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#FractionDisposition
	 * CorporateActionOption53.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice#Code
	 * FractionDispositionType24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType24Choice#Proprietary
	 * FractionDispositionType24Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#FractionDisposition
	 * SecuritiesOption36.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#FractionDisposition
	 * CorporateActionOption54.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#FractionDisposition
	 * SecuritiesOption4.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#FractionDisposition
	 * CorporateActionOption10.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#FractionDisposition
	 * SecuritiesOption10.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#FractionDisposition
	 * CorporateActionOption15.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#FractionDisposition
	 * SecuritiesOption13.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#FractionDisposition
	 * CorporateActionOption20.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#FractionDisposition
	 * SecuritiesOption17.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#FractionDisposition
	 * CorporateActionOption32.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#FractionDisposition
	 * SecuritiesOption24.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#FractionDisposition
	 * CorporateActionOption35.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#FractionDisposition
	 * SecuritiesOption29.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#FractionDisposition
	 * CorporateActionOption44.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice#Code
	 * FractionDispositionType19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType19Choice#Proprietary
	 * FractionDispositionType19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#FractionDisposition
	 * SecuritiesOption33.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#FractionDisposition
	 * SecuritiesOption38.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#FractionDisposition
	 * CorporateActionOption52.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice#Code
	 * FractionDispositionType20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType20Choice#Proprietary
	 * FractionDispositionType20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#FractionDisposition
	 * SecuritiesOption37.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#FractionDisposition
	 * SecuritiesOption39.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#FractionDisposition
	 * CorporateActionOption55.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType3Choice#Code
	 * FractionDispositionType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType3Choice#Proprietary
	 * FractionDispositionType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#FractionDisposition
	 * FinancialInstrumentAttributes3.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#FractionDisposition
	 * SecuritiesOption6.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#FractionDisposition
	 * CorporateActionOption3.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType5Choice#Code
	 * FractionDispositionType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType5Choice#Proprietary
	 * FractionDispositionType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#FractionDisposition
	 * FinancialInstrumentAttributes12.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#FractionDisposition
	 * SecuritiesOption12.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#FractionDisposition
	 * CorporateActionOption17.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType9Choice#Code
	 * FractionDispositionType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType9Choice#Proprietary
	 * FractionDispositionType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#FractionDisposition
	 * FinancialInstrumentAttributes17.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#FractionDisposition
	 * SecuritiesOption14.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#FractionDisposition
	 * CorporateActionOption19.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType14Choice#Code
	 * FractionDispositionType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType14Choice#Proprietary
	 * FractionDispositionType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#FractionDisposition
	 * FinancialInstrumentAttributes25.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#FractionDisposition
	 * SecuritiesOption22.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#FractionDisposition
	 * CorporateActionOption34.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#FractionDisposition
	 * SecuritiesOption25.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#FractionDisposition
	 * CorporateActionOption36.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#FractionDisposition
	 * SecuritiesOption30.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#FractionDisposition
	 * CorporateActionOption45.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType15Choice#Code
	 * FractionDispositionType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType15Choice#Proprietary
	 * FractionDispositionType15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#FractionDisposition
	 * FinancialInstrumentAttributes46.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#FractionDisposition
	 * CorporateActionOption51.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType16Choice#Code
	 * FractionDispositionType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType16Choice#Proprietary
	 * FractionDispositionType16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#FractionDisposition
	 * FinancialInstrumentAttributes47.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#FractionDisposition
	 * CorporateActionOption56.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#Code
	 * FractionDispositionType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1FormatChoice#Proprietary
	 * FractionDispositionType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#FractionDisposition
	 * SecurityOption1.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#FractionDisposition
	 * CorporateActionOption1.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#FractionDisposition
	 * CorporateActionOption103.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#FractionDisposition
	 * CorporateActionOption100.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#FractionDisposition
	 * CorporateActionOption101.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#FractionDisposition
	 * CorporateActionOption102.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#FractionDisposition
	 * SecuritiesOption42.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#FractionDisposition
	 * SecuritiesOption40.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#FractionDisposition
	 * CorporateActionOption110.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#FractionDisposition
	 * CorporateActionOption108.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#FractionDisposition
	 * CorporateActionOption107.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#FractionDisposition
	 * CorporateActionOption106.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#FractionDisposition
	 * SecuritiesOption48.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#FractionDisposition
	 * SecuritiesOption45.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#FractionDisposition
	 * CorporateActionOption111.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#FractionDisposition
	 * CorporateActionOption113.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#FractionDisposition
	 * CorporateActionOption117.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#FractionDisposition
	 * CorporateActionOption118.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#FractionDisposition
	 * CorporateActionOption115.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#FractionDisposition
	 * CorporateActionOption114.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#FractionDisposition
	 * FinancialInstrumentAttributes68.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#Code
	 * FractionDispositionType25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice#Proprietary
	 * FractionDispositionType25Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#Code
	 * FractionDispositionType27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType27Choice#Proprietary
	 * FractionDispositionType27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#FractionDisposition
	 * SecuritiesOption49.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#Code
	 * FractionDispositionType26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice#Proprietary
	 * FractionDispositionType26Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#Code
	 * FractionDispositionType28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType28Choice#Proprietary
	 * FractionDispositionType28Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#FractionDisposition
	 * SecuritiesOption50.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#FractionDisposition
	 * CorporateActionOption124.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#FractionDisposition
	 * CorporateActionOption125.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#FractionDisposition
	 * CorporateActionOption123.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#FractionDisposition
	 * FinancialInstrumentAttributes73.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#FractionDisposition
	 * CorporateActionOption127.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType30Choice#Code
	 * FractionDispositionType30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType30Choice#Proprietary
	 * FractionDispositionType30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#FractionDisposition
	 * SecuritiesOption55.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType29Choice#Code
	 * FractionDispositionType29Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType29Choice#Proprietary
	 * FractionDispositionType29Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#FractionDisposition
	 * SecuritiesOption57.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType31Choice#Code
	 * FractionDispositionType31Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType31Choice#Proprietary
	 * FractionDispositionType31Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType32Choice#Code
	 * FractionDispositionType32Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType32Choice#Proprietary
	 * FractionDispositionType32Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#FractionDisposition
	 * CorporateActionOption132.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#FractionDisposition
	 * CorporateActionOption130.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#FractionDisposition
	 * CorporateActionOption131.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#FractionDisposition
	 * CorporateActionOption129.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#FractionDisposition
	 * SecuritiesOption60.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#FractionDisposition
	 * SecuritiesOption59.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#FractionDisposition
	 * CorporateActionOption134.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#FractionDisposition
	 * CorporateActionOption136.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#FractionDisposition
	 * CorporateActionOption135.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#FractionDisposition
	 * CorporateActionOption133.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#FractionDisposition
	 * SecuritiesOption61.FractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#FractionDisposition
	 * SecuritiesOption63.FractionDisposition}</li>
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
	public static final MMBusinessAttribute FractionDisposition = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FractionDispositionType2Choice.Code, com.tools20022.repository.choice.FractionDispositionType2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption5.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType8Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption13.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType10Choice.Code, com.tools20022.repository.choice.FractionDispositionType10Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption25.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType11Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType11Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption30.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption38.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption47.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType17Choice.Code, com.tools20022.repository.choice.FractionDispositionType17Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption57.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType18Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType18Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption58.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType1Choice.Code, com.tools20022.repository.choice.FractionDispositionType1Choice.Proprietary, com.tools20022.repository.choice.FractionDispositionType4Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType4Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption3.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption4.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType6Choice.Code, com.tools20022.repository.choice.FractionDispositionType6Choice.Proprietary, com.tools20022.repository.choice.FractionDispositionType7Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType7Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption8.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption14.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType12Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType12Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption18.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption23.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType13Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType13Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption20.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption31.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption26.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption37.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption31.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption46.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType23Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType23Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption35.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption53.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType24Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType24Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption36.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption54.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption4.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption10.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption10.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption15.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption13.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption20.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption17.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption32.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption24.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption35.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption29.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption44.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType19Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType19Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption33.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption38.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption52.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType20Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType20Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption37.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption39.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption55.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType3Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType3Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes3.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption6.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption3.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType5Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType5Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes12.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption12.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption17.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType9Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType9Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes17.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption14.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption19.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType14Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType14Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes25.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption22.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption34.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption25.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption36.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption30.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption45.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType15Choice.Code, com.tools20022.repository.choice.FractionDispositionType15Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption51.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType16Choice.Code, com.tools20022.repository.choice.FractionDispositionType16Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption56.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType1FormatChoice.Code, com.tools20022.repository.choice.FractionDispositionType1FormatChoice.Proprietary,
					com.tools20022.repository.msg.SecurityOption1.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption1.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption103.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption100.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption101.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption102.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption42.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption40.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption110.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption108.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption107.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption106.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption48.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption45.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption111.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption113.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption117.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption118.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption115.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption114.FractionDisposition, com.tools20022.repository.msg.FinancialInstrumentAttributes68.FractionDisposition,
					com.tools20022.repository.choice.FractionDispositionType25Choice.Code, com.tools20022.repository.choice.FractionDispositionType25Choice.Proprietary, com.tools20022.repository.choice.FractionDispositionType27Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType27Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption49.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType26Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType26Choice.Proprietary, com.tools20022.repository.choice.FractionDispositionType28Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType28Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption50.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption124.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption125.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption123.FractionDisposition, com.tools20022.repository.msg.FinancialInstrumentAttributes73.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption127.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType30Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType30Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption55.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType29Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType29Choice.Proprietary, com.tools20022.repository.msg.SecuritiesOption57.FractionDisposition, com.tools20022.repository.choice.FractionDispositionType31Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType31Choice.Proprietary, com.tools20022.repository.choice.FractionDispositionType32Choice.Code,
					com.tools20022.repository.choice.FractionDispositionType32Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption132.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption130.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption131.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption129.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption60.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption59.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption134.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption136.FractionDisposition,
					com.tools20022.repository.msg.CorporateActionOption135.FractionDisposition, com.tools20022.repository.msg.CorporateActionOption133.FractionDisposition,
					com.tools20022.repository.msg.SecuritiesOption61.FractionDisposition, com.tools20022.repository.msg.SecuritiesOption63.FractionDisposition);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}
	};
	/**
	 * Currency choice given to the investor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#CurrencyOption
	 * CorporateActionOption5.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#CurrencyOption
	 * CorporateActionOption13.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#CurrencyOption
	 * CorporateActionOption25.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#CurrencyOption
	 * CorporateActionOption30.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#CurrencyOption
	 * CorporateActionOption38.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#CurrencyOption
	 * CorporateActionOption47.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#CurrencyOption
	 * CorporateActionOption57.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#CurrencyOption
	 * CorporateActionOption58.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#CurrencyOption
	 * SecuritiesOption3.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#CurrencyOption
	 * CorporateActionOption4.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#CurrencyOption
	 * SecuritiesOption8.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#CurrencyOption
	 * CorporateActionOption14.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#CurrencyOption
	 * SecuritiesOption18.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#CurrencyOption
	 * CorporateActionOption23.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#CurrencyOption
	 * SecuritiesOption20.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#CurrencyOption
	 * CorporateActionOption31.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#CurrencyOption
	 * SecuritiesOption26.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#CurrencyOption
	 * CorporateActionOption37.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#CurrencyOption
	 * SecuritiesOption31.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#CurrencyOption
	 * CorporateActionOption46.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#CurrencyOption
	 * SecuritiesOption35.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#CurrencyOption
	 * CorporateActionOption53.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#CurrencyOption
	 * SecuritiesOption36.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#CurrencyOption
	 * CorporateActionOption54.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#CurrencyOption
	 * SecuritiesOption4.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#CurrencyOption
	 * CorporateActionOption10.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#CurrencyOption
	 * SecuritiesOption10.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#CurrencyOption
	 * CorporateActionOption15.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#CurrencyOption
	 * SecuritiesOption13.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#CurrencyOption
	 * CorporateActionOption20.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#CurrencyOption
	 * SecuritiesOption17.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#CurrencyOption
	 * CorporateActionOption32.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#CurrencyOption
	 * SecuritiesOption24.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#CurrencyOption
	 * CorporateActionOption35.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#CurrencyOption
	 * SecuritiesOption29.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#CurrencyOption
	 * CorporateActionOption44.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33#CurrencyOption
	 * SecuritiesOption33.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#CurrencyOption
	 * SecuritiesOption38.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#CurrencyOption
	 * CorporateActionOption52.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37#CurrencyOption
	 * SecuritiesOption37.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#CurrencyOption
	 * SecuritiesOption39.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#CurrencyOption
	 * CorporateActionOption55.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption6#CurrencyOption
	 * SecuritiesOption6.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#CurrencyOption
	 * CorporateActionOption3.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption12#CurrencyOption
	 * SecuritiesOption12.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#CurrencyOption
	 * CorporateActionOption17.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption14#CurrencyOption
	 * SecuritiesOption14.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#CurrencyOption
	 * CorporateActionOption19.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption22#CurrencyOption
	 * SecuritiesOption22.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#CurrencyOption
	 * CorporateActionOption34.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25#CurrencyOption
	 * SecuritiesOption25.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#CurrencyOption
	 * CorporateActionOption36.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#CurrencyOption
	 * SecuritiesOption30.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#CurrencyOption
	 * CorporateActionOption45.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#CurrencyOption
	 * CorporateActionOption51.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#CurrencyOption
	 * CorporateActionOption56.CurrencyOption}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#Currency
	 * CashOption1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#CurrencyOption
	 * CorporateActionOption103.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#CurrencyOption
	 * CorporateActionOption100.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#CurrencyOption
	 * CorporateActionOption101.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#CurrencyOption
	 * CorporateActionOption102.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#CurrencyOption
	 * SecuritiesOption42.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#CurrencyOption
	 * SecuritiesOption40.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#CurrencyOption
	 * CorporateActionOption110.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#CurrencyOption
	 * CorporateActionOption108.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#CurrencyOption
	 * CorporateActionOption107.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#CurrencyOption
	 * CorporateActionOption106.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#CurrencyOption
	 * SecuritiesOption48.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#CurrencyOption
	 * SecuritiesOption45.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#CurrencyOption
	 * CorporateActionOption111.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#CurrencyOption
	 * CorporateActionOption113.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#CurrencyOption
	 * CorporateActionOption117.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#CurrencyOption
	 * CorporateActionOption118.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#CurrencyOption
	 * CorporateActionOption115.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#CurrencyOption
	 * CorporateActionOption114.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#CurrencyOption
	 * SecuritiesOption49.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#CurrencyOption
	 * SecuritiesOption50.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#CurrencyOption
	 * CorporateActionOption124.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#CurrencyOption
	 * CorporateActionOption125.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#CurrencyOption
	 * CorporateActionOption123.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#CurrencyOption
	 * CorporateActionOption127.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#CurrencyOption
	 * SecuritiesOption55.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#CurrencyOption
	 * SecuritiesOption57.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#CurrencyOption
	 * CorporateActionOption132.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#CurrencyOption
	 * CorporateActionOption130.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#CurrencyOption
	 * CorporateActionOption131.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#CurrencyOption
	 * CorporateActionOption129.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#CurrencyOption
	 * SecuritiesOption60.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#CurrencyOption
	 * SecuritiesOption59.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#CurrencyOption
	 * CorporateActionOption134.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#CurrencyOption
	 * CorporateActionOption136.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#CurrencyOption
	 * CorporateActionOption135.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#CurrencyOption
	 * CorporateActionOption133.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#CurrencyOption
	 * SecuritiesOption61.CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#CurrencyOption
	 * SecuritiesOption63.CurrencyOption}</li>
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
	public static final MMBusinessAttribute CurrencyOption = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption13.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption25.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption30.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption38.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption47.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption57.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption58.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption3.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption4.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption8.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption14.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption18.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption23.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption20.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption31.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption26.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption37.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption31.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption46.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption35.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption53.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption36.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption54.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption4.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption10.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption10.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption15.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption13.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption20.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption17.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption32.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption24.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption35.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption29.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption44.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption33.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption38.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption52.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption37.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption39.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption55.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption6.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption3.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption12.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption17.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption14.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption19.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption22.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption34.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption25.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption36.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption30.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption45.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption51.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption56.CurrencyOption,
					com.tools20022.repository.msg.CashOption1.Currency, com.tools20022.repository.msg.CorporateActionOption103.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption100.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption101.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption102.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption42.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption40.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption110.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption108.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption107.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption106.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption48.CurrencyOption,
					com.tools20022.repository.msg.SecuritiesOption45.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption111.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption113.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption117.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption118.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption115.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption114.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption49.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption50.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption124.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption125.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption123.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption127.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption55.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption57.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption132.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption130.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption131.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption129.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption60.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption59.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption134.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption136.CurrencyOption, com.tools20022.repository.msg.CorporateActionOption135.CurrencyOption,
					com.tools20022.repository.msg.CorporateActionOption133.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption61.CurrencyOption, com.tools20022.repository.msg.SecuritiesOption63.CurrencyOption);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action for which one or more options are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#CorporateActionOptionDefinition
	 * ChoiceCorporateAction.CorporateActionOptionDefinition}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#RateAndAmountDetails
	 * CorporateActionOption5.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#RateAndAmountDetails
	 * CorporateActionOption13.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#RateAndAmountDetails
	 * CorporateActionOption25.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#RateAndAmountDetails
	 * CorporateActionOption30.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#RateAndAmountDetails
	 * CorporateActionOption38.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#RateAndAmountDetails
	 * CorporateActionOption47.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#RateAndAmountDetails
	 * CorporateActionOption57.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#RateAndAmountDetails
	 * CorporateActionOption58.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#AmountDetails
	 * CashOption2.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#DateDetails
	 * CashOption2.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#DateDetails
	 * CorporateActionOption4.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#PeriodDetails
	 * CorporateActionOption4.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#RateAndAmountDetails
	 * CorporateActionOption4.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#AmountDetails
	 * CashOption9.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#DateDetails
	 * CashOption9.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#DateDetails
	 * CorporateActionOption14.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#PeriodDetails
	 * CorporateActionOption14.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#RateAndAmountDetails
	 * CorporateActionOption14.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#AmountDetails
	 * CashOption12.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#DateDetails
	 * CashOption12.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#RateAndAmountDetails
	 * CashOption12.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#DateDetails
	 * CorporateActionOption23.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#PeriodDetails
	 * CorporateActionOption23.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#RateAndAmountDetails
	 * CorporateActionOption23.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#AmountDetails
	 * CashOption13.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#DateDetails
	 * CashOption13.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#RateAndAmountDetails
	 * CashOption13.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#DateDetails
	 * CorporateActionOption31.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#PeriodDetails
	 * CorporateActionOption31.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#RateAndAmountDetails
	 * CorporateActionOption31.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#AmountDetails
	 * CashOption18.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#DateDetails
	 * CashOption18.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#RateAndAmountDetails
	 * CashOption18.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#DateDetails
	 * CorporateActionOption37.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#PeriodDetails
	 * CorporateActionOption37.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#RateAndAmountDetails
	 * CorporateActionOption37.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#AmountDetails
	 * CashOption22.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#DateDetails
	 * CashOption22.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#RateAndAmountDetails
	 * CashOption22.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#DateDetails
	 * CorporateActionOption46.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#PeriodDetails
	 * CorporateActionOption46.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#RateAndAmountDetails
	 * CorporateActionOption46.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#AmountDetails
	 * CashOption26.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#DateDetails
	 * CashOption26.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#RateAndAmountDetails
	 * CashOption26.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#DateDetails
	 * CorporateActionOption53.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#PeriodDetails
	 * CorporateActionOption53.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#RateAndAmountDetails
	 * CorporateActionOption53.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#AmountDetails
	 * CashOption27.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#DateDetails
	 * CashOption27.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#RateAndAmountDetails
	 * CashOption27.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#DateDetails
	 * CorporateActionOption54.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#PeriodDetails
	 * CorporateActionOption54.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#RateAndAmountDetails
	 * CorporateActionOption54.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption3#AmountDetails
	 * CashOption3.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption3#DateDetails
	 * CashOption3.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#DateDetails
	 * CorporateActionOption10.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#PeriodDetails
	 * CorporateActionOption10.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#RateAndAmountDetails
	 * CorporateActionOption10.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption6#AmountDetails
	 * CashOption6.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption6#DateDetails
	 * CashOption6.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#DateDetails
	 * CorporateActionOption15.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#PeriodDetails
	 * CorporateActionOption15.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#RateAndAmountDetails
	 * CorporateActionOption15.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#AmountDetails
	 * CashOption11.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#DateDetails
	 * CashOption11.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption11#RateAndAmountDetails
	 * CashOption11.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#DateDetails
	 * CorporateActionOption20.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#PeriodDetails
	 * CorporateActionOption20.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#RateAndAmountDetails
	 * CorporateActionOption20.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#AmountDetails
	 * CashOption14.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption14#DateDetails
	 * CashOption14.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption14#RateAndAmountDetails
	 * CashOption14.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#DateDetails
	 * CorporateActionOption32.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#PeriodDetails
	 * CorporateActionOption32.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#RateAndAmountDetails
	 * CorporateActionOption32.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#AmountDetails
	 * CashOption16.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption16#DateDetails
	 * CashOption16.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption16#RateAndAmountDetails
	 * CashOption16.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#DateDetails
	 * CorporateActionOption35.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#PeriodDetails
	 * CorporateActionOption35.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#RateAndAmountDetails
	 * CorporateActionOption35.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#AmountDetails
	 * CashOption20.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption20#DateDetails
	 * CashOption20.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption20#RateAndAmountDetails
	 * CashOption20.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#DateDetails
	 * CorporateActionOption44.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#PeriodDetails
	 * CorporateActionOption44.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#RateAndAmountDetails
	 * CorporateActionOption44.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#AmountDetails
	 * CashOption25.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption25#DateDetails
	 * CashOption25.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption25#RateAndAmountDetails
	 * CashOption25.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#DateDetails
	 * CorporateActionOption52.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#PeriodDetails
	 * CorporateActionOption52.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#RateAndAmountDetails
	 * CorporateActionOption52.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#AmountDetails
	 * CashOption28.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption28#DateDetails
	 * CashOption28.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption28#RateAndAmountDetails
	 * CashOption28.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#DateDetails
	 * CorporateActionOption55.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#PeriodDetails
	 * CorporateActionOption55.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#RateAndAmountDetails
	 * CorporateActionOption55.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption4#AmountDetails
	 * CashOption4.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption4#DateDetails
	 * CashOption4.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#DateDetails
	 * CorporateActionOption3.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#PeriodDetails
	 * CorporateActionOption3.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#RateAndAmountDetails
	 * CorporateActionOption3.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption8#AmountDetails
	 * CashOption8.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption8#DateDetails
	 * CashOption8.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#DateDetails
	 * CorporateActionOption17.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#PeriodDetails
	 * CorporateActionOption17.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#RateAndAmountDetails
	 * CorporateActionOption17.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#AmountDetails
	 * CashOption10.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption10#DateDetails
	 * CashOption10.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption10#RateAndAmountDetails
	 * CashOption10.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#DateDetails
	 * CorporateActionOption19.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#PeriodDetails
	 * CorporateActionOption19.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#RateAndAmountDetails
	 * CorporateActionOption19.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#AmountDetails
	 * CashOption15.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption15#DateDetails
	 * CashOption15.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption15#RateAndAmountDetails
	 * CashOption15.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#DateDetails
	 * CorporateActionOption34.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#PeriodDetails
	 * CorporateActionOption34.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#RateAndAmountDetails
	 * CorporateActionOption34.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#AmountDetails
	 * CashOption17.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption17#DateDetails
	 * CashOption17.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption17#RateAndAmountDetails
	 * CashOption17.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#DateDetails
	 * CorporateActionOption36.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#PeriodDetails
	 * CorporateActionOption36.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#RateAndAmountDetails
	 * CorporateActionOption36.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#AmountDetails
	 * CashOption21.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption21#DateDetails
	 * CashOption21.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption21#RateAndAmountDetails
	 * CashOption21.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#DateDetails
	 * CorporateActionOption45.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#PeriodDetails
	 * CorporateActionOption45.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#RateAndAmountDetails
	 * CorporateActionOption45.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#AmountDetails
	 * CashOption24.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption24#DateDetails
	 * CashOption24.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption24#RateAndAmountDetails
	 * CashOption24.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#DateDetails
	 * CorporateActionOption51.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#PeriodDetails
	 * CorporateActionOption51.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#RateAndAmountDetails
	 * CorporateActionOption51.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#AmountDetails
	 * CashOption29.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption29#DateDetails
	 * CashOption29.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption29#RateAndAmountDetails
	 * CashOption29.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#DateDetails
	 * CorporateActionOption56.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#PeriodDetails
	 * CorporateActionOption56.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#RateAndAmountDetails
	 * CorporateActionOption56.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#DateDetails
	 * CashOption1.DateDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption1#AmountDetails
	 * CashOption1.AmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#DateDetails
	 * CorporateActionOption1.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#RateAndAmountDetails
	 * CorporateActionOption1.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#PeriodDetails
	 * CorporateActionOption1.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#RateAndAmountDetails
	 * CorporateActionOption103.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#DateDetails
	 * CorporateActionOption100.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#PeriodDetails
	 * CorporateActionOption100.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#RateAndAmountDetails
	 * CorporateActionOption100.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#DateDetails
	 * CorporateActionOption101.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#PeriodDetails
	 * CorporateActionOption101.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#RateAndAmountDetails
	 * CorporateActionOption101.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#DateDetails
	 * CorporateActionOption102.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#PeriodDetails
	 * CorporateActionOption102.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#RateAndAmountDetails
	 * CorporateActionOption102.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#AmountDetails
	 * CashOption30.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#DateDetails
	 * CashOption30.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#RateAndAmountDetails
	 * CashOption30.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#AmountDetails
	 * CashOption31.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption31#DateDetails
	 * CashOption31.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption31#RateAndAmountDetails
	 * CashOption31.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#AmountDetails
	 * CashOption32.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption32#DateDetails
	 * CashOption32.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption32#RateAndAmountDetails
	 * CashOption32.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#DateDetails
	 * CorporateActionOption110.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#PeriodDetails
	 * CorporateActionOption110.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#RateAndAmountDetails
	 * CorporateActionOption110.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#DateDetails
	 * CorporateActionOption108.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#PeriodDetails
	 * CorporateActionOption108.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#RateAndAmountDetails
	 * CorporateActionOption108.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#RateAndAmountDetails
	 * CorporateActionOption107.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#DateDetails
	 * CorporateActionOption106.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#PeriodDetails
	 * CorporateActionOption106.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#RateAndAmountDetails
	 * CorporateActionOption106.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#AmountDetails
	 * CashOption36.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption36#DateDetails
	 * CashOption36.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption36#RateAndAmountDetails
	 * CashOption36.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#AmountDetails
	 * CashOption35.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption35#DateDetails
	 * CashOption35.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption35#RateAndAmountDetails
	 * CashOption35.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#AmountDetails
	 * CashOption38.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#DateDetails
	 * CashOption38.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#RateAndAmountDetails
	 * CashOption38.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#DateDetails
	 * CorporateActionOption111.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#PeriodDetails
	 * CorporateActionOption111.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#RateAndAmountDetails
	 * CorporateActionOption111.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#AmountDetails
	 * CashOption39.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#DateDetails
	 * CashOption39.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#RateAndAmountDetails
	 * CashOption39.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#DateDetails
	 * CorporateActionOption113.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#PeriodDetails
	 * CorporateActionOption113.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#RateAndAmountDetails
	 * CorporateActionOption113.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#AmountDetails
	 * CashOption41.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#DateDetails
	 * CashOption41.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#RateAndAmountDetails
	 * CashOption41.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#DateDetails
	 * CorporateActionOption117.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#PeriodDetails
	 * CorporateActionOption117.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#RateAndAmountDetails
	 * CorporateActionOption117.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#RateAndAmountDetails
	 * CorporateActionOption118.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#DateDetails
	 * CorporateActionOption115.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#PeriodDetails
	 * CorporateActionOption115.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#RateAndAmountDetails
	 * CorporateActionOption115.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#DateDetails
	 * CorporateActionOption114.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#PeriodDetails
	 * CorporateActionOption114.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#RateAndAmountDetails
	 * CorporateActionOption114.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#AmountDetails
	 * CashOption44.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#DateDetails
	 * CashOption44.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#RateAndAmountDetails
	 * CashOption44.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#AmountDetails
	 * CashOption42.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption42#DateDetails
	 * CashOption42.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption42#RateAndAmountDetails
	 * CashOption42.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#AmountDetails
	 * CashOption43.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption43#DateDetails
	 * CashOption43.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption43#RateAndAmountDetails
	 * CashOption43.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#DateDetails
	 * CorporateActionOption124.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#PeriodDetails
	 * CorporateActionOption124.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#RateAndAmountDetails
	 * CorporateActionOption124.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#DateDetails
	 * CorporateActionOption125.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#PeriodDetails
	 * CorporateActionOption125.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#RateAndAmountDetails
	 * CorporateActionOption125.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#RateAndAmountDetails
	 * CorporateActionOption123.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#DateDetails
	 * CorporateActionOption127.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#PeriodDetails
	 * CorporateActionOption127.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#RateAndAmountDetails
	 * CorporateActionOption127.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#AmountDetails
	 * CashOption46.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#DateDetails
	 * CashOption46.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#RateAndAmountDetails
	 * CashOption46.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#AmountDetails
	 * CashOption49.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption49#DateDetails
	 * CashOption49.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption49#RateAndAmountDetails
	 * CashOption49.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#AmountDetails
	 * CashOption47.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption47#DateDetails
	 * CashOption47.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption47#RateAndAmountDetails
	 * CashOption47.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#DateDetails
	 * CorporateActionOption132.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#PeriodDetails
	 * CorporateActionOption132.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#RateAndAmountDetails
	 * CorporateActionOption132.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#DateDetails
	 * CorporateActionOption130.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#PeriodDetails
	 * CorporateActionOption130.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#RateAndAmountDetails
	 * CorporateActionOption130.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#RateAndAmountDetails
	 * CorporateActionOption131.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#DateDetails
	 * CorporateActionOption129.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#PeriodDetails
	 * CorporateActionOption129.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#RateAndAmountDetails
	 * CorporateActionOption129.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#AmountDetails
	 * CashOption52.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#DateDetails
	 * CashOption52.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#RateAndAmountDetails
	 * CashOption52.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#AmountDetails
	 * CashOption51.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption51#DateDetails
	 * CashOption51.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#RateAndAmountDetails
	 * CashOption51.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#AmountDetails
	 * CashOption50.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption50#DateDetails
	 * CashOption50.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#RateAndAmountDetails
	 * CashOption50.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#RateAndAmountDetails
	 * CorporateActionOption134.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#DateDetails
	 * CorporateActionOption136.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#PeriodDetails
	 * CorporateActionOption136.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#RateAndAmountDetails
	 * CorporateActionOption136.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#DateDetails
	 * CorporateActionOption135.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#PeriodDetails
	 * CorporateActionOption135.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#RateAndAmountDetails
	 * CorporateActionOption135.RateAndAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#DateDetails
	 * CorporateActionOption133.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#PeriodDetails
	 * CorporateActionOption133.PeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#RateAndAmountDetails
	 * CorporateActionOption133.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#AmountDetails
	 * CashOption53.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption53#DateDetails
	 * CashOption53.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption53#RateAndAmountDetails
	 * CashOption53.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#AmountDetails
	 * CashOption54.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption54#DateDetails
	 * CashOption54.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption54#RateAndAmountDetails
	 * CashOption54.RateAndAmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#AmountDetails
	 * CashOption55.AmountDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#DateDetails
	 * CashOption55.DateDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#RateAndAmountDetails
	 * CashOption55.RateAndAmountDetails}</li>
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
	public static final MMBusinessAssociationEnd RelatedChoiceCorporateAction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption13.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption25.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption30.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption38.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption47.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption57.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption58.RateAndAmountDetails, com.tools20022.repository.msg.CashOption2.AmountDetails,
					com.tools20022.repository.msg.CashOption2.DateDetails, com.tools20022.repository.msg.CorporateActionOption4.DateDetails, com.tools20022.repository.msg.CorporateActionOption4.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption4.RateAndAmountDetails, com.tools20022.repository.msg.CashOption9.AmountDetails, com.tools20022.repository.msg.CashOption9.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption14.DateDetails, com.tools20022.repository.msg.CorporateActionOption14.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption14.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption12.AmountDetails, com.tools20022.repository.msg.CashOption12.DateDetails, com.tools20022.repository.msg.CashOption12.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption23.DateDetails, com.tools20022.repository.msg.CorporateActionOption23.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption23.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption13.AmountDetails, com.tools20022.repository.msg.CashOption13.DateDetails, com.tools20022.repository.msg.CashOption13.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption31.DateDetails, com.tools20022.repository.msg.CorporateActionOption31.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption31.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption18.AmountDetails, com.tools20022.repository.msg.CashOption18.DateDetails, com.tools20022.repository.msg.CashOption18.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption37.DateDetails, com.tools20022.repository.msg.CorporateActionOption37.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption37.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption22.AmountDetails, com.tools20022.repository.msg.CashOption22.DateDetails, com.tools20022.repository.msg.CashOption22.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption46.DateDetails, com.tools20022.repository.msg.CorporateActionOption46.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption46.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption26.AmountDetails, com.tools20022.repository.msg.CashOption26.DateDetails, com.tools20022.repository.msg.CashOption26.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption53.DateDetails, com.tools20022.repository.msg.CorporateActionOption53.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption53.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption27.AmountDetails, com.tools20022.repository.msg.CashOption27.DateDetails, com.tools20022.repository.msg.CashOption27.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption54.DateDetails, com.tools20022.repository.msg.CorporateActionOption54.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption54.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption3.AmountDetails, com.tools20022.repository.msg.CashOption3.DateDetails, com.tools20022.repository.msg.CorporateActionOption10.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption10.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption10.RateAndAmountDetails, com.tools20022.repository.msg.CashOption6.AmountDetails,
					com.tools20022.repository.msg.CashOption6.DateDetails, com.tools20022.repository.msg.CorporateActionOption15.DateDetails, com.tools20022.repository.msg.CorporateActionOption15.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption15.RateAndAmountDetails, com.tools20022.repository.msg.CashOption11.AmountDetails, com.tools20022.repository.msg.CashOption11.DateDetails,
					com.tools20022.repository.msg.CashOption11.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption20.DateDetails, com.tools20022.repository.msg.CorporateActionOption20.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption20.RateAndAmountDetails, com.tools20022.repository.msg.CashOption14.AmountDetails, com.tools20022.repository.msg.CashOption14.DateDetails,
					com.tools20022.repository.msg.CashOption14.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption32.DateDetails, com.tools20022.repository.msg.CorporateActionOption32.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption32.RateAndAmountDetails, com.tools20022.repository.msg.CashOption16.AmountDetails, com.tools20022.repository.msg.CashOption16.DateDetails,
					com.tools20022.repository.msg.CashOption16.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption35.DateDetails, com.tools20022.repository.msg.CorporateActionOption35.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption35.RateAndAmountDetails, com.tools20022.repository.msg.CashOption20.AmountDetails, com.tools20022.repository.msg.CashOption20.DateDetails,
					com.tools20022.repository.msg.CashOption20.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption44.DateDetails, com.tools20022.repository.msg.CorporateActionOption44.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption44.RateAndAmountDetails, com.tools20022.repository.msg.CashOption25.AmountDetails, com.tools20022.repository.msg.CashOption25.DateDetails,
					com.tools20022.repository.msg.CashOption25.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption52.DateDetails, com.tools20022.repository.msg.CorporateActionOption52.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption52.RateAndAmountDetails, com.tools20022.repository.msg.CashOption28.AmountDetails, com.tools20022.repository.msg.CashOption28.DateDetails,
					com.tools20022.repository.msg.CashOption28.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption55.DateDetails, com.tools20022.repository.msg.CorporateActionOption55.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption55.RateAndAmountDetails, com.tools20022.repository.msg.CashOption4.AmountDetails, com.tools20022.repository.msg.CashOption4.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption3.DateDetails, com.tools20022.repository.msg.CorporateActionOption3.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption3.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption8.AmountDetails, com.tools20022.repository.msg.CashOption8.DateDetails, com.tools20022.repository.msg.CorporateActionOption17.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption17.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption17.RateAndAmountDetails, com.tools20022.repository.msg.CashOption10.AmountDetails,
					com.tools20022.repository.msg.CashOption10.DateDetails, com.tools20022.repository.msg.CashOption10.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption19.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption19.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption19.RateAndAmountDetails, com.tools20022.repository.msg.CashOption15.AmountDetails,
					com.tools20022.repository.msg.CashOption15.DateDetails, com.tools20022.repository.msg.CashOption15.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption34.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption34.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption34.RateAndAmountDetails, com.tools20022.repository.msg.CashOption17.AmountDetails,
					com.tools20022.repository.msg.CashOption17.DateDetails, com.tools20022.repository.msg.CashOption17.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption36.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption36.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption36.RateAndAmountDetails, com.tools20022.repository.msg.CashOption21.AmountDetails,
					com.tools20022.repository.msg.CashOption21.DateDetails, com.tools20022.repository.msg.CashOption21.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption45.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption45.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption45.RateAndAmountDetails, com.tools20022.repository.msg.CashOption24.AmountDetails,
					com.tools20022.repository.msg.CashOption24.DateDetails, com.tools20022.repository.msg.CashOption24.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption51.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption51.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption51.RateAndAmountDetails, com.tools20022.repository.msg.CashOption29.AmountDetails,
					com.tools20022.repository.msg.CashOption29.DateDetails, com.tools20022.repository.msg.CashOption29.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption56.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption56.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption56.RateAndAmountDetails, com.tools20022.repository.msg.CashOption1.DateDetails,
					com.tools20022.repository.msg.CashOption1.AmountDetails, com.tools20022.repository.msg.CorporateActionOption1.DateDetails, com.tools20022.repository.msg.CorporateActionOption1.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption1.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption103.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption100.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption100.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption100.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption101.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption101.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption101.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption102.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption102.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption102.RateAndAmountDetails, com.tools20022.repository.msg.CashOption30.AmountDetails,
					com.tools20022.repository.msg.CashOption30.DateDetails, com.tools20022.repository.msg.CashOption30.RateAndAmountDetails, com.tools20022.repository.msg.CashOption31.AmountDetails,
					com.tools20022.repository.msg.CashOption31.DateDetails, com.tools20022.repository.msg.CashOption31.RateAndAmountDetails, com.tools20022.repository.msg.CashOption32.AmountDetails,
					com.tools20022.repository.msg.CashOption32.DateDetails, com.tools20022.repository.msg.CashOption32.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption110.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption110.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption110.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption108.DateDetails,
					com.tools20022.repository.msg.CorporateActionOption108.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption108.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption107.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption106.DateDetails, com.tools20022.repository.msg.CorporateActionOption106.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption106.RateAndAmountDetails, com.tools20022.repository.msg.CashOption36.AmountDetails, com.tools20022.repository.msg.CashOption36.DateDetails,
					com.tools20022.repository.msg.CashOption36.RateAndAmountDetails, com.tools20022.repository.msg.CashOption35.AmountDetails, com.tools20022.repository.msg.CashOption35.DateDetails,
					com.tools20022.repository.msg.CashOption35.RateAndAmountDetails, com.tools20022.repository.msg.CashOption38.AmountDetails, com.tools20022.repository.msg.CashOption38.DateDetails,
					com.tools20022.repository.msg.CashOption38.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption111.DateDetails, com.tools20022.repository.msg.CorporateActionOption111.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption111.RateAndAmountDetails, com.tools20022.repository.msg.CashOption39.AmountDetails, com.tools20022.repository.msg.CashOption39.DateDetails,
					com.tools20022.repository.msg.CashOption39.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption113.DateDetails, com.tools20022.repository.msg.CorporateActionOption113.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption113.RateAndAmountDetails, com.tools20022.repository.msg.CashOption41.AmountDetails, com.tools20022.repository.msg.CashOption41.DateDetails,
					com.tools20022.repository.msg.CashOption41.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption117.DateDetails, com.tools20022.repository.msg.CorporateActionOption117.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption117.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption118.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption115.DateDetails, com.tools20022.repository.msg.CorporateActionOption115.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption115.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption114.DateDetails, com.tools20022.repository.msg.CorporateActionOption114.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption114.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption44.AmountDetails, com.tools20022.repository.msg.CashOption44.DateDetails, com.tools20022.repository.msg.CashOption44.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption42.AmountDetails, com.tools20022.repository.msg.CashOption42.DateDetails, com.tools20022.repository.msg.CashOption42.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption43.AmountDetails, com.tools20022.repository.msg.CashOption43.DateDetails, com.tools20022.repository.msg.CashOption43.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption124.DateDetails, com.tools20022.repository.msg.CorporateActionOption124.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption124.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption125.DateDetails, com.tools20022.repository.msg.CorporateActionOption125.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption125.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption123.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption127.DateDetails, com.tools20022.repository.msg.CorporateActionOption127.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption127.RateAndAmountDetails, com.tools20022.repository.msg.CashOption46.AmountDetails, com.tools20022.repository.msg.CashOption46.DateDetails,
					com.tools20022.repository.msg.CashOption46.RateAndAmountDetails, com.tools20022.repository.msg.CashOption49.AmountDetails, com.tools20022.repository.msg.CashOption49.DateDetails,
					com.tools20022.repository.msg.CashOption49.RateAndAmountDetails, com.tools20022.repository.msg.CashOption47.AmountDetails, com.tools20022.repository.msg.CashOption47.DateDetails,
					com.tools20022.repository.msg.CashOption47.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption132.DateDetails, com.tools20022.repository.msg.CorporateActionOption132.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption132.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption130.DateDetails, com.tools20022.repository.msg.CorporateActionOption130.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption130.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption131.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption129.DateDetails, com.tools20022.repository.msg.CorporateActionOption129.PeriodDetails, com.tools20022.repository.msg.CorporateActionOption129.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption52.AmountDetails, com.tools20022.repository.msg.CashOption52.DateDetails, com.tools20022.repository.msg.CashOption52.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption51.AmountDetails, com.tools20022.repository.msg.CashOption51.DateDetails, com.tools20022.repository.msg.CashOption51.RateAndAmountDetails,
					com.tools20022.repository.msg.CashOption50.AmountDetails, com.tools20022.repository.msg.CashOption50.DateDetails, com.tools20022.repository.msg.CashOption50.RateAndAmountDetails,
					com.tools20022.repository.msg.CorporateActionOption134.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption136.DateDetails, com.tools20022.repository.msg.CorporateActionOption136.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption136.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption135.DateDetails, com.tools20022.repository.msg.CorporateActionOption135.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption135.RateAndAmountDetails, com.tools20022.repository.msg.CorporateActionOption133.DateDetails, com.tools20022.repository.msg.CorporateActionOption133.PeriodDetails,
					com.tools20022.repository.msg.CorporateActionOption133.RateAndAmountDetails, com.tools20022.repository.msg.CashOption53.AmountDetails, com.tools20022.repository.msg.CashOption53.DateDetails,
					com.tools20022.repository.msg.CashOption53.RateAndAmountDetails, com.tools20022.repository.msg.CashOption54.AmountDetails, com.tools20022.repository.msg.CashOption54.DateDetails,
					com.tools20022.repository.msg.CashOption54.RateAndAmountDetails, com.tools20022.repository.msg.CashOption55.AmountDetails, com.tools20022.repository.msg.CashOption55.DateDetails,
					com.tools20022.repository.msg.CashOption55.RateAndAmountDetails);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ChoiceCorporateAction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Election process which selected a specific option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#Option
	 * CorporateActionElection.Option}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Features that may apply to a corporate action option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice#Code
	 * OptionFeaturesFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat1Choice#Proprietary
	 * OptionFeaturesFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#OptionFeatures
	 * CorporateActionOption4.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice#Code
	 * OptionFeaturesFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat3Choice#Proprietary
	 * OptionFeaturesFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#OptionFeatures
	 * CorporateActionOption14.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#OptionFeatures
	 * CorporateActionOption23.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#OptionFeatures
	 * CorporateActionOption31.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#OptionFeatures
	 * CorporateActionOption37.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#OptionFeatures
	 * CorporateActionOption46.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#OptionFeatures
	 * CorporateActionOption53.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#OptionFeatures
	 * CorporateActionOption54.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat2Choice#Code
	 * OptionFeaturesFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat2Choice#Proprietary
	 * OptionFeaturesFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#OptionFeatures
	 * CorporateActionOption10.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat4Choice#Code
	 * OptionFeaturesFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat4Choice#Proprietary
	 * OptionFeaturesFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#OptionFeatures
	 * CorporateActionOption15.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat6Choice#Code
	 * OptionFeaturesFormat6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat6Choice#Proprietary
	 * OptionFeaturesFormat6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#OptionFeatures
	 * CorporateActionOption20.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat7Choice#Code
	 * OptionFeaturesFormat7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat7Choice#Proprietary
	 * OptionFeaturesFormat7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#OptionFeatures
	 * CorporateActionOption32.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice#Code
	 * OptionFeaturesFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice#Proprietary
	 * OptionFeaturesFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat9Choice#Code
	 * OptionFeaturesFormat9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat9Choice#Proprietary
	 * OptionFeaturesFormat9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#OptionFeatures
	 * CorporateActionOption35.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice#Code
	 * OptionFeaturesFormat11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat11Choice#Proprietary
	 * OptionFeaturesFormat11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#OptionFeatures
	 * CorporateActionOption44.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#OptionFeatures
	 * CorporateActionOption52.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#OptionFeatures
	 * CorporateActionOption55.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#OptionFeatures
	 * CorporateActionOption3.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#OptionFeatures
	 * CorporateActionOption17.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#OptionFeatures
	 * CorporateActionOption19.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat8Choice#Code
	 * OptionFeaturesFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat8Choice#Proprietary
	 * OptionFeaturesFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#OptionFeatures
	 * CorporateActionOption34.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#OptionFeatures
	 * CorporateActionOption36.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#OptionFeatures
	 * CorporateActionOption45.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#OptionFeatures
	 * CorporateActionOption51.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#OptionFeatures
	 * CorporateActionOption56.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#Code
	 * OptionFeatures1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeatures1FormatChoice#Proprietary
	 * OptionFeatures1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#OptionFeatures
	 * CorporateActionOption1.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#OptionFeatures
	 * CorporateActionOption100.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#OptionFeatures
	 * CorporateActionOption101.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#OptionFeatures
	 * CorporateActionOption102.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat12Choice#Code
	 * OptionFeaturesFormat12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat12Choice#Proprietary
	 * OptionFeaturesFormat12Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#OptionFeatures
	 * CorporateActionOption110.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#OptionFeatures
	 * CorporateActionOption108.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#OptionFeatures
	 * CorporateActionOption106.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat15Choice#Code
	 * OptionFeaturesFormat15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat15Choice#Proprietary
	 * OptionFeaturesFormat15Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#OptionFeatures
	 * CorporateActionOption111.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#OptionFeatures
	 * CorporateActionOption113.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#OptionFeatures
	 * CorporateActionOption117.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#OptionFeatures
	 * CorporateActionOption115.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#OptionFeatures
	 * CorporateActionOption114.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat17Choice#Code
	 * OptionFeaturesFormat17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat17Choice#Proprietary
	 * OptionFeaturesFormat17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#Code
	 * OptionFeaturesFormat18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat18Choice#Proprietary
	 * OptionFeaturesFormat18Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat16Choice#Code
	 * OptionFeaturesFormat16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat16Choice#Proprietary
	 * OptionFeaturesFormat16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#OptionFeatures
	 * CorporateActionOption124.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#OptionFeatures
	 * CorporateActionOption125.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#OptionFeatures
	 * CorporateActionOption127.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat19Choice#Code
	 * OptionFeaturesFormat19Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat19Choice#Proprietary
	 * OptionFeaturesFormat19Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat21Choice#Code
	 * OptionFeaturesFormat21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat21Choice#Proprietary
	 * OptionFeaturesFormat21Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat20Choice#Code
	 * OptionFeaturesFormat20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat20Choice#Proprietary
	 * OptionFeaturesFormat20Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#OptionFeatures
	 * CorporateActionOption132.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#OptionFeatures
	 * CorporateActionOption130.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#OptionFeatures
	 * CorporateActionOption129.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#Code
	 * OptionFeaturesFormat22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat22Choice#Proprietary
	 * OptionFeaturesFormat22Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#OptionFeatures
	 * CorporateActionOption136.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#OptionFeatures
	 * CorporateActionOption135.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#OptionFeatures
	 * CorporateActionOption133.OptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat23Choice#Code
	 * OptionFeaturesFormat23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat23Choice#Proprietary
	 * OptionFeaturesFormat23Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute OptionFeatures = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionFeaturesFormat1Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption4.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat3Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption14.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption23.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption31.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption37.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption46.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption53.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption54.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat2Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption10.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat4Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat4Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption15.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat6Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat6Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption20.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat7Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat7Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption32.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat5Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat5Choice.Proprietary,
					com.tools20022.repository.choice.OptionFeaturesFormat9Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat9Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption35.OptionFeatures,
					com.tools20022.repository.choice.OptionFeaturesFormat11Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat11Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption44.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption52.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption55.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption3.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption17.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption19.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat8Choice.Code,
					com.tools20022.repository.choice.OptionFeaturesFormat8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption34.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption36.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption45.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption51.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption56.OptionFeatures,
					com.tools20022.repository.choice.OptionFeatures1FormatChoice.Code, com.tools20022.repository.choice.OptionFeatures1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateActionOption1.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption100.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption101.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption102.OptionFeatures,
					com.tools20022.repository.choice.OptionFeaturesFormat12Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat12Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption110.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption108.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption106.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat15Choice.Code,
					com.tools20022.repository.choice.OptionFeaturesFormat15Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption111.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption113.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption117.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption115.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption114.OptionFeatures,
					com.tools20022.repository.choice.OptionFeaturesFormat17Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat17Choice.Proprietary, com.tools20022.repository.choice.OptionFeaturesFormat18Choice.Code,
					com.tools20022.repository.choice.OptionFeaturesFormat18Choice.Proprietary, com.tools20022.repository.choice.OptionFeaturesFormat16Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat16Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption124.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption125.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption127.OptionFeatures,
					com.tools20022.repository.choice.OptionFeaturesFormat19Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat19Choice.Proprietary, com.tools20022.repository.choice.OptionFeaturesFormat21Choice.Code,
					com.tools20022.repository.choice.OptionFeaturesFormat21Choice.Proprietary, com.tools20022.repository.choice.OptionFeaturesFormat20Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat20Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption132.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption130.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption129.OptionFeatures,
					com.tools20022.repository.choice.OptionFeaturesFormat22Choice.Code, com.tools20022.repository.choice.OptionFeaturesFormat22Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption136.OptionFeatures,
					com.tools20022.repository.msg.CorporateActionOption135.OptionFeatures, com.tools20022.repository.msg.CorporateActionOption133.OptionFeatures, com.tools20022.repository.choice.OptionFeaturesFormat23Choice.Code,
					com.tools20022.repository.choice.OptionFeaturesFormat23Choice.Proprietary);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}
	};
	/**
	 * Period during which the specified option remains valid, eg, offer period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CorporateActionOption
	 * DateTimePeriod.CorporateActionOption}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod4#ActionPeriod
	 * CorporateActionPeriod4.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#ActionPeriod
	 * CorporateActionPeriod9.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#ActionPeriod
	 * CorporateActionPeriod5.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#ActionPeriod
	 * CorporateActionPeriod7.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#ActionPeriod
	 * CorporateActionPeriod1.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#ActionPeriod
	 * CorporateActionPeriod2.ActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#ActionPeriod
	 * CorporateActionPeriod11.ActionPeriod}</li>
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
	public static final MMBusinessAssociationEnd ActionPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod4.ActionPeriod, com.tools20022.repository.msg.CorporateActionPeriod9.ActionPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod5.ActionPeriod, com.tools20022.repository.msg.CorporateActionPeriod7.ActionPeriod, com.tools20022.repository.msg.CorporateActionPeriod1.ActionPeriod,
					com.tools20022.repository.msg.CorporateActionPeriod2.ActionPeriod, com.tools20022.repository.msg.CorporateActionPeriod11.ActionPeriod);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Conditions that apply to the offer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice#Code
	 * OfferTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice#Proprietary
	 * OfferTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#OfferType
	 * CorporateActionOption10.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat2Choice#Code
	 * OfferTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat2Choice#Proprietary
	 * OfferTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#OfferType
	 * CorporateActionOption15.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#OfferType
	 * CorporateActionOption20.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#OfferType
	 * CorporateActionOption32.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#OfferType
	 * CorporateActionOption35.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#OfferType
	 * CorporateActionOption44.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice#Code
	 * OfferTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat3Choice#Proprietary
	 * OfferTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#OfferType
	 * CorporateActionOption52.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat4Choice#Code
	 * OfferTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat4Choice#Proprietary
	 * OfferTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#OfferType
	 * CorporateActionOption55.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction3#OfferType
	 * CorporateAction3.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#OfferType
	 * CorporateActionOption3.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction4#OfferType
	 * CorporateAction4.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#OfferType
	 * CorporateActionOption17.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#OfferType
	 * CorporateAction5.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#OfferType
	 * CorporateActionOption19.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction6#OfferType
	 * CorporateAction6.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#OfferType
	 * CorporateActionOption34.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7#OfferType
	 * CorporateAction7.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#OfferType
	 * CorporateActionOption36.OfferType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction8#OfferType
	 * CorporateAction8.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#OfferType
	 * CorporateActionOption45.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#OfferType
	 * CorporateAction10.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#OfferType
	 * CorporateActionOption51.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#OfferType
	 * CorporateAction11.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#OfferType
	 * CorporateActionOption56.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#Code
	 * OfferType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferType1FormatChoice#Proprietary
	 * OfferType1FormatChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction2#OfferType
	 * CorporateAction2.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#OfferType
	 * CorporateActionOption1.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#OfferType
	 * CorporateActionOption100.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#OfferType
	 * CorporateActionOption101.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#OfferType
	 * CorporateAction12.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat5Choice#Code
	 * OfferTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat5Choice#Proprietary
	 * OfferTypeFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#OfferType
	 * CorporateActionOption108.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#OfferType
	 * CorporateActionOption106.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#OfferType
	 * CorporateAction17.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice#Code
	 * OfferTypeFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat8Choice#Proprietary
	 * OfferTypeFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#OfferType
	 * CorporateActionOption115.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#OfferType
	 * CorporateActionOption114.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#OfferType
	 * CorporateAction31.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#Code
	 * OfferTypeFormat10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice#Proprietary
	 * OfferTypeFormat10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#OfferType
	 * CorporateActionOption125.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#OfferType
	 * CorporateActionOption127.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#OfferType
	 * CorporateAction40.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice#Code
	 * OfferTypeFormat11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice#Proprietary
	 * OfferTypeFormat11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#OfferType
	 * CorporateActionOption130.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#OfferType
	 * CorporateActionOption129.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#OfferType
	 * CorporateActionOption135.OfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#OfferType
	 * CorporateActionOption133.OfferType}</li>
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
	public static final MMBusinessAttribute OfferType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OfferTypeFormat1Choice.Code, com.tools20022.repository.choice.OfferTypeFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption10.OfferType, com.tools20022.repository.choice.OfferTypeFormat2Choice.Code, com.tools20022.repository.choice.OfferTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption15.OfferType, com.tools20022.repository.msg.CorporateActionOption20.OfferType, com.tools20022.repository.msg.CorporateActionOption32.OfferType,
					com.tools20022.repository.msg.CorporateActionOption35.OfferType, com.tools20022.repository.msg.CorporateActionOption44.OfferType, com.tools20022.repository.choice.OfferTypeFormat3Choice.Code,
					com.tools20022.repository.choice.OfferTypeFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption52.OfferType, com.tools20022.repository.choice.OfferTypeFormat4Choice.Code,
					com.tools20022.repository.choice.OfferTypeFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption55.OfferType, com.tools20022.repository.msg.CorporateAction3.OfferType,
					com.tools20022.repository.msg.CorporateActionOption3.OfferType, com.tools20022.repository.msg.CorporateAction4.OfferType, com.tools20022.repository.msg.CorporateActionOption17.OfferType,
					com.tools20022.repository.msg.CorporateAction5.OfferType, com.tools20022.repository.msg.CorporateActionOption19.OfferType, com.tools20022.repository.msg.CorporateAction6.OfferType,
					com.tools20022.repository.msg.CorporateActionOption34.OfferType, com.tools20022.repository.msg.CorporateAction7.OfferType, com.tools20022.repository.msg.CorporateActionOption36.OfferType,
					com.tools20022.repository.msg.CorporateAction8.OfferType, com.tools20022.repository.msg.CorporateActionOption45.OfferType, com.tools20022.repository.msg.CorporateAction10.OfferType,
					com.tools20022.repository.msg.CorporateActionOption51.OfferType, com.tools20022.repository.msg.CorporateAction11.OfferType, com.tools20022.repository.msg.CorporateActionOption56.OfferType,
					com.tools20022.repository.choice.OfferType1FormatChoice.Code, com.tools20022.repository.choice.OfferType1FormatChoice.Proprietary, com.tools20022.repository.msg.CorporateAction2.OfferType,
					com.tools20022.repository.msg.CorporateActionOption1.OfferType, com.tools20022.repository.msg.CorporateActionOption100.OfferType, com.tools20022.repository.msg.CorporateActionOption101.OfferType,
					com.tools20022.repository.msg.CorporateAction12.OfferType, com.tools20022.repository.choice.OfferTypeFormat5Choice.Code, com.tools20022.repository.choice.OfferTypeFormat5Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption108.OfferType, com.tools20022.repository.msg.CorporateActionOption106.OfferType, com.tools20022.repository.msg.CorporateAction17.OfferType,
					com.tools20022.repository.choice.OfferTypeFormat8Choice.Code, com.tools20022.repository.choice.OfferTypeFormat8Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption115.OfferType,
					com.tools20022.repository.msg.CorporateActionOption114.OfferType, com.tools20022.repository.msg.CorporateAction31.OfferType, com.tools20022.repository.choice.OfferTypeFormat10Choice.Code,
					com.tools20022.repository.choice.OfferTypeFormat10Choice.Proprietary, com.tools20022.repository.msg.CorporateActionOption125.OfferType, com.tools20022.repository.msg.CorporateActionOption127.OfferType,
					com.tools20022.repository.msg.CorporateAction40.OfferType, com.tools20022.repository.choice.OfferTypeFormat11Choice.Code, com.tools20022.repository.choice.OfferTypeFormat11Choice.Proprietary,
					com.tools20022.repository.msg.CorporateActionOption130.OfferType, com.tools20022.repository.msg.CorporateActionOption129.OfferType, com.tools20022.repository.msg.CorporateActionOption135.OfferType,
					com.tools20022.repository.msg.CorporateActionOption133.OfferType);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}
	};
	/**
	 * Indicates whether charges apply to the holder, for instance redemption
	 * charges.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#ChargesAppliedIndicator
	 * CorporateActionOption10.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#ChargesAppliedIndicator
	 * CorporateActionOption15.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#ChargesAppliedIndicator
	 * CorporateActionOption20.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#ChargesAppliedIndicator
	 * CorporateActionOption32.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#ChargesAppliedIndicator
	 * CorporateActionOption35.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#ChargesAppliedIndicator
	 * CorporateActionOption44.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#ChargesAppliedIndicator
	 * CorporateActionOption52.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#ChargesAppliedIndicator
	 * CorporateActionOption55.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#ChargesAppliedIndicator
	 * CorporateAction3.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#ChargesAppliedIndicator
	 * CorporateActionOption3.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#ChargesAppliedIndicator
	 * CorporateAction4.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#ChargesAppliedIndicator
	 * CorporateActionOption17.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#ChargesAppliedIndicator
	 * CorporateAction5.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#ChargesAppliedIndicator
	 * CorporateActionOption19.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#ChargesAppliedIndicator
	 * CorporateAction6.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#ChargesAppliedIndicator
	 * CorporateActionOption34.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#ChargesAppliedIndicator
	 * CorporateAction7.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#ChargesAppliedIndicator
	 * CorporateActionOption36.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#ChargesAppliedIndicator
	 * CorporateAction8.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#ChargesAppliedIndicator
	 * CorporateActionOption45.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#ChargesAppliedIndicator
	 * CorporateAction10.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#ChargesAppliedIndicator
	 * CorporateActionOption51.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#ChargesAppliedIndicator
	 * CorporateAction11.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#ChargesAppliedIndicator
	 * CorporateActionOption56.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#RedemptionChargesAppliedIndicator
	 * CorporateAction2.RedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#RedemptionChargesAppliedIndicator
	 * CorporateActionOption1.RedemptionChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#ChargesAppliedIndicator
	 * CorporateActionOption100.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#ChargesAppliedIndicator
	 * CorporateActionOption101.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#ChargesAppliedIndicator
	 * CorporateAction12.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#ChargesAppliedIndicator
	 * CorporateActionOption108.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#ChargesAppliedIndicator
	 * CorporateActionOption106.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#ChargesAppliedIndicator
	 * CorporateAction17.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#ChargesAppliedIndicator
	 * CorporateActionOption115.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#ChargesAppliedIndicator
	 * CorporateActionOption114.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#ChargesAppliedIndicator
	 * CorporateAction31.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#ChargesAppliedIndicator
	 * CorporateActionOption125.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#ChargesAppliedIndicator
	 * CorporateActionOption127.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#ChargesAppliedIndicator
	 * CorporateAction40.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#ChargesAppliedIndicator
	 * CorporateActionOption130.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#ChargesAppliedIndicator
	 * CorporateActionOption129.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#ChargesAppliedIndicator
	 * CorporateActionOption135.ChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#ChargesAppliedIndicator
	 * CorporateActionOption133.ChargesAppliedIndicator}</li>
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
	public static final MMBusinessAttribute ChargesAppliedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption15.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption20.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption32.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption35.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption44.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption52.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption55.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction3.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption3.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction4.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption17.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction5.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption19.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction6.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption34.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction7.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption36.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction8.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption45.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction10.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption51.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction11.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption56.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction2.RedemptionChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption1.RedemptionChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption100.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption101.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction12.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption108.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption106.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateAction17.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption115.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption114.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateAction31.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption125.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption127.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateAction40.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption130.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption129.ChargesAppliedIndicator,
					com.tools20022.repository.msg.CorporateActionOption135.ChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption133.ChargesAppliedIndicator);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether withdrawal of instruction is allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#WithdrawalAllowedIndicator
	 * CorporateActionOption10.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#WithdrawalAllowedIndicator
	 * CorporateActionOption15.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#WithdrawalAllowedIndicator
	 * CorporateActionOption20.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#WithdrawalAllowedIndicator
	 * CorporateActionOption32.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#WithdrawalAllowedIndicator
	 * CorporateActionOption35.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#WithdrawalAllowedIndicator
	 * CorporateActionOption44.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#WithdrawalAllowedIndicator
	 * CorporateActionOption52.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#WithdrawalAllowedIndicator
	 * CorporateActionOption55.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#WithdrawalAllowedIndicator
	 * CorporateActionOption3.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#WithdrawalAllowedIndicator
	 * CorporateActionOption17.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#WithdrawalAllowedIndicator
	 * CorporateActionOption19.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#WithdrawalAllowedIndicator
	 * CorporateActionOption34.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#WithdrawalAllowedIndicator
	 * CorporateActionOption36.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#WithdrawalAllowedIndicator
	 * CorporateActionOption45.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#WithdrawalAllowedIndicator
	 * CorporateActionOption51.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#WithdrawalAllowedIndicator
	 * CorporateActionOption56.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#WithdrawalAllowedIndicator
	 * CorporateActionOption1.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#WithdrawalAllowedIndicator
	 * CorporateActionOption100.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#WithdrawalAllowedIndicator
	 * CorporateActionOption101.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#WithdrawalAllowedIndicator
	 * CorporateActionOption108.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#WithdrawalAllowedIndicator
	 * CorporateActionOption106.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#WithdrawalAllowedIndicator
	 * CorporateActionOption115.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#WithdrawalAllowedIndicator
	 * CorporateActionOption114.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#WithdrawalAllowedIndicator
	 * CorporateActionOption125.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#WithdrawalAllowedIndicator
	 * CorporateActionOption127.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#WithdrawalAllowedIndicator
	 * CorporateActionOption130.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#WithdrawalAllowedIndicator
	 * CorporateActionOption129.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#WithdrawalAllowedIndicator
	 * CorporateActionOption135.WithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#WithdrawalAllowedIndicator
	 * CorporateActionOption133.WithdrawalAllowedIndicator}</li>
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
	public static final MMBusinessAttribute WithdrawalAllowedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption15.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption20.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption32.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption35.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption44.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption52.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption55.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption3.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption17.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption19.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption34.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption36.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption45.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption51.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption56.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption1.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption100.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption101.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption108.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption106.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption115.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption114.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption125.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption127.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption130.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption129.WithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption135.WithdrawalAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption133.WithdrawalAllowedIndicator);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether change of instruction is allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#ChangeAllowedIndicator
	 * CorporateActionOption10.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#ChangeAllowedIndicator
	 * CorporateActionOption15.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#ChangeAllowedIndicator
	 * CorporateActionOption20.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#ChangeAllowedIndicator
	 * CorporateActionOption32.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#ChangeAllowedIndicator
	 * CorporateActionOption35.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#ChangeAllowedIndicator
	 * CorporateActionOption44.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#ChangeAllowedIndicator
	 * CorporateActionOption52.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#ChangeAllowedIndicator
	 * CorporateActionOption55.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#ChangeAllowedIndicator
	 * CorporateActionOption3.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#ChangeAllowedIndicator
	 * CorporateActionOption17.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#ChangeAllowedIndicator
	 * CorporateActionOption19.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#ChangeAllowedIndicator
	 * CorporateActionOption34.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#ChangeAllowedIndicator
	 * CorporateActionOption36.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#ChangeAllowedIndicator
	 * CorporateActionOption45.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#ChangeAllowedIndicator
	 * CorporateActionOption51.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#ChangeAllowedIndicator
	 * CorporateActionOption56.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#ChangeAllowedIndicator
	 * CorporateActionOption1.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#ChangeAllowedIndicator
	 * CorporateActionOption100.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#ChangeAllowedIndicator
	 * CorporateActionOption101.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#ChangeAllowedIndicator
	 * CorporateActionOption108.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#ChangeAllowedIndicator
	 * CorporateActionOption106.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#ChangeAllowedIndicator
	 * CorporateActionOption115.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#ChangeAllowedIndicator
	 * CorporateActionOption114.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#ChangeAllowedIndicator
	 * CorporateActionOption125.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#ChangeAllowedIndicator
	 * CorporateActionOption127.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#ChangeAllowedIndicator
	 * CorporateActionOption130.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#ChangeAllowedIndicator
	 * CorporateActionOption129.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#ChangeAllowedIndicator
	 * CorporateActionOption135.ChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#ChangeAllowedIndicator
	 * CorporateActionOption133.ChangeAllowedIndicator}</li>
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
	public static final MMBusinessAttribute ChangeAllowedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption15.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption20.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption32.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption35.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption44.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption52.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption55.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption3.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption17.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption19.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption34.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption36.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption45.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption51.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption56.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption1.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption100.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption101.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption108.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption106.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption115.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption114.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption125.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption127.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption130.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption129.ChangeAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption135.ChangeAllowedIndicator,
					com.tools20022.repository.msg.CorporateActionOption133.ChangeAllowedIndicator);
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Calculation of the entitlement on the basis of the proposed option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#RelatedOption
	 * CorporateActionOptionServicing.RelatedOption}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Definition of exchanges of cash and / or securities available in the
	 * processing of corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#Option
	 * ProceedsDefinition.Option}</li>
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
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution process for which an option is selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#Option
	 * CorporateActionDistribution.Option}</li>
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
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			type_lazy = () -> CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the option is the default option or not.
	 * <p>
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
	public static final MMBusinessAttribute Default = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption, com.tools20022.repository.entity.ProceedsDefinition.Option,
						com.tools20022.repository.entity.CorporateActionElection.Option, com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition,
						com.tools20022.repository.entity.CorporateActionDistribution.Option, com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.OptionNumber, com.tools20022.repository.entity.CorporateActionOption.OptionType,
						com.tools20022.repository.entity.CorporateActionOption.FractionDisposition, com.tools20022.repository.entity.CorporateActionOption.CurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.OptionFeatures, com.tools20022.repository.entity.CorporateActionOption.ActionPeriod, com.tools20022.repository.entity.CorporateActionOption.OfferType,
						com.tools20022.repository.entity.CorporateActionOption.ChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.WithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.ChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.CorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.Distribution, com.tools20022.repository.entity.CorporateActionOption.Default);
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
						CorporateActionOption133.mmObject(), SecuritiesOption61.mmObject(), SecuritiesOption63.mmObject(), OptionFeaturesFormat23Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}