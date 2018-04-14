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
import com.tools20022.repository.codeset.CollateralisationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of collateral agreement between two parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code#FullyCollateralised
 * CollateralisationType1Code.FullyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code#OneWayCollateralised
 * CollateralisationType1Code.OneWayCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code#PartiallyCollateralised
 * CollateralisationType1Code.PartiallyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code#Uncollateralised
 * CollateralisationType1Code.Uncollateralised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralisationTypeCode
 * CollateralisationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralisationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of collateral agreement between two parties."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralisationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CollateralisationType1Code FullyCollateralised = new CollateralisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationType1Code.mmObject();
			codeName = CollateralisationTypeCode.FullyCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneWayCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CollateralisationType1Code OneWayCollateralised = new CollateralisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneWayCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationType1Code.mmObject();
			codeName = CollateralisationTypeCode.OneWayCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CollateralisationType1Code PartiallyCollateralised = new CollateralisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationType1Code.mmObject();
			codeName = CollateralisationTypeCode.PartiallyCollateralised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Uncollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CollateralisationType1Code Uncollateralised = new CollateralisationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Uncollateralised";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationType1Code.mmObject();
			codeName = CollateralisationTypeCode.Uncollateralised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralisationType1Code> codesByName = new LinkedHashMap<>();

	protected CollateralisationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralisationType1Code";
				definition = "Specifies the type of collateral agreement between two parties.";
				trace_lazy = () -> CollateralisationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralisationType1Code.FullyCollateralised, com.tools20022.repository.codeset.CollateralisationType1Code.OneWayCollateralised,
						com.tools20022.repository.codeset.CollateralisationType1Code.PartiallyCollateralised, com.tools20022.repository.codeset.CollateralisationType1Code.Uncollateralised);
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

	public static CollateralisationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralisationType1Code[] values() {
		CollateralisationType1Code[] values = new CollateralisationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralisationType1Code> {
		@Override
		public CollateralisationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralisationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}