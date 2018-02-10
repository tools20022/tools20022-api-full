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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CalculationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the yield computation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#AfterTax
 * CalculationType1Code.AfterTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#Annual
 * CalculationType1Code.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#AtIssue
 * CalculationType1Code.AtIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ToAverageMaturity
 * CalculationType1Code.ToAverageMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationType1Code#Book
 * CalculationType1Code.Book}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#YieldToNextCall
 * CalculationType1Code.YieldToNextCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ChangeSinceClose
 * CalculationType1Code.ChangeSinceClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#Closing
 * CalculationType1Code.Closing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#Compound
 * CalculationType1Code.Compound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#CurrentYield
 * CalculationType1Code.CurrentYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#TrueGross
 * CalculationType1Code.TrueGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#GovernmentEquivalent
 * CalculationType1Code.GovernmentEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#InflationAssumption
 * CalculationType1Code.InflationAssumption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#InverseFloater
 * CalculationType1Code.InverseFloater}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#LastClose
 * CalculationType1Code.LastClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#LastMonth
 * CalculationType1Code.LastMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#LastQuarter
 * CalculationType1Code.LastQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#LastYear
 * CalculationType1Code.LastYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#LongestAverageLife
 * CalculationType1Code.LongestAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#MarkToMarket
 * CalculationType1Code.MarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#YieldToMaturity
 * CalculationType1Code.YieldToMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ToNextRefund
 * CalculationType1Code.ToNextRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#OpenAverage
 * CalculationType1Code.OpenAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ToNextPut
 * CalculationType1Code.ToNextPut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#PreviousClose
 * CalculationType1Code.PreviousClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#Proceeds
 * CalculationType1Code.Proceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#SemiAnnual
 * CalculationType1Code.SemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ShortestAverageLife
 * CalculationType1Code.ShortestAverageLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#Simple
 * CalculationType1Code.Simple}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#TaxEquivalent
 * CalculationType1Code.TaxEquivalent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ToTenderDate
 * CalculationType1Code.ToTenderDate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CalculationType1Code#True
 * CalculationType1Code.True}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code#ToWorstConvention
 * CalculationType1Code.ToWorstConvention}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CalculationTypeCode
 * CalculationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AFTX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CalculationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the yield computation method."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CalculationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterTax"</li>
	 * </ul>
	 */
	public static final CalculationType1Code AfterTax = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterTax";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.AfterTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Annual = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtIssue"</li>
	 * </ul>
	 */
	public static final CalculationType1Code AtIssue = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.AtIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAverageMaturity"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ToAverageMaturity = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAverageMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ToAverageMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Book = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Book.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToNextCall"</li>
	 * </ul>
	 */
	public static final CalculationType1Code YieldToNextCall = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldToNextCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.YieldToNextCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeSinceClose"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ChangeSinceClose = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeSinceClose";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ChangeSinceClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Closing = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Closing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compound"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Compound = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compound";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Compound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYield"</li>
	 * </ul>
	 */
	public static final CalculationType1Code CurrentYield = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYield";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.CurrentYield.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrueGross"</li>
	 * </ul>
	 */
	public static final CalculationType1Code TrueGross = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrueGross";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.TrueGross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentEquivalent"</li>
	 * </ul>
	 */
	public static final CalculationType1Code GovernmentEquivalent = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentEquivalent";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.GovernmentEquivalent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationAssumption"</li>
	 * </ul>
	 */
	public static final CalculationType1Code InflationAssumption = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationAssumption";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.InflationAssumption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InverseFloater"</li>
	 * </ul>
	 */
	public static final CalculationType1Code InverseFloater = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InverseFloater";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.InverseFloater.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastClose"</li>
	 * </ul>
	 */
	public static final CalculationType1Code LastClose = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastClose";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.LastClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastMonth"</li>
	 * </ul>
	 */
	public static final CalculationType1Code LastMonth = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.LastMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastQuarter"</li>
	 * </ul>
	 */
	public static final CalculationType1Code LastQuarter = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.LastQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastYear"</li>
	 * </ul>
	 */
	public static final CalculationType1Code LastYear = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastYear";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.LastYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongestAverageLife"</li>
	 * </ul>
	 */
	public static final CalculationType1Code LongestAverageLife = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongestAverageLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.LongestAverageLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarket"</li>
	 * </ul>
	 */
	public static final CalculationType1Code MarkToMarket = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.MarkToMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldToMaturity"</li>
	 * </ul>
	 */
	public static final CalculationType1Code YieldToMaturity = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldToMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.YieldToMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextRefund"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ToNextRefund = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextRefund";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ToNextRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenAverage"</li>
	 * </ul>
	 */
	public static final CalculationType1Code OpenAverage = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.OpenAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToNextPut"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ToNextPut = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToNextPut";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ToNextPut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClose"</li>
	 * </ul>
	 */
	public static final CalculationType1Code PreviousClose = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClose";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.PreviousClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proceeds"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Proceeds = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Proceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * </ul>
	 */
	public static final CalculationType1Code SemiAnnual = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortestAverageLife"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ShortestAverageLife = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortestAverageLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ShortestAverageLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * </ul>
	 */
	public static final CalculationType1Code Simple = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.Simple.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxEquivalent"</li>
	 * </ul>
	 */
	public static final CalculationType1Code TaxEquivalent = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxEquivalent";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.TaxEquivalent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToTenderDate"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ToTenderDate = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToTenderDate";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ToTenderDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "True"</li>
	 * </ul>
	 */
	public static final CalculationType1Code True = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "True";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.True.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToWorstConvention"</li>
	 * </ul>
	 */
	public static final CalculationType1Code ToWorstConvention = new CalculationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToWorstConvention";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationType1Code.mmObject();
			codeName = CalculationTypeCode.ToWorstConvention.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CalculationType1Code> codesByName = new LinkedHashMap<>();

	protected CalculationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AFTX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CalculationType1Code";
				definition = "Specifies the yield computation method.";
				trace_lazy = () -> CalculationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationType1Code.AfterTax, com.tools20022.repository.codeset.CalculationType1Code.Annual, com.tools20022.repository.codeset.CalculationType1Code.AtIssue,
						com.tools20022.repository.codeset.CalculationType1Code.ToAverageMaturity, com.tools20022.repository.codeset.CalculationType1Code.Book, com.tools20022.repository.codeset.CalculationType1Code.YieldToNextCall,
						com.tools20022.repository.codeset.CalculationType1Code.ChangeSinceClose, com.tools20022.repository.codeset.CalculationType1Code.Closing, com.tools20022.repository.codeset.CalculationType1Code.Compound,
						com.tools20022.repository.codeset.CalculationType1Code.CurrentYield, com.tools20022.repository.codeset.CalculationType1Code.TrueGross, com.tools20022.repository.codeset.CalculationType1Code.GovernmentEquivalent,
						com.tools20022.repository.codeset.CalculationType1Code.InflationAssumption, com.tools20022.repository.codeset.CalculationType1Code.InverseFloater, com.tools20022.repository.codeset.CalculationType1Code.LastClose,
						com.tools20022.repository.codeset.CalculationType1Code.LastMonth, com.tools20022.repository.codeset.CalculationType1Code.LastQuarter, com.tools20022.repository.codeset.CalculationType1Code.LastYear,
						com.tools20022.repository.codeset.CalculationType1Code.LongestAverageLife, com.tools20022.repository.codeset.CalculationType1Code.MarkToMarket, com.tools20022.repository.codeset.CalculationType1Code.YieldToMaturity,
						com.tools20022.repository.codeset.CalculationType1Code.ToNextRefund, com.tools20022.repository.codeset.CalculationType1Code.OpenAverage, com.tools20022.repository.codeset.CalculationType1Code.ToNextPut,
						com.tools20022.repository.codeset.CalculationType1Code.PreviousClose, com.tools20022.repository.codeset.CalculationType1Code.Proceeds, com.tools20022.repository.codeset.CalculationType1Code.SemiAnnual,
						com.tools20022.repository.codeset.CalculationType1Code.ShortestAverageLife, com.tools20022.repository.codeset.CalculationType1Code.Simple, com.tools20022.repository.codeset.CalculationType1Code.TaxEquivalent,
						com.tools20022.repository.codeset.CalculationType1Code.ToTenderDate, com.tools20022.repository.codeset.CalculationType1Code.True, com.tools20022.repository.codeset.CalculationType1Code.ToWorstConvention);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AfterTax.getCodeName().get(), AfterTax);
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(AtIssue.getCodeName().get(), AtIssue);
		codesByName.put(ToAverageMaturity.getCodeName().get(), ToAverageMaturity);
		codesByName.put(Book.getCodeName().get(), Book);
		codesByName.put(YieldToNextCall.getCodeName().get(), YieldToNextCall);
		codesByName.put(ChangeSinceClose.getCodeName().get(), ChangeSinceClose);
		codesByName.put(Closing.getCodeName().get(), Closing);
		codesByName.put(Compound.getCodeName().get(), Compound);
		codesByName.put(CurrentYield.getCodeName().get(), CurrentYield);
		codesByName.put(TrueGross.getCodeName().get(), TrueGross);
		codesByName.put(GovernmentEquivalent.getCodeName().get(), GovernmentEquivalent);
		codesByName.put(InflationAssumption.getCodeName().get(), InflationAssumption);
		codesByName.put(InverseFloater.getCodeName().get(), InverseFloater);
		codesByName.put(LastClose.getCodeName().get(), LastClose);
		codesByName.put(LastMonth.getCodeName().get(), LastMonth);
		codesByName.put(LastQuarter.getCodeName().get(), LastQuarter);
		codesByName.put(LastYear.getCodeName().get(), LastYear);
		codesByName.put(LongestAverageLife.getCodeName().get(), LongestAverageLife);
		codesByName.put(MarkToMarket.getCodeName().get(), MarkToMarket);
		codesByName.put(YieldToMaturity.getCodeName().get(), YieldToMaturity);
		codesByName.put(ToNextRefund.getCodeName().get(), ToNextRefund);
		codesByName.put(OpenAverage.getCodeName().get(), OpenAverage);
		codesByName.put(ToNextPut.getCodeName().get(), ToNextPut);
		codesByName.put(PreviousClose.getCodeName().get(), PreviousClose);
		codesByName.put(Proceeds.getCodeName().get(), Proceeds);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(ShortestAverageLife.getCodeName().get(), ShortestAverageLife);
		codesByName.put(Simple.getCodeName().get(), Simple);
		codesByName.put(TaxEquivalent.getCodeName().get(), TaxEquivalent);
		codesByName.put(ToTenderDate.getCodeName().get(), ToTenderDate);
		codesByName.put(True.getCodeName().get(), True);
		codesByName.put(ToWorstConvention.getCodeName().get(), ToWorstConvention);
	}

	public static CalculationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CalculationType1Code[] values() {
		CalculationType1Code[] values = new CalculationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CalculationType1Code> {
		@Override
		public CalculationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CalculationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}