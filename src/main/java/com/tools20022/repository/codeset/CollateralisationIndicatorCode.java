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
import com.tools20022.repository.codeset.CollateralisationIndicatorCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode#FullyCollateralised
 * CollateralisationIndicatorCode.FullyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode#OneWayCollateralised
 * CollateralisationIndicatorCode.OneWayCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode#PartiallyCollateralised
 * CollateralisationIndicatorCode.PartiallyCollateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode#Uncollateralised
 * CollateralisationIndicatorCode.Uncollateralised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
 * CollateralisationIndicator1Code}</li>
 * </ul>
 * </li>
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
 * "CollateralisationIndicatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the transaction is collateralised."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralisationIndicatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is fully collateralised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode
	 * CollateralisationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is fully collateralised."</li>
	 * </ul>
	 */
	public static final CollateralisationIndicatorCode FullyCollateralised = new CollateralisationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyCollateralised";
			definition = "Transaction is fully collateralised.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicatorCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Transaction is one-way collateralised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode
	 * CollateralisationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneWayCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is one-way collateralised."</li>
	 * </ul>
	 */
	public static final CollateralisationIndicatorCode OneWayCollateralised = new CollateralisationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneWayCollateralised";
			definition = "Transaction is one-way collateralised.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicatorCode.mmObject();
			codeName = "ONEW";
		}
	};
	/**
	 * Transaction is partially collateralised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode
	 * CollateralisationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is partially collateralised."</li>
	 * </ul>
	 */
	public static final CollateralisationIndicatorCode PartiallyCollateralised = new CollateralisationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCollateralised";
			definition = "Transaction is partially collateralised.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicatorCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Transaction is uncollateralised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicatorCode
	 * CollateralisationIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Uncollateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is uncollateralised."</li>
	 * </ul>
	 */
	public static final CollateralisationIndicatorCode Uncollateralised = new CollateralisationIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Uncollateralised";
			definition = "Transaction is uncollateralised.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralisationIndicatorCode.mmObject();
			codeName = "UNCO";
		}
	};
	final static private LinkedHashMap<String, CollateralisationIndicatorCode> codesByName = new LinkedHashMap<>();

	protected CollateralisationIndicatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralisationIndicatorCode";
				definition = "Specifies whether the transaction is collateralised.";
				derivation_lazy = () -> Arrays.asList(CollateralisationIndicator1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralisationIndicatorCode.FullyCollateralised, com.tools20022.repository.codeset.CollateralisationIndicatorCode.OneWayCollateralised,
						com.tools20022.repository.codeset.CollateralisationIndicatorCode.PartiallyCollateralised, com.tools20022.repository.codeset.CollateralisationIndicatorCode.Uncollateralised);
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

	public static CollateralisationIndicatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralisationIndicatorCode[] values() {
		CollateralisationIndicatorCode[] values = new CollateralisationIndicatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralisationIndicatorCode> {
		@Override
		public CollateralisationIndicatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralisationIndicatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}