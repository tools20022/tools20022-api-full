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
import com.tools20022.repository.codeset.CollateralisationIndicator1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the transaction is collateralised.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code#FullyCollateralised
 * CollateralisationIndicator1Code.FullyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code#OneWayCollateralised
 * CollateralisationIndicator1Code.OneWayCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code#PartiallyCollateralised
 * CollateralisationIndicator1Code.PartiallyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code#Uncollateralised
 * CollateralisationIndicator1Code.Uncollateralised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode
 * CollateralisationIndicatorCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FULL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralisationIndicator1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the transaction is collateralised."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralisationIndicator1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyCollateralised"</li>
	 * </ul>
	 */
	public static final CollateralisationIndicator1Code FullyCollateralised = new CollateralisationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicator1Code.mmObject();
			codeName = CollateralisationIndicatorCode.FullyCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneWayCollateralised"</li>
	 * </ul>
	 */
	public static final CollateralisationIndicator1Code OneWayCollateralised = new CollateralisationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneWayCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicator1Code.mmObject();
			codeName = CollateralisationIndicatorCode.OneWayCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCollateralised"</li>
	 * </ul>
	 */
	public static final CollateralisationIndicator1Code PartiallyCollateralised = new CollateralisationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicator1Code.mmObject();
			codeName = CollateralisationIndicatorCode.PartiallyCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Uncollateralised"</li>
	 * </ul>
	 */
	public static final CollateralisationIndicator1Code Uncollateralised = new CollateralisationIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Uncollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicator1Code.mmObject();
			codeName = CollateralisationIndicatorCode.Uncollateralised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralisationIndicator1Code> codesByName = new LinkedHashMap<>();

	protected CollateralisationIndicator1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralisationIndicator1Code";
				definition = "Specifies whether the transaction is collateralised.";
				trace_lazy = () -> CollateralisationIndicatorCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralisationIndicator1Code.FullyCollateralised, com.tools20022.repository.codeset.CollateralisationIndicator1Code.OneWayCollateralised,
						com.tools20022.repository.codeset.CollateralisationIndicator1Code.PartiallyCollateralised, com.tools20022.repository.codeset.CollateralisationIndicator1Code.Uncollateralised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FullyCollateralised.getCodeName().get(), FullyCollateralised);
		codesByName.put(OneWayCollateralised.getCodeName().get(), OneWayCollateralised);
		codesByName.put(PartiallyCollateralised.getCodeName().get(), PartiallyCollateralised);
		codesByName.put(Uncollateralised.getCodeName().get(), Uncollateralised);
	}

	public static CollateralisationIndicator1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralisationIndicator1Code[] values() {
		CollateralisationIndicator1Code[] values = new CollateralisationIndicator1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralisationIndicator1Code> {
		@Override
		public CollateralisationIndicator1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralisationIndicator1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}