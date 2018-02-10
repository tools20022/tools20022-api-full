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
import com.tools20022.repository.codeset.CardServiceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of administrative service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#CheckPoint
 * CardServiceTypeCode.CheckPoint}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#Final
 * CardServiceTypeCode.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#TotalInquiry
 * CardServiceTypeCode.TotalInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#DisableStoreForward
 * CardServiceTypeCode.DisableStoreForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#EchoTest
 * CardServiceTypeCode.EchoTest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#EnableStoreForward
 * CardServiceTypeCode.EnableStoreForward}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#SignOn
 * CardServiceTypeCode.SignOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#SignOff
 * CardServiceTypeCode.SignOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#KeyChange
 * CardServiceTypeCode.KeyChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#DeliverKey
 * CardServiceTypeCode.DeliverKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode#KeyVerification
 * CardServiceTypeCode.KeyVerification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType2Code
 * CardServiceType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType1Code
 * CardServiceType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardServiceType3Code
 * CardServiceType3Code}</li>
 * </ul>
 * </li>
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
 * "CardServiceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of administrative service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardServiceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Partial reconciliation of the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial reconciliation of the day."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode CheckPoint = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckPoint";
			definition = "Partial reconciliation of the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Final reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final reconciliation."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode Final = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Final reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Request for totals of a previous reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for totals of a previous reconciliation."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode TotalInquiry = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInquiry";
			definition = "Request for totals of a previous reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "PRVS";
		}
	};
	/**
	 * Close communication at application level to stop store and forward
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisableStoreForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Close communication at application level to stop store and forward process."
	 * </li>
	 * </ul>
	 */
	public static final CardServiceTypeCode DisableStoreForward = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisableStoreForward";
			definition = "Close communication at application level to stop store and forward process.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "SFDS";
		}
	};
	/**
	 * Detection whether communication at application level is still active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EchoTest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detection whether communication at application level is still active."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode EchoTest = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EchoTest";
			definition = "Detection whether communication at application level is still active.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "ECHO";
		}
	};
	/**
	 * Establish communication at application level to start store and forward
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnableStoreForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Establish communication at application level to start store and forward process."
	 * </li>
	 * </ul>
	 */
	public static final CardServiceTypeCode EnableStoreForward = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnableStoreForward";
			definition = "Establish communication at application level to start store and forward process.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "SFEN";
		}
	};
	/**
	 * Establish communication at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGNN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Establish communication at application level."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode SignOn = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOn";
			definition = "Establish communication at application level.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "SGNN";
		}
	};
	/**
	 * Terminate communication at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGNF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminate communication at application level."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode SignOff = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignOff";
			definition = "Terminate communication at application level.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "SGNF";
		}
	};
	/**
	 * Request the keys that the receiver must send in the response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request the keys that the receiver must send in the response."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode KeyChange = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyChange";
			definition = "Request the keys that the receiver must send in the response.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "KYCG";
		}
	};
	/**
	 * Deliver the key to be change by the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deliver the key to be change by the receiver."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode DeliverKey = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverKey";
			definition = "Deliver the key to be change by the receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "KYDL";
		}
	};
	/**
	 * Request the receiver to verify the key check value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceTypeCode
	 * CardServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request the receiver to verify the key check value."</li>
	 * </ul>
	 */
	public static final CardServiceTypeCode KeyVerification = new CardServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyVerification";
			definition = "Request the receiver to verify the key check value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CardServiceTypeCode.mmObject();
			codeName = "KYVF";
		}
	};
	final static private LinkedHashMap<String, CardServiceTypeCode> codesByName = new LinkedHashMap<>();

	protected CardServiceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardServiceTypeCode";
				definition = "Type of administrative service.";
				derivation_lazy = () -> Arrays.asList(CardServiceType2Code.mmObject(), CardServiceType1Code.mmObject(), CardServiceType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardServiceTypeCode.CheckPoint, com.tools20022.repository.codeset.CardServiceTypeCode.Final,
						com.tools20022.repository.codeset.CardServiceTypeCode.TotalInquiry, com.tools20022.repository.codeset.CardServiceTypeCode.DisableStoreForward, com.tools20022.repository.codeset.CardServiceTypeCode.EchoTest,
						com.tools20022.repository.codeset.CardServiceTypeCode.EnableStoreForward, com.tools20022.repository.codeset.CardServiceTypeCode.SignOn, com.tools20022.repository.codeset.CardServiceTypeCode.SignOff,
						com.tools20022.repository.codeset.CardServiceTypeCode.KeyChange, com.tools20022.repository.codeset.CardServiceTypeCode.DeliverKey, com.tools20022.repository.codeset.CardServiceTypeCode.KeyVerification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CheckPoint.getCodeName().get(), CheckPoint);
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(TotalInquiry.getCodeName().get(), TotalInquiry);
		codesByName.put(DisableStoreForward.getCodeName().get(), DisableStoreForward);
		codesByName.put(EchoTest.getCodeName().get(), EchoTest);
		codesByName.put(EnableStoreForward.getCodeName().get(), EnableStoreForward);
		codesByName.put(SignOn.getCodeName().get(), SignOn);
		codesByName.put(SignOff.getCodeName().get(), SignOff);
		codesByName.put(KeyChange.getCodeName().get(), KeyChange);
		codesByName.put(DeliverKey.getCodeName().get(), DeliverKey);
		codesByName.put(KeyVerification.getCodeName().get(), KeyVerification);
	}

	public static CardServiceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardServiceTypeCode[] values() {
		CardServiceTypeCode[] values = new CardServiceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardServiceTypeCode> {
		@Override
		public CardServiceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardServiceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}