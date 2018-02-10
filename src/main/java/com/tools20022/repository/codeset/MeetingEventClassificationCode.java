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
import com.tools20022.repository.codeset.MeetingEventClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information about the originator of the meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#CourtDecision
 * MeetingEventClassificationCode.CourtDecision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#IssuerInitiated
 * MeetingEventClassificationCode.IssuerInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#VotingRightHolderInitiated
 * MeetingEventClassificationCode.VotingRightHolderInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#Annual
 * MeetingEventClassificationCode.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#Ordinary
 * MeetingEventClassificationCode.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode#Class_
 * MeetingEventClassificationCode.Class_}</li>
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
 * <li>"CRTD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingEventClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies information about the originator of the meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingEventClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtDecision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of a legal proceeding."</li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode CourtDecision = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "CourtDecision";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "CRTD";
		}
	};
	/**
	 * Specifies that the meeting is the result of an obligation or a decision
	 * made by the issuer as opposed to voting rights holder initiated, for
	 * example, contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, for example, contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode IssuerInitiated = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "IssuerInitiated";
			definition = "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, for example, contested meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "IINT";
		}
	};
	/**
	 * Specifies that the meeting is the result if a request or an action of a
	 * voting right holder(s), for example, contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightHolderInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result if a request or an action of a voting right holder(s), for example, contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode VotingRightHolderInitiated = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "VotingRightHolderInitiated";
			definition = "Specifies that the meeting is the result if a request or an action of a voting right holder(s), for example, contested meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "VRHI";
		}
	};
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and to elect the board members and the auditors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors."
	 * </li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode Annual = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Annual";
			definition = "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "ANNU";
		}
	};
	/**
	 * Specifies a meeting which is planned in the by-laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a meeting which is planned in the by-laws."</li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode Ordinary = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Ordinary";
			definition = "Specifies a meeting which is planned in the by-laws.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Meeting for holders of a specific type of assets, for example, preferred
	 * shares, bonds, .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingEventClassificationCode
	 * MeetingEventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting for holders of a specific type of assets, for example, preferred shares, bonds, ."
	 * </li>
	 * </ul>
	 */
	public static final MeetingEventClassificationCode Class_ = new MeetingEventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Class";
			definition = "Meeting for holders of a specific type of assets, for example, preferred shares, bonds, .";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingEventClassificationCode.mmObject();
			codeName = "CLAS";
		}
	};
	final static private LinkedHashMap<String, MeetingEventClassificationCode> codesByName = new LinkedHashMap<>();

	protected MeetingEventClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRTD");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "MeetingEventClassificationCode";
				definition = "Specifies information about the originator of the meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingEventClassificationCode.CourtDecision, com.tools20022.repository.codeset.MeetingEventClassificationCode.IssuerInitiated,
						com.tools20022.repository.codeset.MeetingEventClassificationCode.VotingRightHolderInitiated, com.tools20022.repository.codeset.MeetingEventClassificationCode.Annual,
						com.tools20022.repository.codeset.MeetingEventClassificationCode.Ordinary, com.tools20022.repository.codeset.MeetingEventClassificationCode.Class_);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CourtDecision.getCodeName().get(), CourtDecision);
		codesByName.put(IssuerInitiated.getCodeName().get(), IssuerInitiated);
		codesByName.put(VotingRightHolderInitiated.getCodeName().get(), VotingRightHolderInitiated);
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Class_.getCodeName().get(), Class_);
	}

	public static MeetingEventClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingEventClassificationCode[] values() {
		MeetingEventClassificationCode[] values = new MeetingEventClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingEventClassificationCode> {
		@Override
		public MeetingEventClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingEventClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}