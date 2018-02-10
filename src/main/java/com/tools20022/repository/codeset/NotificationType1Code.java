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
import com.tools20022.repository.codeset.NotificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which type of action a user must take or is prevented to take.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationType1Code#MustWithdrawFromTransaction
 * NotificationType1Code.MustWithdrawFromTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationType1Code#CannotSubmitDataSet
 * NotificationType1Code.CannotSubmitDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NotificationTypeCode
 * NotificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MWFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which type of action a user must take or is prevented to take."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NotificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationType1Code
	 * NotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MustWithdrawFromTransaction"</li>
	 * </ul>
	 */
	public static final NotificationType1Code MustWithdrawFromTransaction = new NotificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MustWithdrawFromTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationType1Code.mmObject();
			codeName = NotificationTypeCode.MustWithdrawFromTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationType1Code
	 * NotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CannotSubmitDataSet"</li>
	 * </ul>
	 */
	public static final NotificationType1Code CannotSubmitDataSet = new NotificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CannotSubmitDataSet";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationType1Code.mmObject();
			codeName = NotificationTypeCode.CannotSubmitDataSet.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NotificationType1Code> codesByName = new LinkedHashMap<>();

	protected NotificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MWFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationType1Code";
				definition = "Specifies which type of action a user must take or is prevented to take.";
				trace_lazy = () -> NotificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationType1Code.MustWithdrawFromTransaction, com.tools20022.repository.codeset.NotificationType1Code.CannotSubmitDataSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MustWithdrawFromTransaction.getCodeName().get(), MustWithdrawFromTransaction);
		codesByName.put(CannotSubmitDataSet.getCodeName().get(), CannotSubmitDataSet);
	}

	public static NotificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NotificationType1Code[] values() {
		NotificationType1Code[] values = new NotificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NotificationType1Code> {
		@Override
		public NotificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NotificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}