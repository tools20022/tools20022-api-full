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
import com.tools20022.repository.codeset.Appearance1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the deliverability of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Appearance1Code#Deliverable
 * Appearance1Code.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Appearance1Code#NotDeliverable
 * Appearance1Code.NotDeliverable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Appearance1Code#Limited
 * Appearance1Code.Limited}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Appearance1Code#BookEntry
 * Appearance1Code.BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Appearance1Code#DeferredBookEntry
 * Appearance1Code.DeferredBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Appearance1Code#DeliverableBookEntry
 * Appearance1Code.DeliverableBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Appearance1Code#TemporaryGlobal
 * Appearance1Code.TemporaryGlobal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Appearance1Code#Global
 * Appearance1Code.Global}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AppearanceCode AppearanceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DELI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Appearance1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the deliverability of a security."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Appearance1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * </ul>
	 */
	public static final Appearance1Code Deliverable = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.Deliverable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDeliverable"</li>
	 * </ul>
	 */
	public static final Appearance1Code NotDeliverable = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDeliverable";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.NotDeliverable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limited"</li>
	 * </ul>
	 */
	public static final Appearance1Code Limited = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limited";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.Limited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntry"</li>
	 * </ul>
	 */
	public static final Appearance1Code BookEntry = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookEntry";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.BookEntry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredBookEntry"</li>
	 * </ul>
	 */
	public static final Appearance1Code DeferredBookEntry = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredBookEntry";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.DeferredBookEntry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverableBookEntry"</li>
	 * </ul>
	 */
	public static final Appearance1Code DeliverableBookEntry = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverableBookEntry";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.DeliverableBookEntry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryGlobal"</li>
	 * </ul>
	 */
	public static final Appearance1Code TemporaryGlobal = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryGlobal";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.TemporaryGlobal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * </ul>
	 */
	public static final Appearance1Code Global = new Appearance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			owner_lazy = () -> com.tools20022.repository.codeset.Appearance1Code.mmObject();
			codeName = AppearanceCode.Global.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Appearance1Code> codesByName = new LinkedHashMap<>();

	protected Appearance1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DELI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Appearance1Code";
				definition = "Specifies the deliverability of a security.";
				trace_lazy = () -> AppearanceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Appearance1Code.Deliverable, com.tools20022.repository.codeset.Appearance1Code.NotDeliverable, com.tools20022.repository.codeset.Appearance1Code.Limited,
						com.tools20022.repository.codeset.Appearance1Code.BookEntry, com.tools20022.repository.codeset.Appearance1Code.DeferredBookEntry, com.tools20022.repository.codeset.Appearance1Code.DeliverableBookEntry,
						com.tools20022.repository.codeset.Appearance1Code.TemporaryGlobal, com.tools20022.repository.codeset.Appearance1Code.Global);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(NotDeliverable.getCodeName().get(), NotDeliverable);
		codesByName.put(Limited.getCodeName().get(), Limited);
		codesByName.put(BookEntry.getCodeName().get(), BookEntry);
		codesByName.put(DeferredBookEntry.getCodeName().get(), DeferredBookEntry);
		codesByName.put(DeliverableBookEntry.getCodeName().get(), DeliverableBookEntry);
		codesByName.put(TemporaryGlobal.getCodeName().get(), TemporaryGlobal);
		codesByName.put(Global.getCodeName().get(), Global);
	}

	public static Appearance1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Appearance1Code[] values() {
		Appearance1Code[] values = new Appearance1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Appearance1Code> {
		@Override
		public Appearance1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Appearance1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}