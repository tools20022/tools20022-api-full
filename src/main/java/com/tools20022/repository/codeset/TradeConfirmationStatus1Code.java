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
import com.tools20022.repository.codeset.TradeConfirmationStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the status of the confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#AllStatus
 * TradeConfirmationStatus1Code.AllStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#Confirmed
 * TradeConfirmationStatus1Code.Confirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#Disaccord
 * TradeConfirmationStatus1Code.Disaccord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#EmergencyConfirmed
 * TradeConfirmationStatus1Code.EmergencyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#Mismatched
 * TradeConfirmationStatus1Code.Mismatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#SelfConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatus1Code.SelfConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#SelfNotConfirmedAndCouterpartyConfirmed
 * TradeConfirmationStatus1Code.SelfNotConfirmedAndCouterpartyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#SelfNotConfirmedAndCouterpartyNotConfirmed
 * TradeConfirmationStatus1Code.SelfNotConfirmedAndCouterpartyNotConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code#Unconfirmed
 * TradeConfirmationStatus1Code.Unconfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatusCode
 * TradeConfirmationStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeConfirmationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the confirmation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeConfirmationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllStatus"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code AllStatus = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.AllStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code Confirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.Confirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disaccord"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code Disaccord = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disaccord";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.Disaccord.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmergencyConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code EmergencyConfirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergencyConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.EmergencyConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatched"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code Mismatched = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.Mismatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfConfirmedAndCouterpartyNotConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code SelfConfirmedAndCouterpartyNotConfirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConfirmedAndCouterpartyNotConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.SelfConfirmedAndCouterpartyNotConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code SelfNotConfirmedAndCouterpartyConfirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfNotConfirmedAndCouterpartyNotConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code SelfNotConfirmedAndCouterpartyNotConfirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfNotConfirmedAndCouterpartyNotConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.SelfNotConfirmedAndCouterpartyNotConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationStatus1Code Unconfirmed = new TradeConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unconfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationStatus1Code.mmObject();
			codeName = TradeConfirmationStatusCode.Unconfirmed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeConfirmationStatus1Code> codesByName = new LinkedHashMap<>();

	protected TradeConfirmationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeConfirmationStatus1Code";
				definition = "Identifies the status of the confirmation.";
				trace_lazy = () -> TradeConfirmationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeConfirmationStatus1Code.AllStatus, com.tools20022.repository.codeset.TradeConfirmationStatus1Code.Confirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatus1Code.Disaccord, com.tools20022.repository.codeset.TradeConfirmationStatus1Code.EmergencyConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatus1Code.Mismatched, com.tools20022.repository.codeset.TradeConfirmationStatus1Code.SelfConfirmedAndCouterpartyNotConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatus1Code.SelfNotConfirmedAndCouterpartyConfirmed, com.tools20022.repository.codeset.TradeConfirmationStatus1Code.SelfNotConfirmedAndCouterpartyNotConfirmed,
						com.tools20022.repository.codeset.TradeConfirmationStatus1Code.Unconfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllStatus.getCodeName().get(), AllStatus);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(Disaccord.getCodeName().get(), Disaccord);
		codesByName.put(EmergencyConfirmed.getCodeName().get(), EmergencyConfirmed);
		codesByName.put(Mismatched.getCodeName().get(), Mismatched);
		codesByName.put(SelfConfirmedAndCouterpartyNotConfirmed.getCodeName().get(), SelfConfirmedAndCouterpartyNotConfirmed);
		codesByName.put(SelfNotConfirmedAndCouterpartyConfirmed.getCodeName().get(), SelfNotConfirmedAndCouterpartyConfirmed);
		codesByName.put(SelfNotConfirmedAndCouterpartyNotConfirmed.getCodeName().get(), SelfNotConfirmedAndCouterpartyNotConfirmed);
		codesByName.put(Unconfirmed.getCodeName().get(), Unconfirmed);
	}

	public static TradeConfirmationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeConfirmationStatus1Code[] values() {
		TradeConfirmationStatus1Code[] values = new TradeConfirmationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeConfirmationStatus1Code> {
		@Override
		public TradeConfirmationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeConfirmationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}