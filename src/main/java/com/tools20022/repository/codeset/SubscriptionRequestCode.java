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
import com.tools20022.repository.codeset.SubscriptionRequestCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of subscription to market data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode#Snapshot
 * SubscriptionRequestCode.Snapshot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode#Subscribe
 * SubscriptionRequestCode.Subscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode#Unsubscribe
 * SubscriptionRequestCode.Unsubscribe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code
 * SubscriptionRequest1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionRequestCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of subscription to market data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SNAP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SubscriptionRequestCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the request is to subscribe to snapshots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode
	 * SubscriptionRequestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNAP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Snapshot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the request is to subscribe to snapshots."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequestCode Snapshot = new SubscriptionRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Snapshot";
			definition = "Specifies that the request is to subscribe to snapshots.";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequestCode.mmObject();
			codeName = "SNAP";
		}
	};
	/**
	 * Specifies that the request is to subscribe to snapshots and updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode
	 * SubscriptionRequestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the request is to subscribe to snapshots and updates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequestCode Subscribe = new SubscriptionRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscribe";
			definition = "Specifies that the request is to subscribe to snapshots and updates.";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequestCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Specifies that the request is to disable the previous snapshot
	 * subscription and to update the request (unsubscribe).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode
	 * SubscriptionRequestCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the request is to disable the previous snapshot subscription and to update the request (unsubscribe)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequestCode Unsubscribe = new SubscriptionRequestCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsubscribe";
			definition = "Specifies that the request is to disable the previous snapshot subscription and to update the request (unsubscribe).";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequestCode.mmObject();
			codeName = "UNSU";
		}
	};
	final static private LinkedHashMap<String, SubscriptionRequestCode> codesByName = new LinkedHashMap<>();

	protected SubscriptionRequestCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SNAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionRequestCode";
				definition = "Type of subscription to market data.";
				derivation_lazy = () -> Arrays.asList(SubscriptionRequest1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SubscriptionRequestCode.Snapshot, com.tools20022.repository.codeset.SubscriptionRequestCode.Subscribe,
						com.tools20022.repository.codeset.SubscriptionRequestCode.Unsubscribe);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Snapshot.getCodeName().get(), Snapshot);
		codesByName.put(Subscribe.getCodeName().get(), Subscribe);
		codesByName.put(Unsubscribe.getCodeName().get(), Unsubscribe);
	}

	public static SubscriptionRequestCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SubscriptionRequestCode[] values() {
		SubscriptionRequestCode[] values = new SubscriptionRequestCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SubscriptionRequestCode> {
		@Override
		public SubscriptionRequestCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SubscriptionRequestCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}