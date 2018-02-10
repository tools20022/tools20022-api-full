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
import com.tools20022.repository.codeset.FractionDispositionType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that fractional value should be retained; no rounding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code#IssueFraction
 * FractionDispositionType9Code.IssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code#RoundDown
 * FractionDispositionType9Code.RoundDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code#RoundToNearest
 * FractionDispositionType9Code.RoundToNearest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code#RoundUp
 * FractionDispositionType9Code.RoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code#Unknown
 * FractionDispositionType9Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeV2Code
 * FractionDispositionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DIST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that fractional value should be retained; no rounding."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FractionDispositionType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
	 * FractionDispositionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * </ul>
	 */
	public static final FractionDispositionType9Code IssueFraction = new FractionDispositionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueFraction";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType9Code.mmObject();
			codeName = FractionDispositionTypeV2Code.IssueFraction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
	 * FractionDispositionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * </ul>
	 */
	public static final FractionDispositionType9Code RoundDown = new FractionDispositionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDown";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType9Code.mmObject();
			codeName = FractionDispositionTypeV2Code.RoundDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
	 * FractionDispositionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundToNearest"</li>
	 * </ul>
	 */
	public static final FractionDispositionType9Code RoundToNearest = new FractionDispositionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundToNearest";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType9Code.mmObject();
			codeName = FractionDispositionTypeV2Code.RoundToNearest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
	 * FractionDispositionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * </ul>
	 */
	public static final FractionDispositionType9Code RoundUp = new FractionDispositionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundUp";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType9Code.mmObject();
			codeName = FractionDispositionTypeV2Code.RoundUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionType9Code
	 * FractionDispositionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final FractionDispositionType9Code Unknown = new FractionDispositionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionType9Code.mmObject();
			codeName = FractionDispositionTypeV2Code.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FractionDispositionType9Code> codesByName = new LinkedHashMap<>();

	protected FractionDispositionType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DIST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionDispositionType9Code";
				definition = "Indicates that fractional value should be retained; no rounding.";
				trace_lazy = () -> FractionDispositionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionDispositionType9Code.IssueFraction, com.tools20022.repository.codeset.FractionDispositionType9Code.RoundDown,
						com.tools20022.repository.codeset.FractionDispositionType9Code.RoundToNearest, com.tools20022.repository.codeset.FractionDispositionType9Code.RoundUp,
						com.tools20022.repository.codeset.FractionDispositionType9Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IssueFraction.getCodeName().get(), IssueFraction);
		codesByName.put(RoundDown.getCodeName().get(), RoundDown);
		codesByName.put(RoundToNearest.getCodeName().get(), RoundToNearest);
		codesByName.put(RoundUp.getCodeName().get(), RoundUp);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static FractionDispositionType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FractionDispositionType9Code[] values() {
		FractionDispositionType9Code[] values = new FractionDispositionType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FractionDispositionType9Code> {
		@Override
		public FractionDispositionType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FractionDispositionType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}