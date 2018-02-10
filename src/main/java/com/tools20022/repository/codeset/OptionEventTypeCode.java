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
import com.tools20022.repository.codeset.OptionEventTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of event for an option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#CloseOut
 * OptionEventTypeCode.CloseOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#FirstConfirmation
 * OptionEventTypeCode.FirstConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#KnockIn
 * OptionEventTypeCode.KnockIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#KnockOut
 * OptionEventTypeCode.KnockOut}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#Other
 * OptionEventTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode#Trigger
 * OptionEventTypeCode.Trigger}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionEventType1Code
 * OptionEventType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionEventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of event for an option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionEventTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notice of a close out of the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice of a close out of the position."</li>
	 * </ul>
	 */
	public static final OptionEventTypeCode CloseOut = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseOut";
			definition = "Notice of a close out of the position.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "CLST";
		}
	};
	/**
	 * First confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First confirmation."</li>
	 * </ul>
	 */
	public static final OptionEventTypeCode FirstConfirmation = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstConfirmation";
			definition = "First confirmation.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "CONF";
		}
	};
	/**
	 * Notice of a knock-in. The option has a specified spot level, which, if
	 * touched during the knock-in period, triggers the option into existence.
	 * Prior to that level being touched, no option exists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KNIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notice of a knock-in. The option has a specified spot level, which, if touched during the knock-in period, triggers the option into existence. Prior to that level being touched, no option exists."
	 * </li>
	 * </ul>
	 */
	public static final OptionEventTypeCode KnockIn = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockIn";
			definition = "Notice of a knock-in. The option has a specified spot level, which, if touched during the knock-in period, triggers the option into existence. Prior to that level being touched, no option exists.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "KNIN";
		}
	};
	/**
	 * Notice of a knock-out. The option has a specified spot level, which, if
	 * touched during the knock-out period, terminates the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KNOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notice of a knock-out. The option has a specified spot level, which, if touched during the knock-out period, terminates the option."
	 * </li>
	 * </ul>
	 */
	public static final OptionEventTypeCode KnockOut = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockOut";
			definition = "Notice of a knock-out. The option has a specified spot level, which, if touched during the knock-out period, terminates the option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "KNOC";
		}
	};
	/**
	 * Another type of event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of event."</li>
	 * </ul>
	 */
	public static final OptionEventTypeCode Other = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Another type of event.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Notice of a trigger hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionEventTypeCode
	 * OptionEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice of a trigger hit."</li>
	 * </ul>
	 */
	public static final OptionEventTypeCode Trigger = new OptionEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trigger";
			definition = "Notice of a trigger hit.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionEventTypeCode.mmObject();
			codeName = "TRIG";
		}
	};
	final static private LinkedHashMap<String, OptionEventTypeCode> codesByName = new LinkedHashMap<>();

	protected OptionEventTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OptionEventTypeCode";
				definition = "Specifies the type of event for an option.";
				derivation_lazy = () -> Arrays.asList(OptionEventType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionEventTypeCode.CloseOut, com.tools20022.repository.codeset.OptionEventTypeCode.FirstConfirmation,
						com.tools20022.repository.codeset.OptionEventTypeCode.KnockIn, com.tools20022.repository.codeset.OptionEventTypeCode.KnockOut, com.tools20022.repository.codeset.OptionEventTypeCode.Other,
						com.tools20022.repository.codeset.OptionEventTypeCode.Trigger);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CloseOut.getCodeName().get(), CloseOut);
		codesByName.put(FirstConfirmation.getCodeName().get(), FirstConfirmation);
		codesByName.put(KnockIn.getCodeName().get(), KnockIn);
		codesByName.put(KnockOut.getCodeName().get(), KnockOut);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Trigger.getCodeName().get(), Trigger);
	}

	public static OptionEventTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionEventTypeCode[] values() {
		OptionEventTypeCode[] values = new OptionEventTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionEventTypeCode> {
		@Override
		public OptionEventTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionEventTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}