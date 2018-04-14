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
import com.tools20022.repository.codeset.OversubscriptionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the oversubscription type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode#Unlimited
 * OversubscriptionTypeCode.Unlimited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode#LimitedByQuantityOrPercentage
 * OversubscriptionTypeCode.LimitedByQuantityOrPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode#NoOversubscription
 * OversubscriptionTypeCode.NoOversubscription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OversubscriptionType1Code
 * OversubscriptionType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OversubscriptionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the oversubscription type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNLD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OversubscriptionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unlimited oversubscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode
	 * OversubscriptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unlimited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unlimited oversubscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OversubscriptionTypeCode Unlimited = new OversubscriptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unlimited";
			definition = "Unlimited oversubscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.OversubscriptionTypeCode.mmObject();
			codeName = "UNLD";
		}
	};
	/**
	 * The subscription is limited by quantity or percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode
	 * OversubscriptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedByQuantityOrPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The subscription is limited by quantity or percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OversubscriptionTypeCode LimitedByQuantityOrPercentage = new OversubscriptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedByQuantityOrPercentage";
			definition = "The subscription is limited by quantity or percentage.";
			owner_lazy = () -> com.tools20022.repository.codeset.OversubscriptionTypeCode.mmObject();
			codeName = "LTDB";
		}
	};
	/**
	 * No oversubscription is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OversubscriptionTypeCode
	 * OversubscriptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoOversubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No oversubscription is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OversubscriptionTypeCode NoOversubscription = new OversubscriptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoOversubscription";
			definition = "No oversubscription is allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.OversubscriptionTypeCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, OversubscriptionTypeCode> codesByName = new LinkedHashMap<>();

	protected OversubscriptionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNLD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OversubscriptionTypeCode";
				definition = "Specifies the oversubscription type.";
				derivation_lazy = () -> Arrays.asList(OversubscriptionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OversubscriptionTypeCode.Unlimited, com.tools20022.repository.codeset.OversubscriptionTypeCode.LimitedByQuantityOrPercentage,
						com.tools20022.repository.codeset.OversubscriptionTypeCode.NoOversubscription);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Unlimited.getCodeName().get(), Unlimited);
		codesByName.put(LimitedByQuantityOrPercentage.getCodeName().get(), LimitedByQuantityOrPercentage);
		codesByName.put(NoOversubscription.getCodeName().get(), NoOversubscription);
	}

	public static OversubscriptionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OversubscriptionTypeCode[] values() {
		OversubscriptionTypeCode[] values = new OversubscriptionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OversubscriptionTypeCode> {
		@Override
		public OversubscriptionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OversubscriptionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}