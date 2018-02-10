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
import com.tools20022.repository.codeset.GrossDividendRateType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of gross dividend rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#CapitalPortion
 * GrossDividendRateType5Code.CapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#FullPeriodUnitsIncomePortion
 * GrossDividendRateType5Code.FullPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#FullyFranked
 * GrossDividendRateType5Code.FullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#IncomePortion
 * GrossDividendRateType5Code.IncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#Interest
 * GrossDividendRateType5Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#LongTermCapitalGain
 * GrossDividendRateType5Code.LongTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#PartWayPeriodUnitsIncomePortion
 * GrossDividendRateType5Code.PartWayPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#ShortTermCapitalGain
 * GrossDividendRateType5Code.ShortTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#SundryOrOtherIncome
 * GrossDividendRateType5Code.SundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#TaxablePortion
 * GrossDividendRateType5Code.TaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#TaxDeferred
 * GrossDividendRateType5Code.TaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#TaxFree
 * GrossDividendRateType5Code.TaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#Unfranked
 * GrossDividendRateType5Code.Unfranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#RealEstatePropertyIncomePortion
 * GrossDividendRateType5Code.RealEstatePropertyIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code#ConduitForeignIncome
 * GrossDividendRateType5Code.ConduitForeignIncome}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
 * DividendRateTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GrossDividendRateType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of gross dividend rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GrossDividendRateType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code CapitalPortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.CapitalPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code FullPeriodUnitsIncomePortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnitsIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.FullPeriodUnitsIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code FullyFranked = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.FullyFranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code IncomePortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.IncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code Interest = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGain"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code LongTermCapitalGain = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGain";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.LongTermCapitalGain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code PartWayPeriodUnitsIncomePortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnitsIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.PartWayPeriodUnitsIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGain"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code ShortTermCapitalGain = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGain";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.ShortTermCapitalGain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code SundryOrOtherIncome = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.SundryOrOtherIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code TaxablePortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxablePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxablePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code TaxDeferred = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferred";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxDeferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code TaxFree = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFree";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxFree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code Unfranked = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.Unfranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstatePropertyIncomePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code RealEstatePropertyIncomePortion = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.RealEstatePropertyIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType5Code
	 * GrossDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncome"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType5Code ConduitForeignIncome = new GrossDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConduitForeignIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.ConduitForeignIncome.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GrossDividendRateType5Code> codesByName = new LinkedHashMap<>();

	protected GrossDividendRateType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GrossDividendRateType5Code";
				definition = "Specifies the type of gross dividend rate.";
				trace_lazy = () -> DividendRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GrossDividendRateType5Code.CapitalPortion, com.tools20022.repository.codeset.GrossDividendRateType5Code.FullPeriodUnitsIncomePortion,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.FullyFranked, com.tools20022.repository.codeset.GrossDividendRateType5Code.IncomePortion,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.Interest, com.tools20022.repository.codeset.GrossDividendRateType5Code.LongTermCapitalGain,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.PartWayPeriodUnitsIncomePortion, com.tools20022.repository.codeset.GrossDividendRateType5Code.ShortTermCapitalGain,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.SundryOrOtherIncome, com.tools20022.repository.codeset.GrossDividendRateType5Code.TaxablePortion,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.TaxDeferred, com.tools20022.repository.codeset.GrossDividendRateType5Code.TaxFree, com.tools20022.repository.codeset.GrossDividendRateType5Code.Unfranked,
						com.tools20022.repository.codeset.GrossDividendRateType5Code.RealEstatePropertyIncomePortion, com.tools20022.repository.codeset.GrossDividendRateType5Code.ConduitForeignIncome);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalPortion.getCodeName().get(), CapitalPortion);
		codesByName.put(FullPeriodUnitsIncomePortion.getCodeName().get(), FullPeriodUnitsIncomePortion);
		codesByName.put(FullyFranked.getCodeName().get(), FullyFranked);
		codesByName.put(IncomePortion.getCodeName().get(), IncomePortion);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LongTermCapitalGain.getCodeName().get(), LongTermCapitalGain);
		codesByName.put(PartWayPeriodUnitsIncomePortion.getCodeName().get(), PartWayPeriodUnitsIncomePortion);
		codesByName.put(ShortTermCapitalGain.getCodeName().get(), ShortTermCapitalGain);
		codesByName.put(SundryOrOtherIncome.getCodeName().get(), SundryOrOtherIncome);
		codesByName.put(TaxablePortion.getCodeName().get(), TaxablePortion);
		codesByName.put(TaxDeferred.getCodeName().get(), TaxDeferred);
		codesByName.put(TaxFree.getCodeName().get(), TaxFree);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
		codesByName.put(RealEstatePropertyIncomePortion.getCodeName().get(), RealEstatePropertyIncomePortion);
		codesByName.put(ConduitForeignIncome.getCodeName().get(), ConduitForeignIncome);
	}

	public static GrossDividendRateType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GrossDividendRateType5Code[] values() {
		GrossDividendRateType5Code[] values = new GrossDividendRateType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GrossDividendRateType5Code> {
		@Override
		public GrossDividendRateType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GrossDividendRateType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}