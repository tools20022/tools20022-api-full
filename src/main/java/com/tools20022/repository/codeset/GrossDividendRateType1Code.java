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
import com.tools20022.repository.codeset.GrossDividendRateType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#CapitalPortion
 * GrossDividendRateType1Code.CapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#FullyFranked
 * GrossDividendRateType1Code.FullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#IncomePortion
 * GrossDividendRateType1Code.IncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#Interest
 * GrossDividendRateType1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#SundryOrOtherIncome
 * GrossDividendRateType1Code.SundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#TaxablePortion
 * GrossDividendRateType1Code.TaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#TaxDeferred
 * GrossDividendRateType1Code.TaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#TaxFree
 * GrossDividendRateType1Code.TaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#Unfranked
 * GrossDividendRateType1Code.Unfranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#LongTermCapitalGain
 * GrossDividendRateType1Code.LongTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code#ShortTermCapitalGain
 * GrossDividendRateType1Code.ShortTermCapitalGain}</li>
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
 * "GrossDividendRateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of gross dividend rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GrossDividendRateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code CapitalPortion = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.CapitalPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code FullyFranked = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.FullyFranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code IncomePortion = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.IncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code Interest = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code SundryOrOtherIncome = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.SundryOrOtherIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code TaxablePortion = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxablePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.TaxablePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code TaxDeferred = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferred";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.TaxDeferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code TaxFree = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFree";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.TaxFree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code Unfranked = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.Unfranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGain"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code LongTermCapitalGain = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongTermCapitalGain";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.LongTermCapitalGain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GrossDividendRateType1Code
	 * GrossDividendRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGain"</li>
	 * </ul>
	 */
	public static final GrossDividendRateType1Code ShortTermCapitalGain = new GrossDividendRateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermCapitalGain";
			owner_lazy = () -> com.tools20022.repository.codeset.GrossDividendRateType1Code.mmObject();
			codeName = DividendRateTypeCode.ShortTermCapitalGain.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GrossDividendRateType1Code> codesByName = new LinkedHashMap<>();

	protected GrossDividendRateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GrossDividendRateType1Code";
				definition = "Specifies the type of gross dividend rate.";
				trace_lazy = () -> DividendRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GrossDividendRateType1Code.CapitalPortion, com.tools20022.repository.codeset.GrossDividendRateType1Code.FullyFranked,
						com.tools20022.repository.codeset.GrossDividendRateType1Code.IncomePortion, com.tools20022.repository.codeset.GrossDividendRateType1Code.Interest,
						com.tools20022.repository.codeset.GrossDividendRateType1Code.SundryOrOtherIncome, com.tools20022.repository.codeset.GrossDividendRateType1Code.TaxablePortion,
						com.tools20022.repository.codeset.GrossDividendRateType1Code.TaxDeferred, com.tools20022.repository.codeset.GrossDividendRateType1Code.TaxFree, com.tools20022.repository.codeset.GrossDividendRateType1Code.Unfranked,
						com.tools20022.repository.codeset.GrossDividendRateType1Code.LongTermCapitalGain, com.tools20022.repository.codeset.GrossDividendRateType1Code.ShortTermCapitalGain);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalPortion.getCodeName().get(), CapitalPortion);
		codesByName.put(FullyFranked.getCodeName().get(), FullyFranked);
		codesByName.put(IncomePortion.getCodeName().get(), IncomePortion);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(SundryOrOtherIncome.getCodeName().get(), SundryOrOtherIncome);
		codesByName.put(TaxablePortion.getCodeName().get(), TaxablePortion);
		codesByName.put(TaxDeferred.getCodeName().get(), TaxDeferred);
		codesByName.put(TaxFree.getCodeName().get(), TaxFree);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
		codesByName.put(LongTermCapitalGain.getCodeName().get(), LongTermCapitalGain);
		codesByName.put(ShortTermCapitalGain.getCodeName().get(), ShortTermCapitalGain);
	}

	public static GrossDividendRateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GrossDividendRateType1Code[] values() {
		GrossDividendRateType1Code[] values = new GrossDividendRateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GrossDividendRateType1Code> {
		@Override
		public GrossDividendRateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GrossDividendRateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}