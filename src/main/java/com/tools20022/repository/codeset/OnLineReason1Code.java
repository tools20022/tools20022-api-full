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
import com.tools20022.repository.codeset.OnLineReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason to process an online authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#RandomSelection
 * OnLineReason1Code.RandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#ICCForced
 * OnLineReason1Code.ICCForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#MerchantForced
 * OnLineReason1Code.MerchantForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#TerminalForced
 * OnLineReason1Code.TerminalForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#IssuerForced
 * OnLineReason1Code.IssuerForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#FloorLimit
 * OnLineReason1Code.FloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#ExceptionFile
 * OnLineReason1Code.ExceptionFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#TotalAmount
 * OnLineReason1Code.TotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#ControlledBIN
 * OnLineReason1Code.ControlledBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#UnknownBIN
 * OnLineReason1Code.UnknownBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#ControlledPAN
 * OnLineReason1Code.ControlledPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#FlowControl
 * OnLineReason1Code.FlowControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code#UnavailableCurrency
 * OnLineReason1Code.UnavailableCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OnLineReasonCode
 * OnLineReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OnLineReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to process an online authorisation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RNDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OnLineReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code RandomSelection = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RandomSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.RandomSelection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code ICCForced = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCForced";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.ICCForced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code MerchantForced = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantForced";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.MerchantForced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code TerminalForced = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalForced";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.TerminalForced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code IssuerForced = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerForced";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.IssuerForced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code FloorLimit = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.FloorLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code ExceptionFile = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionFile";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.ExceptionFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code TotalAmount = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.TotalAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code ControlledBIN = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlledBIN";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.ControlledBIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code UnknownBIN = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownBIN";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.UnknownBIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code ControlledPAN = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlledPAN";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.ControlledPAN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code FlowControl = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlowControl";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.FlowControl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OnLineReason1Code UnavailableCurrency = new OnLineReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.OnLineReason1Code.mmObject();
			codeName = OnLineReasonCode.UnavailableCurrency.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OnLineReason1Code> codesByName = new LinkedHashMap<>();

	protected OnLineReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RNDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineReason1Code";
				definition = "Reason to process an online authorisation.";
				trace_lazy = () -> OnLineReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OnLineReason1Code.RandomSelection, com.tools20022.repository.codeset.OnLineReason1Code.ICCForced,
						com.tools20022.repository.codeset.OnLineReason1Code.MerchantForced, com.tools20022.repository.codeset.OnLineReason1Code.TerminalForced, com.tools20022.repository.codeset.OnLineReason1Code.IssuerForced,
						com.tools20022.repository.codeset.OnLineReason1Code.FloorLimit, com.tools20022.repository.codeset.OnLineReason1Code.ExceptionFile, com.tools20022.repository.codeset.OnLineReason1Code.TotalAmount,
						com.tools20022.repository.codeset.OnLineReason1Code.ControlledBIN, com.tools20022.repository.codeset.OnLineReason1Code.UnknownBIN, com.tools20022.repository.codeset.OnLineReason1Code.ControlledPAN,
						com.tools20022.repository.codeset.OnLineReason1Code.FlowControl, com.tools20022.repository.codeset.OnLineReason1Code.UnavailableCurrency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RandomSelection.getCodeName().get(), RandomSelection);
		codesByName.put(ICCForced.getCodeName().get(), ICCForced);
		codesByName.put(MerchantForced.getCodeName().get(), MerchantForced);
		codesByName.put(TerminalForced.getCodeName().get(), TerminalForced);
		codesByName.put(IssuerForced.getCodeName().get(), IssuerForced);
		codesByName.put(FloorLimit.getCodeName().get(), FloorLimit);
		codesByName.put(ExceptionFile.getCodeName().get(), ExceptionFile);
		codesByName.put(TotalAmount.getCodeName().get(), TotalAmount);
		codesByName.put(ControlledBIN.getCodeName().get(), ControlledBIN);
		codesByName.put(UnknownBIN.getCodeName().get(), UnknownBIN);
		codesByName.put(ControlledPAN.getCodeName().get(), ControlledPAN);
		codesByName.put(FlowControl.getCodeName().get(), FlowControl);
		codesByName.put(UnavailableCurrency.getCodeName().get(), UnavailableCurrency);
	}

	public static OnLineReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OnLineReason1Code[] values() {
		OnLineReason1Code[] values = new OnLineReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OnLineReason1Code> {
		@Override
		public OnLineReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OnLineReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}