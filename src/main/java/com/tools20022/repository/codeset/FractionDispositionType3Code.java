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
import com.tools20022.repository.codeset.FractionDispositionType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how fractions resulting from derived securities will be processed
 * or how prorated decisions will be rounding, if provided with a pro ration
 * rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code#BuyUp
 * FractionDispositionType3Code.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code#CashInLieuOfFraction
 * FractionDispositionType3Code.CashInLieuOfFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code#IssueFraction
 * FractionDispositionType3Code.IssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code#Expire
 * FractionDispositionType3Code.Expire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code#Unknown
 * FractionDispositionType3Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
 * FractionDispositionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BUYU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FractionDispositionType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code
	 * FractionDispositionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * </ul>
	 */
	public static final FractionDispositionType3Code BuyUp = new FractionDispositionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyUp";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType3Code.mmObject();
			codeName = FractionDispositionTypeCode.BuyUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code
	 * FractionDispositionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFraction"</li>
	 * </ul>
	 */
	public static final FractionDispositionType3Code CashInLieuOfFraction = new FractionDispositionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFraction";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType3Code.mmObject();
			codeName = FractionDispositionTypeCode.CashInLieuOfFraction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code
	 * FractionDispositionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * </ul>
	 */
	public static final FractionDispositionType3Code IssueFraction = new FractionDispositionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueFraction";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType3Code.mmObject();
			codeName = FractionDispositionTypeCode.IssueFraction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code
	 * FractionDispositionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expire"</li>
	 * </ul>
	 */
	public static final FractionDispositionType3Code Expire = new FractionDispositionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expire";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType3Code.mmObject();
			codeName = FractionDispositionTypeCode.Expire.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType3Code
	 * FractionDispositionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final FractionDispositionType3Code Unknown = new FractionDispositionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType3Code.mmObject();
			codeName = FractionDispositionTypeCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FractionDispositionType3Code> codesByName = new LinkedHashMap<>();

	protected FractionDispositionType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BUYU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionDispositionType3Code";
				definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
				trace_lazy = () -> FractionDispositionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionDispositionType3Code.BuyUp, com.tools20022.repository.codeset.FractionDispositionType3Code.CashInLieuOfFraction,
						com.tools20022.repository.codeset.FractionDispositionType3Code.IssueFraction, com.tools20022.repository.codeset.FractionDispositionType3Code.Expire,
						com.tools20022.repository.codeset.FractionDispositionType3Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyUp.getCodeName().get(), BuyUp);
		codesByName.put(CashInLieuOfFraction.getCodeName().get(), CashInLieuOfFraction);
		codesByName.put(IssueFraction.getCodeName().get(), IssueFraction);
		codesByName.put(Expire.getCodeName().get(), Expire);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static FractionDispositionType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FractionDispositionType3Code[] values() {
		FractionDispositionType3Code[] values = new FractionDispositionType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FractionDispositionType3Code> {
		@Override
		public FractionDispositionType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FractionDispositionType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}